package com.ujj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class TodoDataBootApplicationTests {
	
	@Autowired
	private WebApplicationContext ctx;
	
	@Autowired
	private MockMvc mock;

	@Test
	public void contextLoads() {
		mock=MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
//	public void testgettodo() throws Exception{
//		mock.perform(get("/todo/1"))
//	}

}
