package com.sujan.demo;

public record OrderRecord(
        String customerName,
        int transactionId,
        int amount
) {
}
