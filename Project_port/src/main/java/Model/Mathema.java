
package Model;

public class Mathema {

	private int per, nper;

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

	public int getPer() {

		return per;

	}

	public void setPer(int per) {

		this.per = per;
	}

	public double getNPer() {

		return nper;

	}

	public void setNPer(int nper) {

		this.nper = nper;
	}



	public void setAnswer(double answer) {
		this.answer = answer;

	}

	public String getAnswer() {


		return String.format("%.2f", this.answer);

	}
}
