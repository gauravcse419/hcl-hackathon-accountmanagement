package com.hcl.hackathon.accountmanagement.service.impl;

import com.hcl.hackathon.accountmanagement.model.AccountDetailVO;
import com.hcl.hackathon.accountmanagement.model.AccountResponseVO;
import com.hcl.hackathon.accountmanagement.model.ApplicantDetails;
import com.hcl.hackathon.accountmanagement.service.AccountService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public AccountResponseVO createAccount(AccountDetailVO accountDetailVO) {

        accountDetailVO.getApplicantDetails().forEach(applicant->{
            int age = this.getAgeofApplicant(applicant);

            if (age>=18) {



            }
        });


        return null;
    }

    private int getAgeofApplicant(ApplicantDetails applicant) {
        //Converting String to Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = formatter.parse(applicant.getDob());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        //Calculating the difference between given date to current date.
        Period period = Period.between(givenDate, LocalDate.now());
       return period.getYears();
    }
}
