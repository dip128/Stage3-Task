package com.diptom.designpattern.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.diptom.designpattern.adapter.speed.BugattiVeyron;
import com.diptom.designpattern.adapter.speed.Movable;
import com.diptom.designpattern.adapter.speed.MovableAdapter;
import com.diptom.designpattern.adapter.speed.MovableAdapterImpl;

public class SpeedTest {

	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		//System.out.println(bugattiVeyronAdapter.getSpeed());
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001); 
		}

}
