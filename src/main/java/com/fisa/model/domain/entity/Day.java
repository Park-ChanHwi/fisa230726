package com.fisa.model.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name = "myday2")
public class Day {
	@Id
	private int dayno;
	private String dayname;
	@Override
	public String toString() {
		return "Day" + dayno + " : " + dayname;
	}
}
