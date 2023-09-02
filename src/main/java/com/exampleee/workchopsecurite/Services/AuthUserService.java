package com.exampleee.workchopsecurite.Services;
import com.exampleee.workchopsecurite.Dto.AuthenticationRequest;
import com.exampleee.workchopsecurite.Dto.AuthenticationResponse;
import com.exampleee.workchopsecurite.Dto.RegistrationRequest;

///////////////////////// nn inter
public interface AuthUserService {
    AuthenticationResponse register(RegistrationRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);

}