package com.neighborhood.restws.common.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neighborhood.restws.common.dao.ResidencyDAO;

/**
 * 
 * @author Balaji N
 *
 */

@Component
public class CacheComponent {
	@Autowired
	private ResidencyDAO residencyDAO;
}
