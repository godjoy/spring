package com.devfun.settingweb_boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfun.settingweb_boot.dao.StatistcDAO;
import com.devfun.settingweb_boot.vo.StatistcVO;

@RestController
@MapperScan(basePackages="com.devfun.settingweb_boot.dao")
public class HomeContoller {
	@Autowired
	private StatistcDAO statistcDAO;

	@RequestMapping("/home/allStatistc")
	public List<StatistcVO> statistc() throws Exception {
		final List<StatistcVO> resultList = statistcDAO.selectAll();
		return resultList;
	}
	
	@RequestMapping("/home/sqlyearStatistc")
	public List<StatistcVO> statistc(@RequestParam(value="year", defaultValue = "")String year) throws Exception {
		String param = year;
		final List<StatistcVO> resultList = statistcDAO.selectStastic(param);
		return resultList;
	}
	
}
