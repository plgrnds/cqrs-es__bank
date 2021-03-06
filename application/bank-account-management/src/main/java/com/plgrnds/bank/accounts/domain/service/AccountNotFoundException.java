package com.plgrnds.bank.accounts.domain.service;

import java.util.UUID;

import static java.lang.String.format;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(UUID id) {
        super(format("Account with id '%s' could not be found", id));
    }
}
