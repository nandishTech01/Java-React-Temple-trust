package com.livewebsite.LiveDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Setter
@Getter
public class Customer {

	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
}
