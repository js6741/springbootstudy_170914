package com.skcc.springbootstudy.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("s1")
public class TestService1 implements TestService {
	
	@Value("${test.string:some string}")
	private String string;
	
	@Override
	public String getString() {
		return string;
	}
}
