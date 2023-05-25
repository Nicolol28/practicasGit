package OO2.PracticaWeb.Nicolas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/firstspring")
public class FirstSpringController {
	
	@GetMapping("helloworld")
	public String helloWorld() {
		return "HelloWorld";
	}
	@GetMapping("helloworld2")
	public String helloWorld2() {
		return "HelloWorld2";
	}
}
