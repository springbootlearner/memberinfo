/**
 * 
 */
package com.techstack.cloud.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author UthirNew
 *
 */
@JsonInclude(Include.NON_NULL)
public class MemberProfileResponse {
	
	@JsonInclude(Include.NON_EMPTY)
	private List<Member> memberResponse;

	/**
	 * @return the memberResponse
	 */
	public List<Member> getMemberResponse() {
		return memberResponse;
	}

	/**
	 * @param memberResponse the memberResponse to set
	 */
	public void setMemberResponse(List<Member> memberResponse) {
		this.memberResponse = memberResponse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberResponse == null) ? 0 : memberResponse.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberProfileResponse other = (MemberProfileResponse) obj;
		if (memberResponse == null) {
			if (other.memberResponse != null)
				return false;
		} else if (!memberResponse.equals(other.memberResponse))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberProfileResponse [memberResponse=" + memberResponse + "]";
	}
	
	

}
