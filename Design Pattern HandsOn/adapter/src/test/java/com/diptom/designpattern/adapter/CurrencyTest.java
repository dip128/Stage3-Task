package com.diptom.designpattern.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.diptom.designpattern.adapter.speed.BugattiVeyron;
import com.diptom.designpattern.adapter.speed.Movable;
import com.diptom.designpattern.adapter.speed.MovableAdapter;
import com.diptom.designpattern.adapter.speed.MovableAdapterImpl;

public class CurrencyTest {
	
	@Test 
	public void whenConvertingUSDtoEuro_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		//System.out.println(bugattiVeyronAdapter.getPrice());
		assertEquals(bugattiVeyronAdapter.getPrice(), 1260.0, 0.001); 
		}

}
