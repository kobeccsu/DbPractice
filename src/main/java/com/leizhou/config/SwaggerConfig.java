package com.leizhou.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.swagger.v3.core.util.AnnotationsUtils.getContact;
import static io.swagger.v3.core.util.AnnotationsUtils.getLicense;

//@Configuration
public class SwaggerConfig {
    private static final String SECURITY_SCHEME_NAME = "Bearer oAuth Token";

    @Bean
    public OpenAPI openApi() {
//        return new OpenAPI()
//                .components(new Components()

//                        //HTTP Basic, see: https://swagger.io/docs/specification/authentication/basic-authentication/
//                        .addSecuritySchemes("basicScheme", new SecurityScheme()
//                                .type(SecurityScheme.Type.HTTP)
//                                .scheme("basic")
//                        )
//
//                        //API Key, see: https://swagger.io/docs/specification/authentication/api-keys/
//                        .addSecuritySchemes("apiKeyScheme", new SecurityScheme()
//                                .type(SecurityScheme.Type.APIKEY)
//                                .in(SecurityScheme.In.HEADER)
//                                .name("X-API-KEY")
//                        )

                        //OAuth 2.0, see: https://swagger.io/docs/specification/authentication/oauth2/
//                        .addSecuritySchemes("oAuthScheme", new SecurityScheme()
//                                .type(SecurityScheme.Type.OAUTH2)
//                                .description("This API uses OAuth 2 with the implicit grant flow. [More info](https://api.example.com/docs/auth)")
//                                .flows(new OAuthFlows()
//                                        .authorizationCode(
//                                            new OAuthFlow()
//                                                .tokenUrl("https://api")
//                                                .authorizationUrl("https://api.example.com/oauth2/authorize")
//                                                .scopes(new Scopes()
//                                                        .addString("read_pets", "read your pets")
//                                                        .addString("write_pets", "modify pets in your account")
//                                                )
//                                        )
//                                )
//                        )
//                )
//                .addSecurityItem(new SecurityRequirement()
//                        .addList("basicScheme")
//                )
//                .addSecurityItem(new SecurityRequirement()
//                        .addList("apiKeyScheme")
//                )
//                .addSecurityItem(new SecurityRequirement()
//                        .addList("oAuthScheme")
//                )
//                ;

        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
                .components(
                        new Components()
                                .addSecuritySchemes(SECURITY_SCHEME_NAME,
                                        new SecurityScheme()
                                                .name(SECURITY_SCHEME_NAME)
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")
                                )
                );

    }
}
