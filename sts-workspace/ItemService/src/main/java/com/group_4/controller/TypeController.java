package com.group_4.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="category/{cid}/itemtype", method=RequestMethod.POST)
	public void saveType( @RequestBody ItemTypes itemTypes,@PathVariable Integer cid )
	{
		itemTypes.setCategory(new Category (cid, ""));
		typeService.saveType(itemTypes);
	}

}
