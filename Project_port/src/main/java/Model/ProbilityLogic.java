package Model;

public class ProbilityLogic {
	public double probility(int n ,int r) {

		double ans = 1;
		double answer;
	
		for (int i = n; i > n - r; --i) {

			ans = ans * i;//分子階乗

		}
		for (int i = 1; i < r + 1; ++i) {

			ans = ans / i;//分母階乗

		}

		double result = Math.pow(0.05, r);
		double result2 = Math.pow(0.95, n - r);

		answer = 100 * (result2 * result * ans);
		
		
		return answer;
		
		//return answer;
		//System.out.println("ないぶ"+ans);

	}

	public  void probilityAtLeast(Mathema math) {

		double totalprobility = 0;
		

		int r = math.getWin();

		int n = math.getCharange();


		for (int k = r; k <= n; k++) {

			totalprobility += probility(n, k);//rではない
			
		}
		//System.out.println("計算結果: " + totalprobility);
		math.setAnswer(totalprobility);
		
		

	}

}


