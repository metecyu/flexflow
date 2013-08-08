package com.metecyu.flow.dao;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.metecyu.flow.model.Flowdef;



@ContextConfiguration(locations={"/applicationContext.xml","/hibernate.cfg.xml"})
public class FlowdefDAOTest extends AbstractJUnit4SpringContextTests {
	private static final Logger log = Logger.getLogger(FlowdefDAOTest.class);
	
	@Resource
	private FlowdefDAO flowdefDAO; 
	@Test
	@Rollback(value=false)  
	public void testSave(){
		
		Flowdef flowdef = flowdefDAO.save("发文流程2","fw2");
		log.info("流程id"+flowdef.getId());
		//Assert.assertTrue(true);
		//Assert.assertTrue(!"".equals(flowdef.getId()));
	}

	
}