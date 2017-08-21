
package com.iqmsoft.payara.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.payara.spring.boot.domain.Client;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/client")
public class ClientRestController {

    Map<Integer, Client> clientMap = new HashMap<>();

    @PostConstruct
    public void init() {
        clientMap.put(1, new Client(1, "Test1", "Test1", "test1@test1.com"));
        clientMap.put(2, new Client(2, "Test2", "Test2", "test2@test2.com"));
        clientMap.put(3, new Client(3, "Test3", "Test3", "test3@test3.com"));
    }

    @RequestMapping("/all")
    public Collection<Client> getAll() {
        return clientMap.values();
    }
}

