package com.wallechen.scs.restservice.producer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wallechen.scs.restservice.producer.model.domain.SpuInfo;

/**
 * Created by wallechen on 18/4/8.
 */
@Component
public class ProducerServiceFallback implements ProducerService {
	@Override
	public List<SpuInfo> getSpuInfos() {
		List<SpuInfo> result = new ArrayList<SpuInfo>();
		SpuInfo info = new SpuInfo();
		info.setId(10L);
		info.setSpuName("默认商品");
		info.setCreateTime(new Date());
		result.add(info);
		return result;
	}
}
