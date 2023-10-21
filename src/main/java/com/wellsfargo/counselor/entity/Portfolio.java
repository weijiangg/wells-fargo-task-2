package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private Long Quantity;

    @Column(nullable = false)
    private Short Date;

    private Client client;
    protected Portfolio() {

    }

    public Portfolio(String Name, Long Quantity, Short Date, Client client) {
        this.Name = Name;
        this.Quantity = Quantity;
        this.Date = Date;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        this.Quantity = quantity;
    }

    public Short getDate() {
        return Date;
    }

    public void setDate(Short date) {
        this.Date = date;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getClientId(){
        return client.getClientId();
    }
}