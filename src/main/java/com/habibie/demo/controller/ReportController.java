/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habibie.demo.controller;

import com.habibie.model.CustomResponse;
import com.habibie.model.ReportIp;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rizaldi Habibie
 */

@RestController
@RequestMapping("/demo")
public class ReportController {
    private String remoteAddress = "";
    
    @PostMapping(path = "/report",consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity postReport(@Valid @RequestBody ReportIp report, HttpServletRequest request){
        CustomResponse customResponse= new CustomResponse();
        customResponse.setStatus(200);
        customResponse.setMessage("OK");
        remoteAddress = request.getHeader("X-FORWARDED-FOR");
        if (null == remoteAddress || "".equals(remoteAddress)) {
            remoteAddress = request.getRemoteAddr();
        }
        report.setDetectedIp(remoteAddress);
        customResponse.setData(report);
        return new ResponseEntity<>(customResponse, HttpStatus.OK);
    }
}
