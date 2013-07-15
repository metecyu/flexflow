
/*
 *  This file is part of the Heritrix web crawler (crawler.archive.org).
 *
 *  Licensed to the Internet Archive (IA) by one or more individual 
 *  contributors. 
 *
 *  The IA licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.metecyu.flow;

import org.apache.log4j.Logger;

import junit.framework.TestCase;

import com.metecyu.flow.dao.FlowdefDAOTest;


public class FlexflowTest extends TestCase {
	private static final Logger log = Logger.getLogger(FlowdefDAOTest.class);
    Flexflow flow = new Flexflow();
    
    public void testStartFlow(){
    	String userid ="shm";
    	String flowname ="fw";
    	String docid ="001";
    	String flowid = flow.startFlow(userid, flowname, docid);
    	this.assertTrue(!flowid.equals(""));
    }
    
    public void testNextNode(){
    	String userid ="shm";
    	String taskid ="taskid";
    	String ret = flow.nextNode(taskid, userid);
    	System.out.println("中文");
    	this.assertTrue(!ret.equals(""));
    }
    
    
}
