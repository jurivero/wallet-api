package com.edureka.wallet.walletapi.Impl;

import com.edureka.wallet.walletapi.api.WalletService;
import com.edureka.wallet.walletapi.model.PaymentTransactionDto;
import com.edureka.wallet.walletapi.model.WalletDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

	private static final Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

	@Override
	public WalletDto doTransaction(PaymentTransactionDto transaction) {
		logger.info("Transaction request received = {} ", transaction);
		// Implemented
		return null;
	}

	@Override
	public WalletDto getBalance(String emailId) {
		logger.info("Get Wallet balance request received = {} ", emailId);
		// Implemented
		return null;
	}

}
