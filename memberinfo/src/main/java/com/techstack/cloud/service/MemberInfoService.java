/**
 * 
 */
package com.techstack.cloud.service;

import com.techstack.cloud.model.MemberProfileResponse;

/**
 * @author UthirNew
 *
 */
public interface MemberInfoService {

	MemberProfileResponse getMemberProfileInfo(String userName);
}
