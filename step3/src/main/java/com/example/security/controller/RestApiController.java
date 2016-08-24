package com.example.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * A REST service.
 */
@RestController
public class RestApiController {

    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    @RequestMapping(path = "/user")
    public String helloUser(@AuthenticationPrincipal Principal user) {
        return String.format("Hello '%s' from Bootiful Security", user.getName());
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(path = "/admin")
    public String helloAdmin(@AuthenticationPrincipal Principal admin) {
        return String.format("Hello '%s' from Bootiful Security", admin.getName());
    }
}
