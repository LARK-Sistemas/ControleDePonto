package br.com.senai.fatesg.controleponto.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.senai.fatesg.controleponto.controle.AjusteDeRegistroControl;
import br.com.senai.fatesg.controleponto.entidade.AjusteDeRegistro;

@Path("/registroPontos")
public class RegistroPontoService {
	
	// URI:
    // /contextPath/servletPath/registroPontos
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<AjusteDeRegistro> getAjusteDeRegistro_JSON() {
        List<AjusteDeRegistro> listOfCountries = AjusteDeRegistroControl.getAllAjusteDeRegistros();
        return listOfCountries;
    }
	
 // URI:
    // /contextPath/servletPath/registroPontos/{empNo}
    @GET
    @Path("/{registroId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public AjusteDeRegistro getAjusteDeRegistro(@PathParam("empNo") String empNo) {
        return AjusteDeRegistroControl.getAjusteDeRegistro(empNo);
    }
 
    // URI:
    // /contextPath/servletPath/registroPontos
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public AjusteDeRegistro addAjusteDeRegistro(AjusteDeRegistro emp) {
        return AjusteDeRegistroControl.addAjusteDeRegistro(emp);
    }
 
    // URI:
    // /contextPath/servletPath/registroPontos
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public AjusteDeRegistro updateAjusteDeRegistro(AjusteDeRegistro emp) {
        return AjusteDeRegistroControl.updateAjusteDeRegistro(emp);
    }
 
    @DELETE
    @Path("/{registroId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteAjusteDeRegistro(@PathParam("empNo") String empNo) {
    	AjusteDeRegistroControl.deleteAjusteDeRegistro(empNo);
    }
}
