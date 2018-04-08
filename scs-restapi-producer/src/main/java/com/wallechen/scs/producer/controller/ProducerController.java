package com.wallechen.scs.producer.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wallechen.scs.producer.domain.SpuInfo;

/**
 * Created by wallechen on 18/4/8.
 */
@RestController
public class ProducerController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello Producer!!!";
	}

	@RequestMapping(value = "/spuInfos", method = RequestMethod.GET)
	@ResponseBody
	public List<SpuInfo> getSpus() {
		List<SpuInfo> result = new ArrayList<SpuInfo>();
		result.add(new SpuInfo(1L, "商品一", new Date()));
		result.add(new SpuInfo(2L, "商品二", new Date()));
		result.add(new SpuInfo(3L, "商品三", new Date()));
		return result;
	}
}
