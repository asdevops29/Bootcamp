package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.SaySomethingService;


@ExtendWith(SpringExtension.class)
@SpringBootTest

public class TestSaySomethingService {
	
	@Test
	public void testMorning() {
	SaySomethingService saySomethingService = new SaySomethingService();
	Assertions.assertEquals("Good Morning!", saySomethingService.sayMorning());
	}
	
	@Test
	public void testAfternoon() {
	SaySomethingService saySomethingService = new SaySomethingService();
	Assertions.assertEquals("Good Afternoon!", saySomethingService.sayAfternoon());
	}

	@Test
	public void testNight() {
	SaySomethingService saySomethingService = new SaySomethingService();
	Assertions.assertEquals("Good Night!", saySomethingService.sayNight());
	}

	@Test
	public void testHello() {
	SaySomethingService saySomethingService = new SaySomethingService();
	Assertions.assertEquals("Hello!", saySomethingService.sayHello());
	}
	
	@Test
	public void testSomething() {
	SaySomethingService saySomethingService = new SaySomethingService();
	Assertions.assertNotNull(saySomethingService.saySomething("Any text"));
	}
}
