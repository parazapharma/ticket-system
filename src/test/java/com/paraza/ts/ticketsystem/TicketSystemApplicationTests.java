package com.paraza.ts.ticketsystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class TicketSystemApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        String encoded=new BCryptPasswordEncoder().encode("admin@123");
        System.out.println(encoded);
    }

}
