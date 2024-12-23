package org.openapitools;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class OpenApiGeneratorApplicationTests {

//    @Autowired
//    private MockMvc mockMvc;
//
//
//    @BeforeAll
//    public static void startEmbeddedCassandra() throws Exception {
//
//    }
//
//    @BeforeAll
//    public static void createKeyspace() {
//
//    }
//
//    @Test
//    public void testCreateUser() throws Exception {
//        System.out.println("add");
//        mockMvc.perform(post("/customers")
//                        .contentType("application/json")
//                        .content("{\"id\":\"d72f2276-9bdf-4a5b-957d-b9b1fae76f3b\", \"name\":\"John\", \"phone\":\"6785086994\"}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value("d72f2276-9bdf-4a5b-957d-b9b1fae76f3b"));
//    }
//
//    @Test
//    public void testGetUsers() throws Exception {
//        System.out.println("retrieve");
//        mockMvc.perform(get("/customers"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$").isArray());
//    }
//
//    @AfterAll
//    public static void stopEmbeddedCassandra() {
//
//    }
}