/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.model.Cliente;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-21T12:37:02.908Z")

@Api(value = "cliente", description = "the cliente API")
@RequestMapping(value = "/bytebank-api/v1")
public interface ClienteApi {

    @ApiOperation(value = "Cadastra Cliente", nickname = "cadastraCliente", notes = "Cadastra um novo cliente", response = Cliente.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cadastro efetuado com sucesso", response = Cliente.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/cliente",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Cliente> cadastraCliente(@ApiParam(value = ""  )  @Valid @RequestBody Cliente cliente_);

}
