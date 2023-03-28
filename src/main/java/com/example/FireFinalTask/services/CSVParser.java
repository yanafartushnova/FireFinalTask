package com.example.FireFinalTask.services;

import com.example.FireFinalTask.model.FireItem;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    public List<FireItem> read() {
        List<FireItem> resultData = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/dataset/fire-occurence.csv"))) {
            boolean flag_head_line = true;
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            for (CSVRecord record : records) {
                if (flag_head_line){
                    flag_head_line = false;
                    continue;
                }
                FireItem line = new FireItem();
                if(!record.get(0).isEmpty()) {
                    line.setSerial(Integer.parseInt(record.get(0)));
                }
                else { line.setSerial(0); }
                if(!record.get(1).isEmpty()) {
                    line.setFireCategory(record.get(1));
                }
                else { line.setFireCategory(""); }
                if(!record.get(2).isEmpty()) {
                    line.setFireYear(Integer.parseInt(record.get(2)));
                }
                else { line.setFireYear(0); }
                if(!record.get(3).isEmpty()) {
                    line.setArea(record.get(3));
                }
                else { line.setArea(""); }
                if(!record.get(4).isEmpty()) {
                    line.setDistrictName(record.get(4));
                }
                else { line.setDistrictName(""); }
                if(!record.get(5).isEmpty()) {
                    line.setUnitName(record.get(5));
                }
                else { line.setUnitName(""); }
                if(!record.get(6).isEmpty()) {
                    line.setFullFireNumber(record.get(6));
                }
                else { line.setFullFireNumber(""); }
                if(!record.get(7).isEmpty()) {
                    line.setFireName(record.get(7));
                }
                else { line.setFireName(""); }
                if(!record.get(8).isEmpty()) {
                    line.setSize_class(record.get(8));
                }
                else { line.setSize_class(""); }
                if(!record.get(9).isEmpty()) {
                    line.setEstTotalAcres(Float.parseFloat(record.get(9)));
                }
                else { line.setEstTotalAcres(0); }
                if(!record.get(10).isEmpty()) {
                    line.setProtected_Acres(Float.parseFloat(record.get(10)));
                }
                else { line.setProtected_Acres(0); }
                if(!record.get(11).isEmpty()) {
                    line.setHumanOrLightning(record.get(11));
                }
                else { line.setHumanOrLightning(""); }
                if(!record.get(12).isEmpty()) {
                    line.setCauseBy(record.get(12));
                }
                else { line.setCauseBy(""); }
                if(!record.get(13).isEmpty()) {
                    line.setGeneralCause(record.get(13));
                }
                else { line.setGeneralCause(""); }
                if(!record.get(14).isEmpty()) {
                    line.setSpecificCause(record.get(14));
                }
                else { line.setSpecificCause(""); }
                if(!record.get(15).isEmpty()) {
                    line.setCause_Comments(record.get(15));
                }
                else { line.setCause_Comments(""); }
                if(!record.get(16).isEmpty()) {
                    line.setLat_DD(Float.parseFloat(record.get(16)));
                }
                else { line.setLat_DD(0); }
                if(!record.get(17).isEmpty()) {
                    line.setLong_DD(Float.parseFloat(record.get(17)));
                }
                else { line.setLong_DD(0); }
                if(!record.get(18).isEmpty()) {
                    line.setLatLongDD(record.get(18));
                }
                else { line.setLatLongDD(""); }
                if(!record.get(19).isEmpty()) {
                    line.setFO_LandOwnType(record.get(19));
                }
                else { line.setFO_LandOwnType(""); }
                if(!record.get(20).isEmpty()) {
                    line.setTwn(record.get(20));
                }
                else { line.setTwn(""); }
                if(!record.get(21).isEmpty()) {
                    line.setRng(record.get(21));
                }
                else { line.setRng(""); }
                if(!record.get(22).isEmpty()) {
                    line.setSec(Integer.parseInt(record.get(22)));
                }
                else { line.setSec(0); }
                if(!record.get(23).isEmpty()) {
                    line.setSubdiv(record.get(23));
                }
                else { line.setSubdiv(""); }
                if(!record.get(24).isEmpty()) {
                    line.setLandmarkLocation(record.get(24));
                }
                else { line.setLandmarkLocation(""); }
                if(!record.get(25).isEmpty()) {
                    line.setCounty(record.get(25));
                }
                else { line.setCounty(""); }
                if(!record.get(26).isEmpty()) {
                    line.setRegUseZone(record.get(26));
                }
                else { line.setRegUseZone(""); }
                if(!record.get(27).isEmpty()) {
                    line.setRegUseRestriction(record.get(27));
                }
                else { line.setRegUseRestriction(""); }
                if(!record.get(28).isEmpty()) {
                    line.setIndustrial_Restriction(record.get(28));
                }
                else { line.setIndustrial_Restriction(""); }
                if(!record.get(29).isEmpty()) {
                    line.setIgn_DateTime(record.get(29));
                }
                else { line.setIgn_DateTime(""); }
                if(!record.get(30).isEmpty()) {
                    line.setReportDateTime(record.get(30));
                }
                else { line.setReportDateTime(""); }
                if(!record.get(31).isEmpty()) {
                    line.setDiscover_DateTime(record.get(31));
                }
                else { line.setDiscover_DateTime(""); }
                if(!record.get(32).isEmpty()) {
                    line.setControl_DateTime(record.get(32));
                }
                else { line.setControl_DateTime(""); }
                if(!record.get(33).isEmpty()) {
                    line.setCreationDate(record.get(33));
                }
                else { line.setCreationDate(""); }
                if(!record.get(34).isEmpty()) {
                    line.setModifiedDate(record.get(34));
                }
                else { line.setModifiedDate(""); }
                if(!record.get(35).isEmpty()) {
                    line.setDistrictCode(Integer.parseInt(record.get(35)));
                }
                else { line.setDistrictCode(0); }
                if(!record.get(36).isEmpty()) {
                    line.setUnitCode(Integer.parseInt(record.get(36)));
                }
                else { line.setUnitCode(0); }
                if(!record.get(37).isEmpty()) {
                    line.setDistFireNumber(record.get(37));
                }
                else { line.setDistFireNumber(""); }
                resultData.add(line);
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultData;
    }
}

