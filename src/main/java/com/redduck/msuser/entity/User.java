package com.redduck.msuser.entity;

import com.redduck.msuser.entity.enums.DependencyEnum;
import com.redduck.msuser.entity.enums.ProfileEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private Boolean status;
    @Enumerated(EnumType.STRING)
    private DependencyEnum dependency;
    @Enumerated(EnumType.STRING)
    private Collection<ProfileEnum> profile;
    private String fila;

    @OneToMany(mappedBy = "user")
    Set<TasksXUser> tasksXUsers;
}
