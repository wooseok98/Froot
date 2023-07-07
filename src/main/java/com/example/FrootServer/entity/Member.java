package com.example.FrootServer.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "member")
@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;
    private String name;
    private String birth;
    private String gen;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public Member(String email, String password,String name,String birth, String gen, Authority authority) {
        this.email = email;
        this.password = password;
        this.authority = authority;
        this.name=name;
        this.birth=birth;
        this.gen=gen;
    }
}
