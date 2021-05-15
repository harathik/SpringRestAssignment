package com.harathi.org;

import org.springframework.stereotype.Service;

import com.harathiii.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}
