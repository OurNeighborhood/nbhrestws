package com.neighborhood.restws.common.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neighborhood.restws.common.service.NbhService;

@Controller
@RequestMapping("/service/")
public class BackEndController {

	private static Logger logger = Logger.getLogger(BackEndController.class);

	@Autowired
	private NbhService nbhService;

}