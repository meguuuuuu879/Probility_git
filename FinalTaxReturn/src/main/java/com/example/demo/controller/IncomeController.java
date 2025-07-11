package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IncomeController {

	//GETかつ[url:/show]

	@GetMapping("show")
	public String showView() {
		//表示する「ビュー名」

		return "input";
	}

	/*
	
	    //GETかつ[url:/result]
	
	@GetMapping("result")
	public String showResultGet(
	
			@RequestParam String val, Model model) {
	
		//モデルに送られてきた値を設定
		model.addAttribute("value", val);
	
		//表示する「ビュー名」
		return "output";
	
	}
	
	*/

	@PostMapping("/decideincome")

	public String DeducationDecide(@RequestParam int income, Model model) {
		int deducation = 0;
		String lank = "";
		if (income <= 1625000) {

			deducation = 550000;
			lank = "A";

		} else if (income <= 1800000) {

			deducation = (int) (income * 0.4 - 100000);
			lank = "B";

		} else if (income <= 3600000) {

			deducation = (int) (income * 0.3 - 80000);
			lank = "C";

		}

		else if (income <= 6600000) {

			deducation = (int) (income * 0.2 - 440000);
			lank = "D";

		} else if (income <= 8500000) {

			deducation = (int) (income * 0.1 - 1100000);
			lank = "E";

		}

		else if (8500000 <= income) {

			deducation = 1950000;
			lank = "F";

		}

		model.addAttribute("income", income);
		model.addAttribute("lank", lank);
		model.addAttribute("deducation", deducation);

		return "result";
	}
}
