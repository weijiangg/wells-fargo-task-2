package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private Integer Price;
    @Column(nullable = false)
    private Long Quantity;
    @Column(nullable = false)
    private String Category;

    private Portfolio portfolio;
    protected Security() {

    }

    public Security(String Name, Integer Price, Long Quantity,String Category, Portfolio Portfolio) {
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Category = Category;
        this.portfolio = Portfolio;
    }


    public String getName() {
        return Name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setName(Integer Price){
        this.Price = Price;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Long getPortfolioId() {
        return portfolio.getPortfolioId();
    }
}