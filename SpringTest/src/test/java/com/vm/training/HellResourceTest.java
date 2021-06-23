package com.vm.training;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



@SpringBootTest
public class HellResourceTest {

	MockMvc mockMvc;

	@InjectMocks
	HelloResource helloResource;

	

	

	@Test
	public void testSayHello() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(helloResource).build();

		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("hello abdul"));
	}

}
