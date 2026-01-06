package com.mondenelani.onlineStore.Controllers;

import com.mondenelani.onlineStore.Models.MessageModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{
    @RequestMapping("/helloMessage")
    public MessageModel message()
    {
        return new MessageModel("Hello there");
    }
}
