package com.henkel.erp.distributor.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.henkel.erp.model.SmDistributor;
import com.henkel.erp.model.SmDistributorDataTable;

@Repository
public interface DistributorRepository extends JpaRepository<SmDistributor,Integer>{
	
	@Query(
		value = "select dist_id as distId,dist_idh_code as distIdhCode,dist_dist_name as distDistName,dist_zone_id as distZoneId,dist_keycontact as distKeycontact from ssa.sm_distributor where dist_id in(select * from ssa.getalldistid(:userId))",
		countQuery = "select count(*) from ssa.sm_distributor where dist_id in(select * from ssa.getalldistid(:userId))",
		nativeQuery = true
	)
	public Page<SmDistributorDataTable> getSmDistributorListByUserId(@Param("userId") Integer userId,Pageable pageable);

}
