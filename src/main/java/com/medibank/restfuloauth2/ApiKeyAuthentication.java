/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medibank.restfuloauth2;

import java.util.Collection;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

/*
Extending AbstractAuthenticationToken
To successfully implement authentication for our application, 
we’ll need to convert the incoming API Key to an Authentication object, 
such as an AbstractAuthenticationToken. The AbstractAuthenticationToken class 
implements the Authentication interface, representing the secret/principal 
for an authenticated request.
*/

public class ApiKeyAuthentication extends AbstractAuthenticationToken {
    private final String apiKey;

    public ApiKeyAuthentication(String apiKey, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.apiKey = apiKey;
        setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return apiKey;
    }
}