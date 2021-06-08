package com.azure.spring.sample.aad.b2c.security;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ViamedisPrincipal {

    private String name;
    private String givenName;
    private String familyName;
    private String email;

}
