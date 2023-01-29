package com.Learn.SpringLearn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Learn.SpringLearn.server.productscallint;

@Controller
public class My_Controller {

	@Autowired
	private productscallint productscall;
	
	@GetMapping("/")
	public String Strat(Model model)
	{
		model.addAttribute("products", productscall.getAllproducts());
		return "start";
	}
	}
