package com.orange.excaliburosp.clientmicrolabjava.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.orange.excaliburosp.clientmicrolabjava.model.ReponsePayment;

public interface ObtainPaymentListController {

	@GetMapping(value="/v1/obtainall", produces="application/json;charset-utf-8")	
	public ReponsePayment getListaPayment();
}
