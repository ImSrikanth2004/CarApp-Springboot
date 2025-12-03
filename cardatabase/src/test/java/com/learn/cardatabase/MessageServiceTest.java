package com.learn.cardatabase;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.learn.cardatabase.domain.Message;
import com.learn.cardatabase.service.MessageService;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MessageServiceTest {

    @Test
    public void testAddMessage() {
        MessageService messageService = new MessageService();
        String msg = "Hello world";
        Message newMsg = messageService.addMsg(msg);
        assertEquals(msg, newMsg.getMessage());
    }
}
