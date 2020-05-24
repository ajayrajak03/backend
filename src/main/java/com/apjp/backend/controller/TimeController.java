package com.apjp.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apjp.backend.Dao.TimeRepository;
import com.apjp.backend.pojoclass.TimeMaster;
import com.apjp.backend.service.TimeService;

@RestController
public class TimeController {

	@Autowired
	TimeRepository timeRepository;

	@Autowired
	TimeService timeService;

	@PostMapping("/saveitems")
	public ResponseEntity<?> save(@RequestBody TimeMaster tm) {
		long id = timeService.saveTimeMaster(tm);
		return ResponseEntity.ok().body("New user has been saved with ID:" + id);
	}

}
