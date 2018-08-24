package com.ikman.poc.balance.repo;

import com.ikman.poc.balance.entity.Account;
import com.ikman.poc.balance.entity.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long> {
}
