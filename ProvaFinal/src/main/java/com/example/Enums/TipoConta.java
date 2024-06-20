package com.example.Enums;

public enum TipoConta {

    ADMIN("Administrador"),
    MOD("Gerente"),
    USER("Cliente");

    private final String tipoConta;

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
