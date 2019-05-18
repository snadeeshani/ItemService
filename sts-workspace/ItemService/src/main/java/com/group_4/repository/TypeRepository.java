package com.group_4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group_4.modal.Category;
import com.group_4.modal.ItemTypes;

public interface TypeRepository extends JpaRepository<ItemTypes, Integer> {
 
	public List<ItemTypes> findByCategoryId (Integer cid);
}
