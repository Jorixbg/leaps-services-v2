package com.leaps.services.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Column(name = "user_id")
    @Id
    private Long userId;

    private String username;

    private String password;

    @Column(name = "email_address")
    private String emailAddress;
}
