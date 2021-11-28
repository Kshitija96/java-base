package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("java-base-git-kshitija96-kul-dev.apps.sandbox.x8i5.p1.openshiftapps.com/gg")
	public String greeting() {
		return "home";
	}
}
