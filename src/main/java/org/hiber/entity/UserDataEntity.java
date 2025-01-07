package org.hiber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user_data", schema = "todolist", catalog = "javabeginhiber")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDataEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false, length = -1)
    private String email;

    @Column(name = "userpassword", nullable = false, length = -1)
    private String password;

    @Column(name = "username", nullable = false, length = -1)
    private String username;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CategoryEntity> categories;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<PriorityEntity> priorities;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    public ActivityEntity activity;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    public StatEntity stat;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDataEntity that = (UserDataEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
