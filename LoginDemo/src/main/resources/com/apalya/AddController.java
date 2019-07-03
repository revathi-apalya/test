package com.apalya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	@RequestMapping("/add")
	public string add() {
		System.out.println("this is add controller");
		return"display.jsp"
	}

}
