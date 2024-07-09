package com.sujan.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("cust-Name")
    public String customerName;
    @JsonProperty("transaction-Id")
    public int transactionId;
    @JsonProperty("price")
    public int amount;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", transactionId=" + transactionId +
                ", amount=" + amount +
                '}';
    }
}
