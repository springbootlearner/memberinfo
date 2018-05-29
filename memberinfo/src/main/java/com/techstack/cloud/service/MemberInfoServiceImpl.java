/**
 * 
 */
package com.techstack.cloud.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.techstack.cloud.model.Address;
import com.techstack.cloud.model.Member;
import com.techstack.cloud.model.MemberProfileResponse;

/**
 * @author UthirNew
 *
 */
@Service
public class MemberInfoServiceImpl implements MemberInfoService{
	
	private static final Logger logger = LoggerFactory.getLogger(MemberInfoServiceImpl.class);

	@Override
	public MemberProfileResponse getMemberProfileInfo(String userName) {
		
		logger.info("getMemberProfileInfo Starts");
		Member member = new Member();
		
		member.setLastName("Lionel");
		member.setFirstName("Messi");
		member.setDob("1985-08-10");
		
		Address address = new Address();
		
		address.setStreet("4020 Irwin Simpson Road");
		address.setAptNo("10");
		address.setCity("Mason");
		address.setState("Ohio");
		address.setPinCode("45039");
		member.setAddress(address);
		
		List<Member> memberResp = new ArrayList<>();
		memberResp.add(member);
		
		MemberProfileResponse memProfileResp = new MemberProfileResponse();
		memProfileResp.setMemberResponse(memberResp);
		
		logger.info("getMemberProfileInfo Ends");
		return memProfileResp;
	}
	
	
}
