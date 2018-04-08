package com.wallechen.scs.producer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品基本信息
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

	public SpuInfo(Long id, String spuName, Date createTime) {
		this.id = id;
		this.spuName = spuName;
		this.createTime = createTime;
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
