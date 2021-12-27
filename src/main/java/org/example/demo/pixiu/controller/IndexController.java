package org.example.demo.pixiu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @project: java-web-graalVM
 * @author: gaoyanfei3@jd.com
 * @datetime: 2021/12/27 16:38 Monday
 */
@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping("hello")
    String hello() {
        return "Hello GraalVM";
    }
}
