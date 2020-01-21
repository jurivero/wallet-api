package com.edureka.wallet.walletapi.api;

import com.edureka.wallet.walletapi.model.PaymentTransactionDto;
import com.edureka.wallet.walletapi.model.WalletDto;


public interface WalletService {

	WalletDto doTransaction(PaymentTransactionDto transaction);

	WalletDto getBalance(String emailId);

}
