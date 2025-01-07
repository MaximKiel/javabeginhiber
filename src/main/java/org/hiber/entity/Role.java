package org.hiber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role_data", schema = "todolist", catalog = "javabeginhiber")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

//    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
//    private Set<UserDataEntity> users;
}
