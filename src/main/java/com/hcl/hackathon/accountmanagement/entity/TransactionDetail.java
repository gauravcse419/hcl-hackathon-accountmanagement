package com.hcl.hackathon.accountmanagement.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the transaction_detail database table.
 * 
 */
@Entity
@Table(name="transaction_detail")
@NamedQuery(name="TransactionDetail.findAll", query="SELECT t FROM TransactionDetail t")
@Data
public class TransactionDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private Integer transactionId;

	@Column(name="account_no")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="balance_amount")
	private BigDecimal balanceAmount;

	private String remark;

	@Column(name="transaction_time")
	private Timestamp transactionTime;

	@Column(name="transaction_type")
	private String transactionType;

	//bi-directional many-to-one association to AccountInfo
	@ManyToOne
	@JoinColumn(name="account_id")
	private AccountInfo accountInfo;

	
}