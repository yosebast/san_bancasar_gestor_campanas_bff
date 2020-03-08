package com.orange.excaliburosp.clientmicrolabjava.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Movement
 */
@JsonInclude(Include.NON_NULL)
@Validated
@Data
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T16:31:20.208Z")

public class Movement {
	@JsonProperty("idtrans")
	private Long idtrans = null;

	@JsonProperty("idtransServerRefcode")
	private String idtransServerRefcode = null;

	@JsonProperty("amount")
	private Double amount = null;

	@JsonProperty("market")
	private String market = null;

	@JsonProperty("multisim")
	private String multisim = null;

	@JsonProperty("creationDate")
	private String creationDate = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("statusMov")
	private String statusMov = null;

	@JsonProperty("errorCode")
	private String errorCode = null;

	@JsonProperty("source")
	private Integer source = null;

	@JsonProperty("idtransServerRefcodeOrig")
	private String idtransServerRefcodeOrig = null;

	@JsonProperty("taxAmount")
	private Double taxAmount = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("custCode")
	private String custCode = null;

//	@JsonProperty("customer")
//	private Customer customer = null;
//
//	@JsonProperty("product")
//	private Product product = null;

	@JsonProperty("error")
	private Error error = null;

	@JsonProperty("purchaseCategoryCode")
	private String purchaseCategoryCode = null;

	@JsonProperty("idsubscription")
	private String idsubscription = null;

	@JsonProperty("idtransRefcode")
	private String idtransRefcode = null;
	
	@JsonProperty("totalAmountRefunded")
	private Double totalAmountRefunded = null;
	
	@JsonProperty("contractType")
	private String contractType=null;;

	@JsonProperty("clientType")
	private String clientType=null;
	
	@JsonProperty("idrelfil")
	private String idrelfil=null;
	
//	@JsonProperty("partner")
//	private Partner partner=null;
	
	@JsonProperty("msisdn")
	private String msisdn=null;
	

	public Movement idtrans(Long idtrans) {
		this.idtrans = idtrans;
		return this;
	}

}