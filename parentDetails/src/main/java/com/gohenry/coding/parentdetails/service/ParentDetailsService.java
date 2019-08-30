package com.gohenry.coding.parentdetails.service;

import com.gohenry.coding.parentdetails.dto.ParentDataDto;
import com.gohenry.coding.parentdetails.exception.ParentDetailsNotFoundException;

public interface ParentDetailsService {
	
	public ParentDataDto getParentDetails(int id) throws ParentDetailsNotFoundException;

	public ParentDataDto saveParentData(ParentDataDto parentDataDto); 

}
