package com.example.FrootServer.repository;

import com.example.FrootServer.entity.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    //@EntityGraph(attributePaths = "authorities")
    //Optional<Member> findOneWithAuthoritiesByemail(String username);
    boolean existsByEmail(String email);
}
