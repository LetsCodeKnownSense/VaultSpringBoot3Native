package com.knownsense.springnativevault;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <code>AddressValidationController</code> is used to handle requests related to validation of address.
 *
 */
@RestController()
@RequestMapping(value="/knowsense")
public class VaultCheckController {

	@Autowired
	private AppProp personRepo;

	@GetMapping("/check-value")
	public String check() {
		return personRepo.getTest();
	}

}

