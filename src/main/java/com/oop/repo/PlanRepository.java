package com.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan,Long>{

}
