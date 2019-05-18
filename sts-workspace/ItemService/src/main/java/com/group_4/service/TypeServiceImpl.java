package com.group_4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group_4.modal.Category;
import com.group_4.modal.ItemTypes;
import com.group_4.repository.CategoryRepository;
import com.group_4.repository.TypeRepository;

import javassist.NotFoundException;

@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	TypeRepository typeRepository;
	
	public List <ItemTypes> getAllTypes(Integer cid)
	{
		List<ItemTypes> types= new ArrayList<>();
		typeRepository.findByCategoryId(cid).forEach(types :: add);
		return types;
	}
	
	public Optional<ItemTypes> getItemTypes(Integer id)
	{
		return typeRepository.findById(id);
	}
	
	@Override
	public void saveType(ItemTypes itemTypes)
	{
		typeRepository.save(itemTypes);
	}

	
	
	
	

//	@Override
//	public ItemTypes save(ItemTypes itemTypes, Integer cid) {
//		
//		try {
//			return categoryRepository.findById(cid)
//					.map(category ->{
//						itemTypes.setCategory(category);
//						return typeRepository.save(itemTypes);
//					}).orElseThrow(() -> new NotFoundException("Category is not found!"));
//		} catch (NotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return itemTypes;
// }

	

	

}
