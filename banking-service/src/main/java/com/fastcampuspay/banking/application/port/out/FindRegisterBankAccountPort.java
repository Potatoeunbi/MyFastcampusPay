package com.fastcampuspay.banking.application.port.out;

import com.fastcampuspay.banking.adapter.out.persistence.RegisteredBankAccountJpaEntity;
import com.fastcampuspay.banking.domain.RegisteredBankAccount;

public interface FindRegisterBankAccountPort {

    RegisteredBankAccountJpaEntity findRegisteredBankAccount(
            RegisteredBankAccount.BankAccountNumber bankAccountNumber
    );
}
