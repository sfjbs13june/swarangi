package com.swarangi.app.controller;

import com.swarangi.app.model.Hospital;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class HospitalController {

        @GetMapping("/get/hospitals")
        public List<Hospital> getHospital(){
        List listHospital=new ArrayList();
        Hospital hospital1=new Hospital("1","Hopital1","delhi");
        Hospital hospital2=new Hospital("2","Hospital2","Mumbai");
        Hospital hospital3=new Hospital("3","Hospital3","Pune");

        listHospital.add(hospital1);
        listHospital.add(hospital2);
        listHospital.add(hospital3);
        return listHospital;
    }

        @GetMapping("/map/hospitals")
        public Map mapHospital(){
        Map hospitalMap=new HashMap();
        Hospital hospital1=new Hospital("1","Hospital4","Nagpur");
        Hospital hospital2=new Hospital("4","Hospital5","Nashik");
        Hospital hospital3=new Hospital("6","Hospital6","Nanded");

        hospitalMap.put(hospital1.getId(),hospital1);
        hospitalMap.put(hospital1.getId(),hospital2);
        hospitalMap.put(hospital1.getId(),hospital3);

        return hospitalMap;

    }
}
