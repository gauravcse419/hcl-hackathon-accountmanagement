package com.hcl.hackathon.accountmanagement.service.impl;

import com.hcl.hackathon.accountmanagement.model.TransactionDetailVO;
import com.hcl.hackathon.accountmanagement.service.AccountManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountManagementServiceImpl implements AccountManagementService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public TransactionDetailVO createTransaction(TransactionDetailVO transactionDetailVO) {
        this.logger.info("createTransaction: {}",transactionDetailVO);
        return null;
    }

}
