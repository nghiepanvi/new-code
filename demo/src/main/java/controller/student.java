package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class student {
@RequestMapping("/")
public String showFrom () {
	return "hello";
}
}
