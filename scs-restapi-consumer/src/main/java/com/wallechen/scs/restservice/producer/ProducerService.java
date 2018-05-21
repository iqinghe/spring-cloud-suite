package com.wallechen.scs.restservice.producer;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wallechen.scs.restservice.producer.model.domain.SpuInfo;

/**
 * 使用FeignClient来进行远程restapi的调用,里面融合了ribbon(负载),hystrix(熔断与降级),eureka(服务发现)的功能。
 * Created by wallechen on 18/4/8.
 */
//@FeignClient(value = "scs-producer", url = "http://localhost:11000")
@FeignClient(value = "scs-producer", fallback = ProducerServiceFallback.class, primary = true)
public interface ProducerService {
	@RequestMapping(method = RequestMethod.GET, value = "/spuInfos")
	List<SpuInfo> getSpuInfos();

}
