package com.example.security;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Test to verify correctness of Rest API in combination with security.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RestApiTest {

    private static final String USER_USERNAME = "testuser";

	@Autowired
	private MockMvc mockMvc;

    @WithMockUser(username = USER_USERNAME)
	@Test
	public void verifyGetUser() throws Exception {
		mockMvc.perform(get("/user"))
				.andExpect(status().isOk())
				.andExpect(content().string(String.format("Hello '%s' from Bootiful Security", USER_USERNAME)));
	}

    @Test
    public void verifyErrorGetUserUnauthenticated() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }

    @WithMockUser(username = USER_USERNAME)
    @Test
    public void verifyNotFound() throws Exception {
        mockMvc.perform(get("/invalid"))
                .andExpect(status().isNotFound());
    }

}
