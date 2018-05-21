package com.wallechen.scs.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wallechen.scs.restservice.producer.ProducerService;
import com.wallechen.scs.restservice.producer.model.domain.SpuInfo;

/**
 * Created by wallechen on 18/3/14.
 */
@RestController
public class CustomerDemoController {
	@Autowired
	private ProducerService producerService;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	@RequestMapping(value="/infos",method = RequestMethod.GET)
	public Integer getInfos() {
		List<SpuInfo> infos=producerService.getSpuInfos();
		return infos.size();
	}

}
