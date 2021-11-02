/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habibie.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rizaldi Habibie
 */
public class ReportIp {
    
    @NotNull
    private String id;
    
    @NotBlank(message = "ip is mandatory")
    private String ip;
    
    private String detectedIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDetectedIp() {
        return detectedIp;
    }

    public void setDetectedIp(String detectedIp) {
        this.detectedIp = detectedIp;
    }
    
}
