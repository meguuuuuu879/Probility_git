package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Mathema_spring;
import com.example.demo.model.ProbilityLogic_spring;

@Controller
public class ProbilityCheck_spring {

	private final Mathema_spring math;

	@Autowired
	public ProbilityCheck_spring(Mathema_spring math) {

		this.math = math;

	}
	/*public ProbilityCheck_spring() {
		// TODO 自動生成されたコンストラクター・スタブ
	}*/

	@GetMapping("probility")

	public String ProbilityCheckShowview() {

		return "ProbilityCheck";

	}

	@PostMapping("probilitycheckresult")

	public String ProbilityResultShowview(Model model, //データを引き渡す役割

			@RequestParam(value = "charange", required = false, defaultValue = "0") Integer charange, //HTMLファイルの「name属性」と「同盟の変数」を使用することで、「リクエストパラメータ」が設定される、String型からint型に自動変換？
			@RequestParam(value = "win", required = false, defaultValue = "0") Integer win,
			@RequestParam(value = "per", required = false, defaultValue = "0") Double per

	) {

		try {

			math.setWin(win);
			math.setCharange(charange);
			math.setPer(per);

			double nper = 1 - math.getPer();
			math.setNPer(nper);

			if (math.getWin() > math.getCharange()) {

				model.addAttribute("errorMsg", "エラーが発生しました");
				return "ProbilityCheck";

			}

			else if (math.getWin() == 0 || math.getCharange() == 0)

			{
				model.addAttribute("errorMsg", "エラーが発生しました");
				return "ProbilityCheck";

			}

			else if (charange != null && win != null && charange != 0 && win != 0) {

				ProbilityLogic_spring probilityLogic = new ProbilityLogic_spring();

				probilityLogic.probilityAtLeast(math);

				model.addAttribute("math", math);

				return "ProbilityCheckResult";
			}

		}

		catch (Exception e)

		{

			model.addAttribute("errorMsg", "エラーが発生しました");
			return "ProbilityCheck";

		}
		return "ProbilityCheck";
	}
}

//          http://localhost:8080/probility