package com.harathii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.harathi.org.ServicePin;
import com.harathiii.Pincode;

@RestController
public class ControllerPinCode {
	
	@Autowired
	ServicePin s;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}
