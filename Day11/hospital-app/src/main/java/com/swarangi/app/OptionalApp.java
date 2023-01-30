package com.swarangi.app;

import com.swarangi.app.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalApp {

    public Optional<Hospital> getHospital(String name){
        Hospital h1=new Hospital("1","Hospital6","Kanpur");
        Hospital h2=new Hospital("2","Hospital2","Pune");
        Map<String ,Hospital> data =new HashMap<>();
        data.put("1", h1);
        data.put("2", h1);
        Hospital result= data.get(name);
        return Optional.ofNullable(result);
    }
}
