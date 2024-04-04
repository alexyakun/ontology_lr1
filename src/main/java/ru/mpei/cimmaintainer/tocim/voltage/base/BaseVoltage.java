package ru.mpei.cimmaintainer.tocim.voltage.base;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;

import java.util.ArrayList;
import java.util.List;

public class BaseVoltage {
    public static List<RdfResource> convert(){
        List<RdfResource> resources = new ArrayList<>();
        RdfResource builder = new RdfResourcesBuilder(new RdfResourcesId("e6240428-fe41-4cb9-80d2-52bd2bbe2c03"), CimClasses.bVoltage)
                .addDataProperty(CimClasses.identifiedObject.mRID, "e6240428-fe41-4cb9-80d2-52bd2bbe2c03")
                .addDataProperty(CimClasses.identifiedObject.name, "110кВ")
                .addDataProperty(CimClasses.baseVoltage.nominalVoltage, "110.0")
                .builder();
        resources.add(builder);
        RdfResource builder1 = new RdfResourcesBuilder(new RdfResourcesId("9fd0eedd-2fbb-4160-86ba-5d577108df8d"), CimClasses.bVoltage)
                .addDataProperty(CimClasses.identifiedObject.mRID, "9fd0eedd-2fbb-4160-86ba-5d577108df8d")
                .addDataProperty(CimClasses.identifiedObject.name, "10кВ")
                .addDataProperty(CimClasses.baseVoltage.nominalVoltage, "10.0")
                .builder();
        resources.add(builder1);
        return resources;

    }
}
