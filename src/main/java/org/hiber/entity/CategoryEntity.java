package org.hiber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "todolist", catalog = "javabeginhiber")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @Column(name = "completed_count", nullable = false)
    private Long completedCount;

    @Column(name = "uncompleted_count", nullable = false)
    private Long uncompletedCount;

//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private UserDataEntity user;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<TaskEntity> tasks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
