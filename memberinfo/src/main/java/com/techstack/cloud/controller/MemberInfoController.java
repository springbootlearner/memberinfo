/**
 * 
 */
package com.techstack.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techstack.cloud.model.MemberProfileResponse;
import com.techstack.cloud.service.MemberInfoService;

@RestController
public class MemberInfoController {
	
	public static final String PROFILE_URI = "/member/profile";
	
	private static final Logger logger = LoggerFactory.getLogger(MemberInfoController.class);
	
	private MemberInfoService memberInfoService;
	
	
	public MemberInfoController(MemberInfoService memberInfoService) {
		super();
		this.memberInfoService = memberInfoService;
	}


	@GetMapping(value=PROFILE_URI,produces=MediaType.APPLICATION_JSON_VALUE)
	public MemberProfileResponse getMemberProfile(@RequestParam(name="username") String userName){
		logger.info("getMemberProfile Starts");
		
		logger.info("Request UserName :"+userName);
		MemberProfileResponse memProfileResp = memberInfoService.getMemberProfileInfo(userName);
		
		logger.info("getMemberProfile Ends");
		return memProfileResp;
		
	}

}
