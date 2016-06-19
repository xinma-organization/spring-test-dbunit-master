package com.github.springtestdbunit.sample.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 企业图片库
 * 
 * @author yongyi.zhang
 *
 */

@Entity
@Table
public class Gallery implements Serializable {

	private static final long serialVersionUID = -4707462113051162523L;

	private Long oid;

	private String name;

	private String url;

	private Integer eseId;

	private Integer width;

	private Integer height;

	private Date createTime;

	@Id
	@GeneratedValue
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(nullable = false)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(nullable = false)
	public Integer getEseId() {
		return eseId;
	}

	public void setEseId(Integer eseId) {
		this.eseId = eseId;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
