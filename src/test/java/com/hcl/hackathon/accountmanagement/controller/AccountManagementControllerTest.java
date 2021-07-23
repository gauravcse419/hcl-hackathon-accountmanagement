package com.hcl.hackathon.accountmanagement.controller;

import com.hcl.hackathon.accountmanagement.MockUtil.MockData;
import com.hcl.hackathon.accountmanagement.model.AccountResponseVO;
import com.hcl.hackathon.accountmanagement.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountManagementControllerTest.class)
public class AccountManagementControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    AccountService accountService;

    @Test
    public void createOrderAPI() throws Exception {

        AccountResponseVO accountResponse= MockData.getAccountResponse();
        Mockito.doReturn(accountResponse).when(accountService).createAccount(Mockito.any());
        mvc.perform(MockMvcRequestBuilders.post("/api/v1/account")
                .content(asJsonString(OrderTestUtil.getOrderInfoDTO())).contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.orderNo").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.orderStatus").exists());

        verify(orderService).createOrder(Mockito.any());
    }



}
