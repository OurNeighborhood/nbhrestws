package com.neighborhood.restws.common.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neighborhood.restws.common.dao.ResidencyDAO;
import com.neighborhood.restws.common.service.NbhService;
/**
 * 
 * @author Balaji N
 *
 */
@Service
public class NbhServiceImpl implements NbhService {
	
	private static Logger logger = Logger.getLogger(NbhServiceImpl.class);
	
	@Autowired
	private ResidencyDAO residencyDAO;

}