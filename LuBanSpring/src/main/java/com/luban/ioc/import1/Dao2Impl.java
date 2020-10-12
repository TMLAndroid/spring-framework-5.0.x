package com.luban.ioc.import1;

import org.springframework.stereotype.Component;

@Component("Dao2Impl")
public class Dao2Impl implements Dao2{
	@Override
	public void query() {
		System.out.println("hahahahahhaha");
	}
}
