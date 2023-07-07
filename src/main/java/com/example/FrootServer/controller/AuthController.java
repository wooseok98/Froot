package com.example.FrootServer.controller;

import com.example.FrootServer.dto.MemberRequestDto;
import com.example.FrootServer.dto.MemberResponseDto;
import com.example.FrootServer.dto.TokenDto;
import com.example.FrootServer.dto.TokenRequestDto;
import com.example.FrootServer.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@PostMapping("/check")
//public ResponseEntity<Boolean> check1(@RequestBody String dto){
//
//        if(articleRepository.findByEmail(dto)!=null){
//        log.info("중복되었습니다");
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
//        }
//        else{
//        log.info("중복x");
//        return ResponseEntity.status(HttpStatus.OK).body(true);
//        }
//        }

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<MemberResponseDto> signup(@RequestBody MemberRequestDto memberRequestDto) {
//        if(authService.signup(memberRequestDto)!=null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(authService.signup(memberRequestDto));
//        }
         return ResponseEntity.ok(authService.signup(memberRequestDto));
    }

    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok(authService.login(memberRequestDto));
    }

    @PostMapping("/reissue")
    public ResponseEntity<TokenDto> reissue(@RequestBody TokenRequestDto tokenRequestDto) {
        return ResponseEntity.ok(authService.reissue(tokenRequestDto));
    }
}
