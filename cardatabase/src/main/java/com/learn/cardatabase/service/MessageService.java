package com.learn.cardatabase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.cardatabase.domain.Message;


@Service
public class MessageService {

    private List<Message> messages = new ArrayList<>();

    public Message addMsg(String msg) {
        Message newMsg = new Message(msg);
        messages.add(newMsg);
        return newMsg;
    }
}
