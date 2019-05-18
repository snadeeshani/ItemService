package com.group_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group_4.modal.ItemTypes;

public interface TypeRepository extends JpaRepository<ItemTypes, Integer> {

}
