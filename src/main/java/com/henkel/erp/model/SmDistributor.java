package com.henkel.erp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sm_distributor database table.
 * 
 */
@Entity
@Table(name="sm_distributor",schema = "ssa")
public class SmDistributor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SM_DISTRIBUTOR_SEQ")
	@SequenceGenerator(name="SM_DISTRIBUTOR_SEQ",sequenceName = "sm_distributor_dist_id_seq",allocationSize = 1,schema = "ssa" )
	@Column(name="dist_id")
	private Integer distId;

	@Column(name="dist_active")
	private Integer distActive;

	@Column(name="dist_add1")
	private String distAdd1;

	@Column(name="dist_add2")
	private String distAdd2;

	@Column(name="dist_add3")
	private String distAdd3;

	@Column(name="dist_alied1")
	private Integer distAlied1;

	@Column(name="dist_alied2")
	private Integer distAlied2;

	@Column(name="dist_alied3")
	private Integer distAlied3;

	@Column(name="dist_alied4")
	private Integer distAlied4;

	@Column(name="dist_alied5")
	private Integer distAlied5;

	@Column(name="dist_alied6")
	private Integer distAlied6;

	@Column(name="dist_alied7")
	private Integer distAlied7;

	@Column(name="dist_approval")
	private Integer distApproval;

	@Temporal(TemporalType.DATE)
	@Column(name="dist_chq_dt")
	private Date distChqDt;

	@Column(name="dist_chq_no")
	private String distChqNo;

	@Column(name="dist_city")
	private String distCity;

	@Column(name="dist_country_id")
	private Integer distCountryId;

	@Column(name="dist_cr_dt")
	private Timestamp distCrDt;

	@Column(name="dist_cr_uid")
	private Integer distCrUid;

	@Column(name="dist_customer_count")
	private Integer distCustomerCount;

	@Column(name="dist_dist_name")
	private String distDistName;

	@Column(name="dist_dist_shortname")
	private String distDistShortname;

	@Column(name="dist_dist_type")
	private String distDistType;

	@Column(name="dist_district")
	private String distDistrict;

	@Column(name="dist_email")
	private String distEmail;

	@Column(name="dist_email_group")
	private String distEmailGroup;

	@Column(name="dist_engg_id")
	private Integer distEnggId;

	@Column(name="dist_establishment_year")
	private Integer distEstablishmentYear;

	@Column(name="dist_gst_no")
	private String distGstNo;

	@Column(name="dist_idh_code")
	private String distIdhCode;

	@Column(name="dist_keycontact")
	private String distKeycontact;

	@Column(name="dist_keycontact_title")
	private Integer distKeycontactTitle;

	@Column(name="dist_landline_no")
	private String distLandlineNo;

	@Column(name="dist_legalnature")
	private Integer distLegalnature;

	@Column(name="dist_nofinance_emp")
	private Integer distNofinanceEmp;

	@Column(name="dist_noof_customer")
	private Integer distNoofCustomer;

	@Column(name="dist_noofcount_emp")
	private Integer distNoofcountEmp;

	@Column(name="dist_noofemp")
	private Integer distNoofemp;

	@Column(name="dist_noofsales_emp")
	private Integer distNoofsalesEmp;

	@Column(name="dist_nooftech_emp")
	private Integer distNooftechEmp;

	@Column(name="dist_pan_no")
	private String distPanNo;

	@Column(name="dist_phone")
	private String distPhone;

	@Column(name="dist_pincode")
	private String distPincode;

	@Column(name="dist_remarks")
	private String distRemarks;

	@Column(name="dist_seq_amount")
	private Integer distSeqAmount;

	@Column(name="dist_state_id")
	private Integer distStateId;

	@Column(name="dist_taluka")
	private String distTaluka;

	@Column(name="dist_total_turnover")
	private Integer distTotalTurnover;

	@Column(name="dist_turnover1")
	private Integer distTurnover1;

	@Column(name="dist_turnover2")
	private Integer distTurnover2;

	@Column(name="dist_turnover3")
	private Integer distTurnover3;

	@Column(name="dist_turnover4")
	private Integer distTurnover4;

	@Column(name="dist_turnover5")
	private Integer distTurnover5;

	@Column(name="dist_turnover6")
	private Integer distTurnover6;

	@Column(name="dist_turnover7")
	private Integer distTurnover7;

	@Column(name="dist_up_dt")
	private Timestamp distUpDt;

	@Column(name="dist_up_uid")
	private Integer distUpUid;

	@Column(name="dist_username")
	private String distUsername;

	@Column(name="dist_website")
	private String distWebsite;

	@Column(name="dist_zone_id")
	private Integer distZoneId;


	public SmDistributor() {
	}

	public Integer getDistId() {
		return this.distId;
	}

	public void setDistId(Integer distId) {
		this.distId = distId;
	}

	public Integer getDistActive() {
		return this.distActive;
	}

	public void setDistActive(Integer distActive) {
		this.distActive = distActive;
	}

	public String getDistAdd1() {
		return this.distAdd1;
	}

	public void setDistAdd1(String distAdd1) {
		this.distAdd1 = distAdd1;
	}

	public String getDistAdd2() {
		return this.distAdd2;
	}

	public void setDistAdd2(String distAdd2) {
		this.distAdd2 = distAdd2;
	}

	public String getDistAdd3() {
		return this.distAdd3;
	}

	public void setDistAdd3(String distAdd3) {
		this.distAdd3 = distAdd3;
	}

	public Integer getDistAlied1() {
		return this.distAlied1;
	}

	public void setDistAlied1(Integer distAlied1) {
		this.distAlied1 = distAlied1;
	}

	public Integer getDistAlied2() {
		return this.distAlied2;
	}

	public void setDistAlied2(Integer distAlied2) {
		this.distAlied2 = distAlied2;
	}

	public Integer getDistAlied3() {
		return this.distAlied3;
	}

	public void setDistAlied3(Integer distAlied3) {
		this.distAlied3 = distAlied3;
	}

	public Integer getDistAlied4() {
		return this.distAlied4;
	}

	public void setDistAlied4(Integer distAlied4) {
		this.distAlied4 = distAlied4;
	}

	public Integer getDistAlied5() {
		return this.distAlied5;
	}

	public void setDistAlied5(Integer distAlied5) {
		this.distAlied5 = distAlied5;
	}

	public Integer getDistAlied6() {
		return this.distAlied6;
	}

	public void setDistAlied6(Integer distAlied6) {
		this.distAlied6 = distAlied6;
	}

	public Integer getDistAlied7() {
		return this.distAlied7;
	}

	public void setDistAlied7(Integer distAlied7) {
		this.distAlied7 = distAlied7;
	}

	public Integer getDistApproval() {
		return this.distApproval;
	}

	public void setDistApproval(Integer distApproval) {
		this.distApproval = distApproval;
	}

	public Date getDistChqDt() {
		return this.distChqDt;
	}

	public void setDistChqDt(Date distChqDt) {
		this.distChqDt = distChqDt;
	}

	public String getDistChqNo() {
		return this.distChqNo;
	}

	public void setDistChqNo(String distChqNo) {
		this.distChqNo = distChqNo;
	}

	public String getDistCity() {
		return this.distCity;
	}

	public void setDistCity(String distCity) {
		this.distCity = distCity;
	}

	public Integer getDistCountryId() {
		return this.distCountryId;
	}

	public void setDistCountryId(Integer distCountryId) {
		this.distCountryId = distCountryId;
	}

	public Timestamp getDistCrDt() {
		return this.distCrDt;
	}

	public void setDistCrDt(Timestamp distCrDt) {
		this.distCrDt = distCrDt;
	}

	public Integer getDistCrUid() {
		return this.distCrUid;
	}

	public void setDistCrUid(Integer distCrUid) {
		this.distCrUid = distCrUid;
	}

	public Integer getDistCustomerCount() {
		return this.distCustomerCount;
	}

	public void setDistCustomerCount(Integer distCustomerCount) {
		this.distCustomerCount = distCustomerCount;
	}

	public String getDistDistName() {
		return this.distDistName;
	}

	public void setDistDistName(String distDistName) {
		this.distDistName = distDistName;
	}

	public String getDistDistShortname() {
		return this.distDistShortname;
	}

	public void setDistDistShortname(String distDistShortname) {
		this.distDistShortname = distDistShortname;
	}

	public String getDistDistType() {
		return this.distDistType;
	}

	public void setDistDistType(String distDistType) {
		this.distDistType = distDistType;
	}

	public String getDistDistrict() {
		return this.distDistrict;
	}

	public void setDistDistrict(String distDistrict) {
		this.distDistrict = distDistrict;
	}

	public String getDistEmail() {
		return this.distEmail;
	}

	public void setDistEmail(String distEmail) {
		this.distEmail = distEmail;
	}

	public String getDistEmailGroup() {
		return this.distEmailGroup;
	}

	public void setDistEmailGroup(String distEmailGroup) {
		this.distEmailGroup = distEmailGroup;
	}

	public Integer getDistEnggId() {
		return this.distEnggId;
	}

	public void setDistEnggId(Integer distEnggId) {
		this.distEnggId = distEnggId;
	}

	public Integer getDistEstablishmentYear() {
		return this.distEstablishmentYear;
	}

	public void setDistEstablishmentYear(Integer distEstablishmentYear) {
		this.distEstablishmentYear = distEstablishmentYear;
	}

	public String getDistGstNo() {
		return this.distGstNo;
	}

	public void setDistGstNo(String distGstNo) {
		this.distGstNo = distGstNo;
	}

	public String getDistIdhCode() {
		return this.distIdhCode;
	}

	public void setDistIdhCode(String distIdhCode) {
		this.distIdhCode = distIdhCode;
	}

	public String getDistKeycontact() {
		return this.distKeycontact;
	}

	public void setDistKeycontact(String distKeycontact) {
		this.distKeycontact = distKeycontact;
	}

	public Integer getDistKeycontactTitle() {
		return this.distKeycontactTitle;
	}

	public void setDistKeycontactTitle(Integer distKeycontactTitle) {
		this.distKeycontactTitle = distKeycontactTitle;
	}

	public String getDistLandlineNo() {
		return this.distLandlineNo;
	}

	public void setDistLandlineNo(String distLandlineNo) {
		this.distLandlineNo = distLandlineNo;
	}

	public Integer getDistLegalnature() {
		return this.distLegalnature;
	}

	public void setDistLegalnature(Integer distLegalnature) {
		this.distLegalnature = distLegalnature;
	}

	public Integer getDistNofinanceEmp() {
		return this.distNofinanceEmp;
	}

	public void setDistNofinanceEmp(Integer distNofinanceEmp) {
		this.distNofinanceEmp = distNofinanceEmp;
	}

	public Integer getDistNoofCustomer() {
		return this.distNoofCustomer;
	}

	public void setDistNoofCustomer(Integer distNoofCustomer) {
		this.distNoofCustomer = distNoofCustomer;
	}

	public Integer getDistNoofcountEmp() {
		return this.distNoofcountEmp;
	}

	public void setDistNoofcountEmp(Integer distNoofcountEmp) {
		this.distNoofcountEmp = distNoofcountEmp;
	}

	public Integer getDistNoofemp() {
		return this.distNoofemp;
	}

	public void setDistNoofemp(Integer distNoofemp) {
		this.distNoofemp = distNoofemp;
	}

	public Integer getDistNoofsalesEmp() {
		return this.distNoofsalesEmp;
	}

	public void setDistNoofsalesEmp(Integer distNoofsalesEmp) {
		this.distNoofsalesEmp = distNoofsalesEmp;
	}

	public Integer getDistNooftechEmp() {
		return this.distNooftechEmp;
	}

	public void setDistNooftechEmp(Integer distNooftechEmp) {
		this.distNooftechEmp = distNooftechEmp;
	}

	public String getDistPanNo() {
		return this.distPanNo;
	}

	public void setDistPanNo(String distPanNo) {
		this.distPanNo = distPanNo;
	}

	public String getDistPhone() {
		return this.distPhone;
	}

	public void setDistPhone(String distPhone) {
		this.distPhone = distPhone;
	}

	public String getDistPincode() {
		return this.distPincode;
	}

	public void setDistPincode(String distPincode) {
		this.distPincode = distPincode;
	}

	public String getDistRemarks() {
		return this.distRemarks;
	}

	public void setDistRemarks(String distRemarks) {
		this.distRemarks = distRemarks;
	}

	public Integer getDistSeqAmount() {
		return this.distSeqAmount;
	}

	public void setDistSeqAmount(Integer distSeqAmount) {
		this.distSeqAmount = distSeqAmount;
	}

	public Integer getDistStateId() {
		return this.distStateId;
	}

	public void setDistStateId(Integer distStateId) {
		this.distStateId = distStateId;
	}

	public String getDistTaluka() {
		return this.distTaluka;
	}

	public void setDistTaluka(String distTaluka) {
		this.distTaluka = distTaluka;
	}

	public Integer getDistTotalTurnover() {
		return this.distTotalTurnover;
	}

	public void setDistTotalTurnover(Integer distTotalTurnover) {
		this.distTotalTurnover = distTotalTurnover;
	}

	public Integer getDistTurnover1() {
		return this.distTurnover1;
	}

	public void setDistTurnover1(Integer distTurnover1) {
		this.distTurnover1 = distTurnover1;
	}

	public Integer getDistTurnover2() {
		return this.distTurnover2;
	}

	public void setDistTurnover2(Integer distTurnover2) {
		this.distTurnover2 = distTurnover2;
	}

	public Integer getDistTurnover3() {
		return this.distTurnover3;
	}

	public void setDistTurnover3(Integer distTurnover3) {
		this.distTurnover3 = distTurnover3;
	}

	public Integer getDistTurnover4() {
		return this.distTurnover4;
	}

	public void setDistTurnover4(Integer distTurnover4) {
		this.distTurnover4 = distTurnover4;
	}

	public Integer getDistTurnover5() {
		return this.distTurnover5;
	}

	public void setDistTurnover5(Integer distTurnover5) {
		this.distTurnover5 = distTurnover5;
	}

	public Integer getDistTurnover6() {
		return this.distTurnover6;
	}

	public void setDistTurnover6(Integer distTurnover6) {
		this.distTurnover6 = distTurnover6;
	}

	public Integer getDistTurnover7() {
		return this.distTurnover7;
	}

	public void setDistTurnover7(Integer distTurnover7) {
		this.distTurnover7 = distTurnover7;
	}

	public Timestamp getDistUpDt() {
		return this.distUpDt;
	}

	public void setDistUpDt(Timestamp distUpDt) {
		this.distUpDt = distUpDt;
	}

	public Integer getDistUpUid() {
		return this.distUpUid;
	}

	public void setDistUpUid(Integer distUpUid) {
		this.distUpUid = distUpUid;
	}

	public String getDistUsername() {
		return this.distUsername;
	}

	public void setDistUsername(String distUsername) {
		this.distUsername = distUsername;
	}

	public String getDistWebsite() {
		return this.distWebsite;
	}

	public void setDistWebsite(String distWebsite) {
		this.distWebsite = distWebsite;
	}

	public Integer getDistZoneId() {
		return this.distZoneId;
	}

	public void setDistZoneId(Integer distZoneId) {
		this.distZoneId = distZoneId;
	}

}