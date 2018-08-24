package com.ikman.poc.balance.entity;

import com.ikman.poc.balance.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Recharge extends BaseEntity {

    @ManyToOne
    private Account relatedAccount;


}
