package ru.assisttech.sdk.engine;

import androidx.annotation.NonNull;

public enum PaymentTokenType {

    GOOGLE_PAY("2"),
    SAMSUNT_PAY("3");

    PaymentTokenType(String value) {
        this.value = value;
    }

    private String value;

    @NonNull
    @Override
    public String toString() {
        return value;
    }
}
