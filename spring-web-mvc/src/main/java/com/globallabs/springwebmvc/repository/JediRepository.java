package com.globallabs.springwebmvc.repository;


import java.util.ArrayList;
import java.util.List;

import com.globallabs.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;



@Repository
public class JediRepository {
    private List<Jedi> jedi;

    public List<Jedi> getAllJedi(){

        jedi = new ArrayList<>();
        jedi.add(new Jedi( name: "Luke", lastname: "Skywalker"));

        return jedi;
    }

    public void add (final Jedi jedi)
    {

    }

}
