package de.myplantparadise.mpp.DataStorage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pascal
 */
public class Plant implements Serializable {
    //create variables
    private String name = "";
    private List<String> synonyms = new ArrayList();
    
    private NeighborType neighbor_type;
    
    private String ground = "";
    
    private String sowing_time_in = "";
    private String plant_time = "";
    private String sowing_time_out = "";
    private String harvest_time = "";
    
    private String sowing_depth = "";
    private String germination = "";
    private String space = "";
    
    private String picture = "";
    private String profile_file = "default";
    
    public Plant(String name) {
        this.name = name;
    }
    
    public Plant() {
        
    }
    //getter & setter
    public String getSynonymsString() {
        if(!synonyms.isEmpty()) {
            java.util.Collections.sort(this.synonyms);
            return this.synonyms.toString().replace("\"", "").replace("[", "").replace("]", "");
        } else { 
            return "";
        }
    }
    
    public List<String> getGoodNeighbors() {
        return this.neighbor_type.good_neighbors;
    }
    
    public String getGoodNeighborsString() {
        java.util.Collections.sort(this.neighbor_type.good_neighbors);
        return this.neighbor_type.good_neighbors.toString().replace("\"", "").replace("[", "").replace("]", "");
    }
    
    public List<String> getBadNeighbors() {
        return this.neighbor_type.bad_neighbors;
    }
    
    public String getBadNeighborsString() {
        java.util.Collections.sort(this.neighbor_type.bad_neighbors);
        return this.neighbor_type.bad_neighbors.toString().replace("\"", "").replace("[", "").replace("]", "");
    }
    
    public String getName() {
        return name;
    }

    public Plant setName(String name) {
        this.name = name;
        this.neighbor_type = new NeighborType(name);
        return this;
    }

    public NeighborType getNeighbor_type() {
        return neighbor_type;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }
   
    public Plant addToSynonyms(String... sorts) {
        this.synonyms.addAll(Arrays.asList(sorts));
        return this;
    }

    public String getGround() {
        return ground;
    }

    public Plant setGround(String ground) {
        this.ground = ground;
        return this;
    }

    public String getSowing_time_in() {
        return sowing_time_in;
    }

    public Plant setSowing_time_in(String sowing_time_in) {
        this.sowing_time_in = sowing_time_in;
        return this;
    }

    public String getPlant_time() {
        return plant_time;
    }

    public Plant setPlant_time(String plant_time) {
        this.plant_time = plant_time;
        return this;
    }

    public String getSowing_time_out() {
        return sowing_time_out;
    }

    public Plant setSowing_time_out(String sowing_time_out) {
        this.sowing_time_out = sowing_time_out;
        return this;
    }

    public String getHarvest_time() {
        return harvest_time;
    }

    public Plant setHarvest_time(String harvest_time) {
        this.harvest_time = harvest_time;
        return this;
    }

    public String getSowing_depth() {
        return sowing_depth;
    }

    public Plant setSowing_depth(String sowing_depth) {
        this.sowing_depth = sowing_depth;
        return this;
    }

    public String getGermination() {
        return germination;
    }

    public Plant setGermination(String germination) {
        this.germination = germination;
        return this;
    }

    public String getSpace() {
        return space;
    }

    public Plant setSpace(String space) {
        this.space = space;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public Plant setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public String getProfile_file() {
        return profile_file;
    }

    public void setProfile_file(String profile_file) {
        this.profile_file = profile_file;
    }

}
