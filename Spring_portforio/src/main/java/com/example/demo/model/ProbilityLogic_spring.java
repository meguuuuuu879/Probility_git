package com.example.demo.model;


public class ProbilityLogic_spring {

	public ProbilityLogic_spring() {
		
	}
		public double probility(int n ,int r,Mathema_spring math) {

			double ans = 1;
			double answer;
		
			for (int i = n; i > n - r; --i) {

				ans = ans * i;//分子階乗

			}
			for (int i = 1; i < r + 1; ++i) {

				ans = ans / i;//分母階乗

			}

			double result = Math.pow(math.getPer(),r);
			double result2 = Math.pow(math.getNPer(), n - r);
			
			//double result = Math.pow(0.05, r);
			//double result2 = Math.pow(0.95, n - r);


			answer = 100 * (result2 * result * ans);
			
			
			return answer;
			
			

		}

		public  void probilityAtLeast(Mathema_spring math) {

			double totalprobility = 0;
			

			int r = math.getWin();

			int n = math.getCharange();


			for (int k = r; k <= n; k++) {

				totalprobility += probility(n, k, math);
				
			}
		
			math.setAnswer(totalprobility);
			
			

		}

	
	//https://github.com/meguuuuuu879/Probility_git/tree/main/Project_port/src/main/webapp


	
	}


