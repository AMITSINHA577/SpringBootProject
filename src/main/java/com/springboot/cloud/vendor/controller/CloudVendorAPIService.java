package com.springboot.cloud.vendor.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cloud.vendor.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

	CloudVendor cloudvendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudeVendoreDetails(String vendorId) {

		return cloudvendor;
//				new CloudVendor("c1", "Vendor1", "Address one", "000000000");

	}

	@PostMapping
	public String createCloudevendoreDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor = cloudvendor;
		return "Cloude Vendore Created successfully :)";
	}

	@PutMapping
	public String updateCloudevendoreDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor = cloudvendor;
		return "Cloude Vendore Updated successfully :)";
	}

	@DeleteMapping("{vendorId}")
	public String deleteCloudevendoreDetails(String vendorId) {
		this.cloudvendor = null;
		return "Cloude Vendore Delete successfully :)";
	}

}
