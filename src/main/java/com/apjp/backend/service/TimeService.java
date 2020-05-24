package com.apjp.backend.service;

import org.springframework.stereotype.Service;

import com.apjp.backend.pojoclass.TimeMaster;

@Service
public interface TimeService {
	long saveTimeMaster(TimeMaster tm);
	
	

}
