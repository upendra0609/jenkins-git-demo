package com.sikku.jenkins.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HomeControllerTest {

	@Mock
	private HomeController controller;

	@Test
	void test() {
		when(controller.showHome()).thenReturn("welcome to jenkins");
		assertEquals("welcome to jenkins", controller.showHome());
	}

}
