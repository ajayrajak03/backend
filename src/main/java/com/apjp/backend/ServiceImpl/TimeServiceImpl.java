package com.apjp.backend.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apjp.backend.Dao.TimeRepository;
import com.apjp.backend.Entity.TimeMasterEntity;
import com.apjp.backend.pojoclass.TimeMaster;
import com.apjp.backend.service.TimeService;
 @Service
public class TimeServiceImpl implements TimeService {
	
	@Autowired
	TimeRepository timeRepository;
	
	@Override
	public long saveTimeMaster(TimeMaster tm) {
		
		TimeMasterEntity t1=new TimeMasterEntity();
		
		t1.setActivityDate(tm.getActivityDate());
		t1.setActivityName(tm.getActivityName());
		t1.setActualFromTime(tm.getActualFromTime());
		t1.setActualToTime(tm.getActualToTime());
		t1.setCategory(tm.getCategory());
		t1.setDescription(tm.getDescription());
		t1.setFromTime(tm.getFromTime());
		t1.setToTime(tm.getToTime());
		t1=timeRepository.save(t1);
		return t1.getId();
		
	}
	

}
