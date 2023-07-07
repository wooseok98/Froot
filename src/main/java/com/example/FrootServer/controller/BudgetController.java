package com.example.FrootServer.controller;

import com.example.FrootServer.dto.MemberResponseDto;
import com.example.FrootServer.dto.MoneyDto;
import com.example.FrootServer.dto.TokenDto;
import com.example.FrootServer.dto.TokenRequestDto;
import com.example.FrootServer.entity.Member;
import com.example.FrootServer.entity.Money;
import com.example.FrootServer.jwt.TokenProvider;
import com.example.FrootServer.repository.MemberRepository;
import com.example.FrootServer.repository.MoneyRepository;
import com.example.FrootServer.repository.RefreshTokenRepository;
import com.example.FrootServer.util.SecurityUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BudgetController {
    private final MoneyRepository moneyRepository;
    private final MemberRepository memberRepository;



    @PostMapping("/money")
    public String money(@RequestBody MoneyDto moneyDto){
        Money getmoney=moneyDto.toMoney();

       System.out.println("값: "+SecurityUtil.getEmail());


        moneyRepository.save(getmoney);





        return "good";
    }
}
