package com.logic.customer.controller;

import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @GetMapping("/info")
    List<String> getInfo() {
        List<String> list = new ArrayList<>();
        list.add("Operating System: " + System.getProperty("os.name"));
        list.add("CPU Architecture: " + System.getProperty("os.arch"));
        list.add("Java Vendor: " + System.getProperty("java.vendor"));
        list.add("Java URL: " + System.getProperty("java.vendor.url"));
        list.add("Java Version: " + System.getProperty("java.version"));
        list.add("JVM Version: " + System.getProperty("java.vm.version"));
        return list;
    }
}
