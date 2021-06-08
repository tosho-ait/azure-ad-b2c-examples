package com.azure.spring.sample.aad.b2c.spring;

import com.azure.spring.sample.aad.b2c.security.ViamedisPrincipal;
import net.minidev.json.JSONArray;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class SecurityControllerAdvice {

    @ModelAttribute
    public ViamedisPrincipal customPrincipal(Authentication authentication) {

        String givenName = (String) ((JwtAuthenticationToken) authentication).getTokenAttributes().get("given_name");
        String name = (String) ((JwtAuthenticationToken) authentication).getTokenAttributes().get("name");
        String familyName = (String) ((JwtAuthenticationToken) authentication).getTokenAttributes().get("family_name");
        JSONArray emails = (JSONArray) ((JwtAuthenticationToken) authentication).getTokenAttributes().get("emails");

        return ViamedisPrincipal.builder()
                .name(name)
                .givenName(givenName)
                .familyName(familyName)
                .email(emails.get(0).toString())
                .build();
    }
}
