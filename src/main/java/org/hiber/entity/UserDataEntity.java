package org.hiber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
}
