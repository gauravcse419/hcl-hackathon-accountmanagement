package com.hcl.hackathon.accountmanagement.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the account_info database table.
 * 
 */
@Entity
@Table(name="account_info")
@NamedQuery(name="AccountInfo.findAll", query="SELECT a FROM AccountInfo a")
@Data
public class AccountInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_id")
	private Long accountId;

	@Column(name="account_no")
	private String accountNo;

	@Column(name="account_status")
	private String accountStatus;

	private BigDecimal balance;

	private Timestamp date;

	//bi-directional many-to-one association to AccountType
	@ManyToOne
	@JoinColumn(name="account_type_id")
	private AccountType accountType;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserDetail userDetail;

	//bi-directional many-to-many association to UserDetail
	@ManyToMany(mappedBy="accountInfos2")
	private List<UserDetail> userDetails;

	//bi-directional many-to-one association to TransactionDetail
	@OneToMany(mappedBy="accountInfo")
	private List<TransactionDetail> transactionDetails;


}