package com.group_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.group_4.modal.Category;
import com.group_4.modal.ItemTypes;
import com.group_4.service.TypeService;

@RestController
@RequestMapping(value="/typecloud")
public class TypeController {
	
	@Autowired
	TypeService typeService;
	
	@RequestMapping(value="/itemType", method=RequestMethod.POST)
	public ItemTypes save(@RequestBody ItemTypes itemTypes)
	{
		
		return typeService.save(itemTypes);
	}

}
