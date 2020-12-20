package com.devfun.settingweb_boot.dao;

import java.util.List;

import com.devfun.settingweb_boot.vo.StatistcOrganVO;

public interface StatistcOrganDAO {
	List<StatistcOrganVO> selectStatistcByOrgan(String param) throws Exception;
}