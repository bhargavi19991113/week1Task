package com.sj.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.Model.Requirement;
@Repository
public interface RequirementRepository extends JpaRepository<Requirement,Integer>{

}
