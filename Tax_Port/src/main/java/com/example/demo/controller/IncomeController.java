
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IncomeController {

	private final UserService userService;

	@GetMapping("show")
	public String showView() {
		return "input";
	}

	@PostMapping("/decideincome")
	public String DeducationDecide(@RequestParam int incomeValue, Model model) {

		int deducation = 0;
		String lank = "";

		if (incomeValue <= 1625000) {
			deducation = 550000;
			lank = "A";
		} else if (incomeValue <= 1800000) {
			deducation = (int) (incomeValue * 0.4 - 100000);
			lank = "B";
		} else if (incomeValue <= 3600000) {
			deducation = (int) (incomeValue * 0.3 - 80000);
			lank = "C";
		} else if (incomeValue <= 6600000) {
			deducation = (int) (incomeValue * 0.2 - 440000);
			lank = "D";
		} else if (incomeValue <= 8500000) {
			deducation = (int) (incomeValue * 0.1 - 1100000);
			lank = "E";
		} else {
			deducation = 1950000;
			lank = "F";
		}
		
	

		// 保存するためのエンティティ生成
		User income = new User();
		//income.setIncome(incomeValue);
		//income.setDeduction(deduction);
		//income.setRank(rank);

		userService.insert(income); // DBに保存

		model.addAttribute("incomev", incomeValue);
		model.addAttribute("deducation", deducation);
		model.addAttribute("lank", lank);

		return "result";
		

	}





	   @GetMapping("/test-insert")
	    public String testInsert() {
	        User user = new User();
	        user.setIncome(3000000);
	        user.setDeducation(500000);
	        user.setLank("C");
	       

	        userService.insert(user);

	        return "OK";
	    }
		
	}//http://localhost:8080/test-insert
