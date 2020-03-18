package com.nslearning.authservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "app_user")
public class User {
	
	@Id
	@Column(name ="userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	@Column(name="emailId")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="modifiedBy")
	private String modifiedBy;
	@Column(name="created_at")
	private Date createdDate;
	@Column(name="modified_at")
	private Date modifiedDate;

}
