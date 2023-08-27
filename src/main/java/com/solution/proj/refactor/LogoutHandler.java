//package com.solution.proj.refactor;
//
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.io.IOException;
//
//@Controller
//public class LogoutHandler extends SecurityContextLogoutHandler {
//    private final ClientRegistrationRepository clientRegistrationRepository;
//
//    @Autowired
//    public LogoutHandler(ClientRegistrationRepository clientRegistrationRepository) {
//        this.clientRegistrationRepository = clientRegistrationRepository;
//    }
//
//    @Override
//    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//                       Authentication authentication) {
//        super.logout(httpServletRequest, httpServletResponse, authentication);
//
//        String issuer = (String) getClientRegistration().getProviderDetails().getConfigurationMetadata().get("issuer");
//        String clientId = getClientRegistration().getClientId();
//        String returnTo = ServletUriComponentsBuilder.fromCurrentContextPath().build().toString() + "/oauth2/authorization/auth0";
//
//        String logoutUrl = UriComponentsBuilder
//                .fromHttpUrl(issuer + "v2/logout?client_id=" + clientId + "&returnTo=" + returnTo)
//                .encode()
//                .buildAndExpand(clientId, returnTo)
//                .toUriString();
//
//        try {
//            httpServletResponse.sendRedirect(logoutUrl);
//        } catch (IOException ioe) {
//            throw new RuntimeException("error while redirecting");
//        }
//    }
//
//    private ClientRegistration getClientRegistration() {
//        return this.clientRegistrationRepository.findByRegistrationId("auth0");
//    }
//}


package com.solution.proj.refactor;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LogoutHandler extends SecurityContextLogoutHandler {

    private final ClientRegistrationRepository clientRegistrationRepository;

    public LogoutHandler(ClientRegistrationRepository clientRegistrationRepository) {
        this.clientRegistrationRepository = clientRegistrationRepository;
    }

    @Override
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                       Authentication authentication) {
        super.logout(httpServletRequest, httpServletResponse, authentication);

        String issuer = getIssuerFromClientRegistration();
        String clientId = getClientIdFromClientRegistration();
        String returnTo = ServletUriComponentsBuilder.fromCurrentContextPath().build().toString() + "/oauth2/authorization/auth0";

        String logoutUrl = UriComponentsBuilder
                .fromHttpUrl(issuer + "/v2/logout")
                .queryParam("client_id", clientId)
                .queryParam("returnTo", returnTo)
                .build()
                .toUriString();

        try {
            httpServletResponse.sendRedirect(logoutUrl);
        } catch (IOException ioe) {
            throw new RuntimeException("Error while redirecting to logout URL");
        }
    }

    private String getIssuerFromClientRegistration() {
        ClientRegistration registration = getClientRegistration();
        return (String) registration.getProviderDetails().getConfigurationMetadata().get("issuer");
    }

    private String getClientIdFromClientRegistration() {
        ClientRegistration registration = getClientRegistration();
        return registration.getClientId();
    }

    private ClientRegistration getClientRegistration() {
        return this.clientRegistrationRepository.findByRegistrationId("auth0");
    }
}