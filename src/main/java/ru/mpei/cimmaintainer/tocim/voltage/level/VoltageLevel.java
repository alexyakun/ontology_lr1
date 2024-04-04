package ru.mpei.cimmaintainer.tocim.voltage.level;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;

import java.util.ArrayList;
import java.util.List;

public class VoltageLevel {
    public static List<RdfResource> convert(){
        List<RdfResource> resources = new ArrayList<>();
        RdfResource builder = new RdfResourcesBuilder(new RdfResourcesId("7e3860fe-15e8-4d3a-bdeb-01321c768bf7"), CimClasses.voltLevel)
                .addDataProperty(CimClasses.identifiedObject.mRID, "7e3860fe-15e8-4d3a-bdeb-01321c768bf7")
                .addObjectProperty(CimClasses.voltageLevel.BaseVoltage, new RdfResourcesId("e6240428-fe41-4cb9-80d2-52bd2bbe2c03"))
                .addObjectProperty(CimClasses.voltageLevel.Substation, new RdfResourcesId("c4b66487-d98a-4d8a-87f4-142124b18e14"))
                .builder();
        resources.add(builder);
        RdfResource builder1 = new RdfResourcesBuilder(new RdfResourcesId("e0a21a60-5d62-48f5-8b8e-4d3a6fb9795b"), CimClasses.voltLevel)
                .addDataProperty(CimClasses.identifiedObject.mRID, "e0a21a60-5d62-48f5-8b8e-4d3a6fb9795b")
                .addObjectProperty(CimClasses.voltageLevel.BaseVoltage, new RdfResourcesId("9fd0eedd-2fbb-4160-86ba-5d577108df8d"))
                .addObjectProperty(CimClasses.voltageLevel.Substation, new RdfResourcesId("c4b66487-d98a-4d8a-87f4-142124b18e14"))
                .builder();
        resources.add(builder1);
        return resources;

    }
}
