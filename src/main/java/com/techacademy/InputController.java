package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

	@GetMapping("/input")
	public String getInput(@RequestParam(name = "previous",defaultValue = "") String previous,Model model) {
		model.addAttribute("previous", previous);
		model.addAttribute("msg2", "値を入力してください。");
		model.addAttribute("msg3", "前回入力された値は" + previous + " でした。");
		return "input";
	}

	@PostMapping("/input")
	public String getInput(@RequestParam("val") String val, Model model, RedirectAttributes redirectAttributes) {
		model.addAttribute("val", val);
		redirectAttributes.addFlashAttribute("val", val);
		return "redirect:output";
	}
}
