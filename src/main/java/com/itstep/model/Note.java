package com.itstep.model;




import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//get, set, equals, hashCode, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String message;
	private LocalDateTime create_date;
	private LocalDateTime last_change_date;
}

