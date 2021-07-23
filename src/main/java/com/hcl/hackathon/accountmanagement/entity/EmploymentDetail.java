package com.hcl.hackathon.accountmanagement.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the employment_detail database table.
 * 
 */
@Entity
@Table(name="employment_detail")
@NamedQuery(name="EmploymentDetail.findAll", query="SELECT e FROM EmploymentDetail e")
@Data
public class 	EmploymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employment_id")
	private Integer employmentId;

	@Column(name="contract_type")
	private String contractType;

	@Column(name="employment_status")
	private String employmentStatus;

	private String occupation;

	@Column(name="start_date")
	private Timestamp startDate;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserDetail userDetail;

	

}