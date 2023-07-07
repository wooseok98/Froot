package com.example.FrootServer.entity;
import lombok.*;
import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
public class Money {
    @Id
    @Column(name = "money_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String money;
    private String output;
    private String input;




    @Builder
    public Money(String money, String output,String input, Long userId) {
        this.money = money;
        this.output = output;
        this.input = input;
        this.userId = userId;
    }
}
