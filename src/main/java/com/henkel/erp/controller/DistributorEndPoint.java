package com.henkel.erp.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.henkel.erp.distributor.service.DistributorService;
import com.henkel.erp.exception.HenkelServiceCustomException;
import com.henkel.erp.model.SmDistributor;
import com.henkel.erp.model.SmDistributorDataTable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value="Henkel Distributor EndPoint")
public class DistributorEndPoint {

	@Autowired
	DistributorService distributorService;


	@ApiOperation(value = "Get an Distributor by Id",response = SmDistributor.class)
	@RequestMapping(value = "/findDistributorById",method = RequestMethod.GET)
	public ResponseEntity<SmDistributor> findDistributorById(
			@ApiParam(value = "Distributor id from which distributor object will retrieve", required = true)
			@RequestParam int id){

		SmDistributor response=distributorService.findDistributorById(id).orElseThrow(()-> new HenkelServiceCustomException("Distributor ID:"+id+" not found in DB"));
		return new ResponseEntity<SmDistributor>(response,HttpStatus.OK);
	}
	

	@ApiOperation(value = "Save/Update Distributor in DB",response = Map.class)
	@PostMapping(value = "/saveOrUpdateDistributor")
	public Map<String, String> saveOrUpdateDistributor(
			@ApiParam(value = "Save/Update Distributor object in DB",required = true)
			@RequestBody SmDistributor distributor) {
		
		return distributorService.saveOrUpdateDistributor(distributor);
	}

	
	@ApiOperation(value = "Get Distributor List by User Id")
	@RequestMapping(value = "/findDistributorList",method = RequestMethod.GET)
	public ResponseEntity<Page<SmDistributorDataTable>> findDistributorList(@RequestParam Integer userId, Pageable pageable){

		Page<SmDistributorDataTable> response=distributorService.getSmDistributorListByUserId(userId, pageable); 
		return new ResponseEntity<Page<SmDistributorDataTable>>(response,HttpStatus.OK); 

	}
	 


}
