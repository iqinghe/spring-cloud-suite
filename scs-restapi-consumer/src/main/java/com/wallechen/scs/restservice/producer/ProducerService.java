package com.wallechen.scs.restservice.producer;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wallechen.scs.restservice.producer.model.domain.SpuInfo;

/**
 * Created by wallechen on 18/4/8.
 */
//@FeignClient(value = "scs-producer", url = "http://localhost:11000")
@FeignClient(value = "scs-producer",fallback =ProducerServiceFallback.class )
public interface ProducerService {
	@RequestMapping(method = RequestMethod.GET, value = "/spuInfos")
	List<SpuInfo> getSpuInfos();


}
