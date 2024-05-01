package ru.mpei.cimmaintainer.tocim.rdf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RdfResourcesIdTest {
    @Test
    public void getRandomId(){
        RdfResourcesId rdfResourcesId = new RdfResourcesId();
        System.out.println(rdfResourcesId.getId());
    }

}