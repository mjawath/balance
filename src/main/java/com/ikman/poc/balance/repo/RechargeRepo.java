package com.ikman.poc.balance.repo;

import com.ikman.poc.balance.entity.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RechargeRepo extends JpaRepository<Recharge,Long> {
}
