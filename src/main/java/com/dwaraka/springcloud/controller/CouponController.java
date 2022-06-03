package com.dwaraka.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dwaraka.springcloud.model.Coupon;
import com.dwaraka.springcloud.repository.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	private CouponRepository couponRepository;
	
	@RequestMapping(value = "/coupons",method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepository.save(coupon);
		
	}
	
	@GetMapping(value = "/coupons/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponRepository.findByCode(code);
	}

}
