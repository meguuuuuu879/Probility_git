//確率α%(変数:per)のくじをn回(変数:charange)引いた時、r回(変数:win)以上当たる時の確率を求めるアプリ

package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Mathema;
import Model.ProbilityLogic;

@WebServlet("/ProbilityCheck")
public class ProbilityCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ProbilityCheck.jsp");

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String charange = request.getParameter("charange");
		String win = request.getParameter("win");
		Mathema math = new Mathema();
		
	

			try {

			math.setWin(Integer.parseInt(win));
			math.setCharange(Integer.parseInt(charange));

			//if (charange != "" && win != "") {

			
				if (math.getWin() > math.getCharange()) {

					request.setAttribute("errorMsg", "入力された\"試行する回数\"に比べ\"当たる回数\"が多すぎます");

					RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ProbilityCheck.jsp"); //Beansのインスタンス(loginUser)が入ってると、main画面(main.jsp)に飛ぶ

					dispatcher.forward(request, response);
				}

				else if (charange != null && win != null&& charange.length()!=0&&win.length()!=0) {

					ProbilityLogic probilityLogic = new ProbilityLogic();
				
					probilityLogic.probilityAtLeast(math);
					request.setAttribute("math", math);

					RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ProbilityCheckResult.jsp");

					dispatcher.forward(request, response);
					
					
					
					
					

				}
			}

			
		
			catch (Exception e)

			{

				//エラーメッセージをリクエストスコープに保存

				request.setAttribute("errorMsg", "数値が入力されていません");

				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ProbilityCheck.jsp"); //Beansのインスタンス(loginUser)が入ってると、main画面(main.jsp)に飛ぶ

				dispatcher.forward(request, response);

			}
		}

	}
