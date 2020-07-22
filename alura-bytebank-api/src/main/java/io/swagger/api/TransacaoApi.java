/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.model.Transacao;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-21T12:37:02.908Z")

@Api(value = "transacao", description = "the transacao API")
@RequestMapping(value = "/bytebank-api/v1")
public interface TransacaoApi {

    @ApiOperation(value = "Altera o valor da Transação", nickname = "alteraValorTransacao", notes = "Altera o valor da transação existente na conta do cliente.", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Alteração do valor efetuada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/transacao/{codigo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> alteraValorTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "valor", required = true) Double valor,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization);


    @ApiOperation(value = "Cadastra Transação na Conta", nickname = "cadastraTransacao", notes = "Cadastra uma transação de débito ou depósito na conta.", response = Transacao.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cadastro de transação efetuado com sucesso.", response = Transacao.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/transacao",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Transacao> cadastraTransacao(@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Transacao transacao,@NotNull @ApiParam(value = "", required = true, allowableValues = "debito, deposito") @Valid @RequestParam(value = "tipo", required = true) String tipo);


    @ApiOperation(value = "Exclui a Transação", nickname = "excluiTransacao", notes = "Exclusão da transação existente na conta do cliente.", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Transação excluida com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/transacao/{codigo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> excluiTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization);

}