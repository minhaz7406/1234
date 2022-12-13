package com.registration.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name", length = 45, nullable = false)
	private String firstname;
	@Column(name = "last_name", length = 45, nullable = false)
	private String lastname;
	@Column(name = "user_name", length = 120, nullable = false)
	private String username;
	@Column(name = "email", length = 128, nullable = false, unique = true)
	private String email;
	@Column(name = "d_o_b", nullable = false)
	private String dateOfBirth;
	
}
