package com.hcl.hackathon.accountmanagement.service;

import com.hcl.hackathon.accountmanagement.model.TransactionDetailVO;

public interface AccountManagementService {

    TransactionDetailVO createTransaction(TransactionDetailVO transactionDetailVO);
}
