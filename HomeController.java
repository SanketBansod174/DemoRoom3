//in dayThree changes done
package com.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
	
	@GetMapping("/")
	public String shoeIndexPage() {
		System.out.println("====Added some comment to check the whether data added to dayThree branch====");
		return "/index";

	}

}
