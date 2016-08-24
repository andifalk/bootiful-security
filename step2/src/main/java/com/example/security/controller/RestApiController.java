package com.example.security.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * A REST service.
 */
@RestController
public class RestApiController {

    @RequestMapping(path = "/user")
    public String helloUser(@AuthenticationPrincipal Principal user) {
        return String.format("Hello '%s' from Bootiful Security", user.getName());
    }
}
