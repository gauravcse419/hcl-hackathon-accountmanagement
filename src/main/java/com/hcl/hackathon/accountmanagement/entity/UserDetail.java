package com.hcl.hackathon.accountmanagement.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the user_detail database table.
 * 
 */
@Entity
@Table(name="user_detail")
@NamedQuery(name="UserDetail.findAll", query="SELECT u FROM UserDetail u")
@Data
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer userId;

	private String contact;

	private Timestamp dob;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String tittle;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_password")
	private String userPassword;

	//bi-directional many-to-one association to AccountInfo
	@OneToMany(mappedBy="userDetail")
	private List<AccountInfo> accountInfos1;

	//bi-directional many-to-many association to AccountInfo
	@ManyToMany
	@JoinTable(
		name="account_info_has_user_detail"
		, joinColumns={
			@JoinColumn(name="user_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="account_id")
			}
		)
	private List<AccountInfo> accountInfos2;

	//bi-directional many-to-one association to EmploymentDetail
	@OneToMany(mappedBy="userDetail")
	private List<EmploymentDetail> employmentDetails;

	public UserDetail() {
	}


}