package edu.iu.p466.prime_service;

import edu.iu.p466.prime_service.service.ArithmeticService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ArithmeticServiceApplicationTests {

	ArithmeticService arithmeticServiceService = new ArithmeticService();

	//@Test
	/*void _45IsNotPrime(){
		int n = 45;
		boolean expected = false;
		boolean actual = primesService.add(n, );
		assertEquals(expected, actual);
	}

	@Test
	void _13IsNotPrime(){
		int n = 13;
		boolean expected = true;
		boolean actual = primesService.add(n, );
		assertEquals(expected, actual);
	}

	@Test
	void _150IsNotPrime(){
		int n = 150;
		boolean expected = false;
		boolean actual = primesService.add(n, );
		assertEquals(expected, actual);
	}
	@Test
	void contextLoads() {
	}
*/
}
