package com.qyx.test.child.beans;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("child")
public class MyChildController {

    @RequestMapping("hello")
    public String childController() {
        return "child Controller";
    }
}
