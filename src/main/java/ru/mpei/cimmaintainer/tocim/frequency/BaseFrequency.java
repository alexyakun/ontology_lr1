package ru.mpei.cimmaintainer.tocim.frequency;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.ArrayList;
import java.util.List;

public class BaseFrequency {
    public static List<RdfResource> convert(){
        List<RdfResource> resources = new ArrayList<>();
        RdfResource builder = new RdfResourcesBuilder(new RdfResourcesId("44828d3c-9052-4599-b79d-bbe0ecb86d06"), CimClasses.bFrequency)
                .addDataProperty(CimClasses.identifiedObject.mRID, "44828d3c-9052-4599-b79d-bbe0ecb86d06")
                .addDataProperty(CimClasses.baseFrequency.frequency, "50")
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("dd37e29c-ae81-4a50-8874-18685ab97609"))
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("441d88ad-1a0a-4fbd-b3ef-a2e89ef74d9f"))
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("9bc42144-8d2a-4de4-b350-9a5d59b878e1"))
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("58649e1b-d9f6-41a6-9f98-85219024408c"))
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("58649e1b-d9f6-41a6-9f98-85219024408c"))
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("7f0cfb80-9b99-431e-a217-c4bfeaab269d"))
                .addObjectProperty(CimClasses.identifiedObject.DiagramObjects, new RdfResourcesId("5407225f-190a-4eb4-a4a4-9456fb902ab7"))
                .builder();
        resources.add(builder);
        return resources;

    }
}
