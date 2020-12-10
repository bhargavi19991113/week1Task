package com.sj.service;

import java.util.List;

import com.sj.Model.Requirement;

public interface RequirementService {

	public List<Requirement> getAllRequirements();

	public Requirement getRequirementById(int id);

	public Requirement insertRequirement(Requirement r);

	public Requirement updateRequirement(Requirement r);

	public void deleteRequirement(int id);

}