package com.henkel.erp.distributor.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.henkel.erp.model.SmDistributor;
import com.henkel.erp.model.SmDistributorDataTable;

public interface DistributorService {

	public Optional<SmDistributor> findDistributorById(int id);
	
	public Page<SmDistributorDataTable> getSmDistributorListByUserId(Integer userId,Pageable pageable);
	
	public Map<String,String> saveOrUpdateDistributor(SmDistributor distributor);
}
