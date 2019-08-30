package com.gohenry.coding.parentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gohenry.coding.parentdetails.entity.Parent;

public interface ParentDetailsRepository extends JpaRepository<Parent, Integer> {
	
}
