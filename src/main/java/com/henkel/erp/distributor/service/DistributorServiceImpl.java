package com.henkel.erp.distributor.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.henkel.erp.distributor.repository.DistributorRepository;
import com.henkel.erp.model.SmDistributor;
import com.henkel.erp.model.SmDistributorDataTable;

@Service
public class DistributorServiceImpl implements DistributorService{
	
	@Autowired
	DistributorRepository distributorRepository;
	
	@Transactional(readOnly = true)
	@Override
	public Optional<SmDistributor> findDistributorById(int id) {
		Optional<SmDistributor> dist=distributorRepository.findById(id);
		return dist;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public Map<String, String> saveOrUpdateDistributor(SmDistributor distributor) {

		Map<String,String> saveResponse=new HashMap<>();
		try {
			distributorRepository.saveAndFlush(distributor);
			saveResponse.put("status_code","200");
			saveResponse.put("status_response","Record Saved Sucessfully");
		}catch(Exception ex) {
			saveResponse.put("status_code","500");
			saveResponse.put("status_response",ex.getMessage());
			ex.printStackTrace();
		}
		return saveResponse;
	}



	@Override
	public Page<SmDistributorDataTable> getSmDistributorListByUserId(Integer userId, Pageable pageable) {
		
		return distributorRepository.getSmDistributorListByUserId(userId, pageable);
	}

}
