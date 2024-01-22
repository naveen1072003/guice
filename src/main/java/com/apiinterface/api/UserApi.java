package com.apiinterface.api;

import com.apiinterface.dto.LoginDTO;
import com.apiinterface.dto.Response;

import javax.ws.rs.*;


@Path("/")
public interface UserApi {

    @GET
    @Path("/user/login")
    @Consumes("application/json")
    @Produces("application/json")
    Response login(LoginDTO login);

    @POST
    @Path("/user/register")
    Response register();
}