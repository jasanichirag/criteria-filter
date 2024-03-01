package com.user.microservice.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@MappedSuperclass
@Data
public class Auditable {

	@ApiModelProperty(hidden = true)
	public long creationdate;
	
	@ApiModelProperty(hidden = true)
	public long updatedate;
	
	@PrePersist
	public 	void oncreate() {
		this.creationdate=new Date().getTime();
		this.onUpdate();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updatedate=new Date().getTime();
	}
	
	
}
