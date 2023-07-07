package com.example.FrootServer.repository;


import com.example.FrootServer.entity.Money;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoneyRepository extends JpaRepository<Money, Long> {
    //Optional<Money> findByEmail(String email);

    //boolean existsByEmail(String email);
}
