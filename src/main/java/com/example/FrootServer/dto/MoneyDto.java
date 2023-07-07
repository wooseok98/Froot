package com.example.FrootServer.dto;


import com.example.FrootServer.entity.Member;
import com.example.FrootServer.entity.Money;
import com.example.FrootServer.util.SecurityUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.Table;


@AllArgsConstructor
@Getter
@NoArgsConstructor
@Table(name = "money")
public class MoneyDto {

    private String money;
    private String output;
    private String input;




    public Money toMoney() {
        return Money.builder()
                .money(money)
                .output(output)
                .input(input)
                .build();
    }



}
