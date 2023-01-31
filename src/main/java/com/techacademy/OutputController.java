package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutputController {

	@GetMapping("/output")
	public String postOutput(Model model) {
		String val = (String) model.getAttribute("val");
		model.addAttribute("msg1", "入力された値は「" + val + "」です。");
		return "output";
	}
}
