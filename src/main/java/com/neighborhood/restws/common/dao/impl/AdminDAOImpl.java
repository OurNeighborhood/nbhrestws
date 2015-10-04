package com.neighborhood.restws.common.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.neighborhood.restws.common.dao.AdminDAO;

/**
 * 
 * @author Balaji N
 *
 */
@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private JdbcTemplate nbhJdbcTemplate;

	public AdminDAOImpl(JdbcTemplate jdbcTemplate) {
		this.nbhJdbcTemplate = jdbcTemplate;
	}

	public AdminDAOImpl() {
	}
}
