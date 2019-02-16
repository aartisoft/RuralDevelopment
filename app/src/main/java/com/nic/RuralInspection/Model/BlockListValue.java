package com.nic.RuralInspection.Model;

import android.graphics.Bitmap;

/**
 * Created by AchanthiSundar on 01-11-2017.
 */

public class BlockListValue {

    private String distictCode;
    private String blockCode;
    private String VillageListDistrictCode;
    private String VillageListBlockCode;
    private String Description;
    private String Latitude;
    private String observation;
    private String date_of_inspection;
    private String inspection_remark;

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    private String Longitude;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Bitmap getImage() {
        return Image;
    }

    public void setImage(Bitmap image) {
        Image = image;
    }

    private Bitmap Image ;

    public String getVillageListDistrictCode() {
        return VillageListDistrictCode;
    }

    public void setVillageListDistrictCode(String villageListDistrictCode) {
        VillageListDistrictCode = villageListDistrictCode;
    }

    public String getVillageListBlockCode() {
        return VillageListBlockCode;
    }

    public void setVillageListBlockCode(String villageListBlockCode) {
        VillageListBlockCode = villageListBlockCode;
    }

    public String getVillageListPvCode() {
        return VillageListPvCode;
    }

    public void setVillageListPvCode(String villageListPvCode) {
        VillageListPvCode = villageListPvCode;
    }

    public String getVillageListPvName() {
        return VillageListPvName;
    }

    public void setVillageListPvName(String villageListPvName) {
        VillageListPvName = villageListPvName;
    }

    private String VillageListPvCode;
    private String VillageListPvName;


    public String getPvCode() {
        return pvCode;
    }

    public void setPvCode(String pvCode) {
        this.pvCode = pvCode;
    }

    private String pvCode;
    private String blockName;
    private String schemeName;
    private String projectName;
    private String schemeSequentialID;
    private String selectedBlockCode;
    private String schemeID;
    private String workGroupID;
    private String workTypeID;
    private String workID;
    private String workName;
    private String asAmount;
    private String tsAmount;
    private String isHighValue;
    private String workStageCode;
    private String workStageOrder;
    private String workStageName;
    private String projectID;
    private String observationName;

//    public BlockListValue(String bcode, String scheme_id, String work_id, String as_value, String is_high_value) {
//        this.blockCode = bcode;
//        this.schemeID = scheme_id;
//        this.workID = work_id;
//        this.asAmount = as_value;
//        this.isHighValue = is_high_value;
//    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    private String financialYear;

    public String getSchemeSequentialID() {
        return schemeSequentialID;
    }

    public void setSchemeSequentialID(String schemeSequentialID) {
        this.schemeSequentialID = schemeSequentialID;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectID() {
        return projectID;
    }


    public String getDistictCode() {
        return distictCode;
    }

    public void setDistictCode(String distictCode) {
        this.distictCode = distictCode;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getSelectedBlockCode() {
        return selectedBlockCode;
    }

    public void setSelectedBlockCode(String selectedBlockCode) {
        this.selectedBlockCode = selectedBlockCode;
    }

    public String getSchemeID() {
        return schemeID;
    }

    public void setSchemeID(String schemeID) {
        this.schemeID = schemeID;
    }

    public void setWorkGroupID(String workGroupID) {
        this.workGroupID = workGroupID;
    }

    public String getWorkGroupID() {
        return workGroupID;
    }

    public void setWorkTypeID(String workTypeID) {
        this.workTypeID = workTypeID;
    }

    public String getWorkTypeID() {
        return workTypeID;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getAsAmount() {
        return asAmount;
    }

    public void setAsAmount(String asAmount) {
        this.asAmount = asAmount;
    }

    public String getTsAmount() {
        return tsAmount;
    }

    public void setTsAmount(String tsAmount) {
        this.tsAmount = tsAmount;
    }

    public String getIsHighValue() {
        return isHighValue;
    }

    public void setIsHighValue(String isHighValue) {
        this.isHighValue = isHighValue;
    }

    public void setWorkStageCode(String workStageCode) {
        this.workStageCode = workStageCode;
    }

    public String getWorkStageCode() {
        return workStageCode;
    }

    public void setWorkStageOrder(String workStageOrder) {
        this.workStageOrder = workStageOrder;
    }

    public String getWorkStageOrder() {
        return workStageOrder;
    }

    public void setWorkStageName(String workStageName) {
        this.workStageName = workStageName;
    }

    public String getWorkStageName() {
        return workStageName;
    }

    public void setObservationName(String observationName) {
        this.observationName = observationName;
    }

    public String getObservationName() {
        return observationName;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getDate_of_inspection() {
        return date_of_inspection;
    }

    public void setDate_of_inspection(String date_of_inspection) {
        this.date_of_inspection = date_of_inspection;
    }

    public String getInspection_remark() {
        return inspection_remark;
    }

    public void setInspection_remark(String inspection_remark) {
        this.inspection_remark = inspection_remark;
    }


}