package com.fastcampus.jpa.bookmanger.domain;

import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data
/*
* @Getter , @Setter , @ToString, @EqualsAndHashCode , @RequiredArgsConstructor를 자동으로 적용
*/
@AllArgsConstructor
@NoArgsConstructor
/* @RequiredArgsConstructor
* final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성
* 해당 내용이 없을 경우 NoArgsConstructor와 동일한 기능을 한다.
* final이 붙일 경우 Autowired 대신 의존성 주입이 가능하다.
*
* @EqualsAndHashCode
* equals, hashCode 자동 생성
* equals :  두 객체의 내용이 같은지, 동등성(equality) 를 비교하는 연산자
* hashCode : 두 객체가 같은 객체인지, 동일성(identity) 를 비교하는 연산자
*/
public class User {
    @NonNull//필수값
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
