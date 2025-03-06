
package Model;

public class Mathema {

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
		//this.per = per/100;
		
	   //double numNPer=this.per;
	  // double numNPer=1-this.per;
	   
	   
	  //this.setNPer(numNPer);
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

		//String trueanswer=String.format("%.2f", answer);
		//return this.answer;

		return String.format("%.2f", this.answer);

	}
}
