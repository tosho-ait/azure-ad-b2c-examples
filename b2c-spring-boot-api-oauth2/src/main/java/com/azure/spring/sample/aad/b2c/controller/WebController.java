// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.aad.b2c.controller;

import com.azure.spring.sample.aad.b2c.security.ViamedisPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping("/hello")
    @ResponseBody
    public String apiTest(ViamedisPrincipal user) {
        return "Hello " + user.getGivenName() + " " + user.getFamilyName() + "!";
    }

}
