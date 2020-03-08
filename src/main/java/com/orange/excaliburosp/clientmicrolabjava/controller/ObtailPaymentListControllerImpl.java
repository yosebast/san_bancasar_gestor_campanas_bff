package com.orange.excaliburosp.clientmicrolabjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.orange.excaliburosp.clientmicrolabjava.model.ReponsePayment;
import com.orange.excaliburosp.clientmicrolabjava.service.ObtainPaymentList;

@RestController
public class ObtailPaymentListControllerImpl implements ObtainPaymentListController {

	@Autowired
	ObtainPaymentList listaPayment;
	
	@Override
	public ReponsePayment getListaPayment() {
		
		ReponsePayment list = listaPayment.getAllPayment();
		return list;
	}
	
	
	
		
		
		
	

}
