package com.techacademy;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

	@GetMapping("/input")
	public String getInput(@RequestParam("previous") String previous, Model model) {
		// 文字列をModelに登録
		model.addAttribute("msg2", "値を入力してください。");
		model.addAttribute("msg3", "前回入力された値は" + previous + " でした。");
		// formに画面遷移
		return "input";
	}

	@PostMapping("/input")
	public String getInput(@RequestParam("val") String val, Model model, RedirectAttributes redirectAttributes) {
		model.addAttribute("val", val);
		redirectAttributes.addFlashAttribute("val", val);
		return "redirectz:output";
	}
}
