package com.open.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import feign.Response;

@RestController
public class AllCapsController {

	@Autowired  
	protected AllCapsService allCapsService; 

	@RequestMapping(value = "/allCaps/{text}", method = RequestMethod.GET)
	public String getAllCaps(@PathVariable String text) {
		TextModel model = new TextModel();
		model.setINPUT(text);
		Response response  = allCapsService.getAllCaps(model);
		return response.body().toString();
	}
}
