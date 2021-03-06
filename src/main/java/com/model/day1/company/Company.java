package com.model.day1.company;

import lombok.*;

import java.util.List;

// @Data // Getter,Setter,RequiredArgsConstrustor ToString Equals Hashcode
@Setter
@Getter
@ToString//(exclude = {"purchaselist"})
@AllArgsConstructor
public class Company {
    private String name; // nazwa firmy
    @ToString.Exclude
    private String cityHeadquarters; // siedziba firmy
    @ToString.Exclude
    private int employees; // ilość pracowników
    @ToString.Exclude
    private List<Purchase> purchaseList; // lista zakupów wykonanych przez firmę (co firma kupiła)
}

