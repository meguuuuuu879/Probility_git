package com.example.demo.model;

import org.springframework.stereotype.Component;


@Component

public class Mathema_spring {
	private double per, nper;

	private int win, charange;
	
	

	double answer;

	public int getCharange() {

		return charange;

	}

	
	public void setCharange(int charange) {

		this.charange = charange;
	}

	public int getWin() {

		return win;

	}

	public void setWin(int win) {

		this.win = win;
	}

	public double getPer() {

		return per;

	}

	public void setPer(double per) {

		this.per = per/100;
	
	}

	public double getNPer() {

		return nper;

	}

	public void setNPer(double nper) {

		this.nper = nper;
	}



	public void setAnswer(double answer) {
		this.answer = answer;

	}

	public String getAnswer() {

	

		return String.format("%.3f", this.answer);

	}
}
