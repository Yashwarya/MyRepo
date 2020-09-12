package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.min;

public class Testmin {
     private min arth;
	
     @Before
     public void init() {
    	 arth=new min();
     }
     
     
	 @Test
	 public void testmin() {
		 assertEquals(10, arth.min(4, 6));
	 }
}
