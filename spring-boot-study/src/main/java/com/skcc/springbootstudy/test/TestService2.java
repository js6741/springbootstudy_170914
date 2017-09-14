package com.skcc.springbootstudy.test;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!s1")
public class TestService2 implements TestService {

	@Override
	public String getString() {
		return "TestService2";
	}

}