package com.gohenry.coding.parentdetails.service;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gohenry.coding.parentdetails.dto.ParentDataDto;
import com.gohenry.coding.parentdetails.entity.Parent;
import com.gohenry.coding.parentdetails.exception.ParentDetailsNotFoundException;
import com.gohenry.coding.parentdetails.repository.ParentDetailsRepository;

@Service
@Transactional
public class ParentDataServiceImpl implements ParentDetailsService {

	@Autowired
	ParentDetailsRepository parentDetailsRepository;

	@Autowired
	private DozerBeanMapper mapper;

	@Override
	public ParentDataDto getParentDetails(int id) throws ParentDetailsNotFoundException {
		Parent parent = parentDetailsRepository.findById(id)
				.orElseThrow(() -> new ParentDetailsNotFoundException("Parent Details Not Found"));
		return mapper.map(parent, ParentDataDto.class);
	}

	@Override
	public ParentDataDto saveParentData(ParentDataDto parentDataDto) {
		Parent parent = parentDetailsRepository.save(mapper.map(parentDataDto, Parent.class));
		return mapper.map(parent, ParentDataDto.class);
	}

}
