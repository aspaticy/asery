package com.example.activiti.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.springframework.stereotype.Service;

import com.example.activiti.service.ActivitiService;

@Service
public class ActivitiServiceImpl implements ActivitiService {

	@Resource
	private RuntimeService runtimeService;
	
	public List<HistoricActivityInstance> select() {
		
		return null;
	}
	
}
