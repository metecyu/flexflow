package com.metecyu.flow.model;

// Generated 11-八月-13 下午 05:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Task generated by hbm2java
 */
public class Task implements java.io.Serializable {

	private String id;
	private FlowInstance flowInstance;
	private String taskname;
	private String assignuserid;
	private Date createtime;
	private Date endtime;
	private String isopen;
	private String submituserid;

	public Task() {
	}

	public Task(FlowInstance flowInstance, String taskname,
			String assignuserid, Date createtime, Date endtime, String isopen,
			String submituserid) {
		this.flowInstance = flowInstance;
		this.taskname = taskname;
		this.assignuserid = assignuserid;
		this.createtime = createtime;
		this.endtime = endtime;
		this.isopen = isopen;
		this.submituserid = submituserid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FlowInstance getFlowInstance() {
		return this.flowInstance;
	}

	public void setFlowInstance(FlowInstance flowInstance) {
		this.flowInstance = flowInstance;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getAssignuserid() {
		return this.assignuserid;
	}

	public void setAssignuserid(String assignuserid) {
		this.assignuserid = assignuserid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getIsopen() {
		return this.isopen;
	}

	public void setIsopen(String isopen) {
		this.isopen = isopen;
	}

	public String getSubmituserid() {
		return this.submituserid;
	}

	public void setSubmituserid(String submituserid) {
		this.submituserid = submituserid;
	}

}
