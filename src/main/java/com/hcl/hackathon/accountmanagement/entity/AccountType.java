package com.hcl.hackathon.accountmanagement.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the account_type database table.
 * 
 */
@Entity
@Table(name="account_type")
@NamedQuery(name="AccountType.findAll", query="SELECT a FROM AccountType a")
@Data
public class AccountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_type_id")
	private Integer accountTypeId;

	@Column(name="account_type")
	private String accountType;

	//bi-directional many-to-one association to AccountInfo
	@OneToMany(mappedBy="accountType")
	private List<AccountInfo> accountInfos;

	
}