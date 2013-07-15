package com.metecyu.flow.dao;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.metecyu.flow.model.Flowdef;

@Repository
public class FlowdefDAO extends HibernateDaoSupport {
	private static final Logger log = LogManager
			.getLogger(FlowdefDAO.class);
	
	
	public Flowdef save(String flowname,String flowno) {
		log.debug("saving CwTaskCat instance");
		Flowdef flowdef = new Flowdef();
		flowdef.setFlowname(flowname);
		flowdef.setFlowno(flowno);
		try {
			getHibernateTemplate().save(flowdef);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		return flowdef;
	}

	
	
	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
}