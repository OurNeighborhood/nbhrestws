package com.neighborhood.restws.common.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.neighborhood.restws.common.dao.ResidencyDAO;

/**
 * 
 * @author Balaji N
 *
 */
@Repository
public class ResidencyDAOImpl implements ResidencyDAO {
	@Autowired
	private JdbcTemplate nbhJdbcTemplate;

	public ResidencyDAOImpl(JdbcTemplate jdbcTemplate) {
		this.nbhJdbcTemplate = jdbcTemplate;
	}

	public ResidencyDAOImpl() {
	}
}
