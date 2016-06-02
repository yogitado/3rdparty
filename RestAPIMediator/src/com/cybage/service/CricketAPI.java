package com.cybage.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cybage.model.CallCricketAPI;
import com.cybage.model.Cricket;

@Path("/cricket")
public class CricketAPI
{
	 
	 
	@GET
	@Path("/PlayerDetail/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public Cricket getPlayerDetails(@PathParam("name") String name)
	{
		System.out.println(name);
		CallCricketAPI obj=new CallCricketAPI();
		Cricket details=obj.getPlayerDetail(name);
		return details;
	}
}
