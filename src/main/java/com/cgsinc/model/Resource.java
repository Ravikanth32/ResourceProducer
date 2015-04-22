package com.cgsinc.model;

import java.io.Serializable;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value="resources")
public class Resource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	@Column("id")
	private Long id;
	@Column("file_name")
	private String fileName;
	@Column("image_name")
	private String imageName;
	@Column("url_name")
	private String urlName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	
}
