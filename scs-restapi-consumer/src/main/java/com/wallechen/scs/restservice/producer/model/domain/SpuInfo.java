package com.wallechen.scs.restservice.producer.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品基本信息,如果是Java,可以抽离出来,在接口提供方和调用方之间共享。
 * Created by wallechen on 18/4/8.
 */
public class SpuInfo implements Serializable {
	//主键
	private Long id;
	//商品名称
	private String spuName;
	//创建时间
	private Date createTime;

	public SpuInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpuName() {
		return spuName;
	}

	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
