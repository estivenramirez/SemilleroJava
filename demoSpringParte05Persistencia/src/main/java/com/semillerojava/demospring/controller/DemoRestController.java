package com.semillerojava.demospring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class DemoRestController {
		
	@GetMapping("/")
	public Map<String, Object> demo() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "Pedro");
		map.put("lastname", "Gomez");
		return map;
	}
	
}
