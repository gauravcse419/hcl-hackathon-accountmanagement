package com.hcl.hackathon.accountmanagement.MockUtil;

import com.hcl.hackathon.accountmanagement.model.AccountResponseVO;

public class MockData {

    public static AccountResponseVO getAccountResponse() {
        AccountResponseVO accountResponseVO = new AccountResponseVO();
        accountResponseVO.setAccountNo("12345");
        accountResponseVO.setMortgageNo("MORT1234");
        accountResponseVO.setUserId("12");

        return accountResponseVO;
    }
}
