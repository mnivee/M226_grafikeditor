package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gruppe {
    private List<Gruppe> childGruppe;

    public Gruppe(){
        childGruppe= new ArrayList<>();
    }
}
