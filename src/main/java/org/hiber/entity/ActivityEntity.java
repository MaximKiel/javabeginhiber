package org.hiber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "activity", schema = "todolist", catalog = "javabeginhiber")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
    private boolean activated;

    @Column(updatable = false)
    private String uuid;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserDataEntity user;
}
