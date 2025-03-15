package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data

public class Mathema_spring {
	private double per, nper;

	private int win, charange;

	double answer;

	public void setPer(double per) {

		this.per = per / 100;

	}

	public void setNPer(double nper) {

		this.nper = nper;
	}

	public double getNPer() {

		return nper;

	}

	public String getAnswer() {

		return String.format("%.3f", this.answer);

	}
}
