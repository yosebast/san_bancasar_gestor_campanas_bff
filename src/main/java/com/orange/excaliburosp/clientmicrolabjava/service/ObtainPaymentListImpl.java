package com.orange.excaliburosp.clientmicrolabjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orange.excaliburosp.clientmicrolabjava.client.IPaymentClient;
import com.orange.excaliburosp.clientmicrolabjava.model.ReponsePayment;

@Service
public class ObtainPaymentListImpl implements ObtainPaymentList{

	@Autowired
	IPaymentClient paymentClient;
	
	@Override
	public ReponsePayment getAllPayment() {		
		
		return paymentClient.getAllPayment();
		
		
		
	}
	
}
