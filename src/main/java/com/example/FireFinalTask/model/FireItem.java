package com.example.FireFinalTask.model;

public class FireItem {
    private int Serial;
    private String FireCategory;
    private int FireYear;
    private String Area;
    private String DistrictName;
    private String UnitName;
    private String FullFireNumber;
    private String FireName;
    private String Size_class;
    private float EstTotalAcres;
    private float Protected_Acres;
    private String HumanOrLightning;
    private String CauseBy;
    private String GeneralCause;
    private String SpecificCause;
    private String Cause_Comments;
    private float Lat_DD;
    private float Long_DD;
    private String LatLongDD;
    private String FO_LandOwnType;
    private String Twn;
    private String Rng;
    private int Sec;
    private String Subdiv;
    private String LandmarkLocation;
    private String County;
    private String RegUseZone;
    private String RegUseRestriction;
    private String Industrial_Restriction;
    private String Ign_DateTime;
    private String ReportDateTime;
    private String Discover_DateTime;
    private String Control_DateTime;
    private String CreationDate;
    private String ModifiedDate;
    private int DistrictCode;
    private int UnitCode;
    private String DistFireNumber;

    // Constructor, getters, and setters

    public FireItem() {
    }
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int Serial) {
        this.Serial = Serial;
    }

    public String getFireCategory() {
        return FireCategory;
    }
    public void setFireCategory(String FireCategory) {
        this.FireCategory = FireCategory;
    }

    public int getFireYear() {
        return FireYear;
    }
    public void setFireYear(int FireYear) {
        this.FireYear = FireYear;
    }

    public String getArea() {
        return Area;
    }
    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getDistrictName() {
        return DistrictName;
    }
    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    public String getUnitName() {
        return UnitName;
    }
    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
    }

    public String getFullFireNumber() {
        return FullFireNumber;
    }
    public void setFullFireNumber(String FullFireNumber) {
        this.FullFireNumber = FullFireNumber;
    }

    public String getFireName() {
        return FireName;
    }
    public void setFireName(String FireName) {
        this.FireName = FireName;
    }

    public String getSize_class() {
        return Size_class;
    }
    public void setSize_class(String Size_class) {
        this.Size_class = Size_class;
    }

    public float getEstTotalAcres() {
        return EstTotalAcres;
    }
    public void setEstTotalAcres(float EstTotalAcres) {
        this.EstTotalAcres = EstTotalAcres;
    }

    public float getProtected_Acres() {
        return Protected_Acres;
    }
    public void setProtected_Acres(float Protected_Acres) {
        this.Protected_Acres = Protected_Acres;
    }

    public String getHumanOrLightning() {
        return HumanOrLightning;
    }
    public void setHumanOrLightning(String HumanOrLightning) {
        this.HumanOrLightning = HumanOrLightning;
    }

    public String getCauseBy() { return CauseBy; }
    public void setCauseBy(String CauseBy) {
        this.CauseBy = CauseBy;
    }

    public String getGeneralCause() { return GeneralCause; }
    public void setGeneralCause(String GeneralCause) {
        this.GeneralCause = GeneralCause;
    }

    public String getSpecificCause() { return SpecificCause; }
    public void setSpecificCause(String SpecificCause) { this.SpecificCause = SpecificCause; }

    public String getCause_Comments() { return Cause_Comments; }
    public void setCause_Comments(String Cause_Comments) { this.Cause_Comments = Cause_Comments; }

    public float getLat_DD() {
        return Lat_DD;
    }
    public void setLat_DD(float Lat_DD) {
        this.Lat_DD = Lat_DD;
    }

    public float getLong_DD() {
        return Long_DD;
    }
    public void setLong_DD(float Long_DD) {
        this.Long_DD = Long_DD;
    }

    public String getLatLongDD() { return LatLongDD; }
    public void setLatLongDD(String LatLongDD) { this.LatLongDD = LatLongDD; }

    public String getFO_LandOwnType() { return FO_LandOwnType; }
    public void setFO_LandOwnType(String FO_LandOwnType) { this.FO_LandOwnType = FO_LandOwnType; }

    public String getTwn() { return Twn; }
    public void setTwn(String Twn) { this.Twn = Twn; }

    public String getRng() { return Rng; }
    public void setRng(String Rng) { this.Rng = Rng; }

    public int getSec() {
        return Sec;
    }
    public void setSec(int Sec) {
        this.Sec = Sec;
    }

    public String getSubdiv() { return Subdiv; }
    public void setSubdiv(String Subdiv) { this.Subdiv = Subdiv; }

    public String getLandmarkLocation() { return LandmarkLocation; }
    public void setLandmarkLocation(String LandmarkLocation) { this.LandmarkLocation = LandmarkLocation; }

    public String getCounty() { return County; }
    public void setCounty(String County) { this.County = County; }

    public String getRegUseZone() { return RegUseZone; }
    public void setRegUseZone(String RegUseZone) { this.RegUseZone = RegUseZone; }

    public String getRegUseRestriction() { return RegUseRestriction; }
    public void setRegUseRestriction(String RegUseRestriction) { this.RegUseRestriction = RegUseRestriction; }

    public String getIndustrial_Restriction() { return Industrial_Restriction; }
    public void setIndustrial_Restriction(String Industrial_Restriction) { this.Industrial_Restriction = Industrial_Restriction; }

    public String getIgn_DateTime() { return Ign_DateTime; }
    public void setIgn_DateTime(String Ign_DateTime) { this.Ign_DateTime = Ign_DateTime; }

    public String getReportDateTime() { return ReportDateTime; }
    public void setReportDateTime(String ReportDateTime) { this.ReportDateTime = ReportDateTime; }

    public String getDiscover_DateTime() { return Discover_DateTime; }
    public void setDiscover_DateTime(String Discover_DateTime) { this.Discover_DateTime = Discover_DateTime; }

    public String getControl_DateTime() { return Control_DateTime; }
    public void setControl_DateTime(String Control_DateTime) { this.Control_DateTime = Control_DateTime; }

    public String getCreationDate() { return CreationDate; }
    public void setCreationDate(String CreationDate) { this.CreationDate = CreationDate; }

    public String getModifiedDate() { return ModifiedDate; }
    public void setModifiedDate(String ModifiedDate) { this.ModifiedDate = ModifiedDate; }

    public int getDistrictCode() {
        return DistrictCode;
    }
    public void setDistrictCode(int DistrictCode) {
        this.DistrictCode = DistrictCode;
    }

    public int getUnitCode() {
        return UnitCode;
    }
    public void setUnitCode(int UnitCode) {
        this.UnitCode = UnitCode;
    }

    public String getDistFireNumber() { return DistFireNumber; }
    public void setDistFireNumber(String DistFireNumber) { this.DistFireNumber = DistFireNumber; }
}