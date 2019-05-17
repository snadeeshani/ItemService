package com.group_4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group_4.modal.ItemTypes;
import com.group_4.repository.TypeRepository;

@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	TypeRepository typeRepository;

	@Override
	public ItemTypes save(ItemTypes itemTypes) {
		
		return typeRepository.save(itemTypes);
	}

}
