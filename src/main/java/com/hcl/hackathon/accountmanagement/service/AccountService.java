package com.hcl.hackathon.accountmanagement.service;

import com.hcl.hackathon.accountmanagement.model.AccountDetailVO;
import com.hcl.hackathon.accountmanagement.model.AccountResponseVO;

public interface AccountService {

    AccountResponseVO createAccount(AccountDetailVO accountDetailVO);
}
