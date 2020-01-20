package com.open.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Response;

@FeignClient(name = "allCapsClient",url="API.SHOUTCLOUD.IO")
public interface AllCapsService {

	@RequestMapping(value = "/V1/SHOUT", method = RequestMethod.POST,consumes = "application/json")
	Response getAllCaps(TextModel model);
}
