package ru.mpei.cimmaintainer.tocim.substation;

import ru.mpei.cimmaintainer.tocim.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.cimClasses;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class Substation {
    public static List<RdfResource> convert(RawSchemeDto scheme){
        return scheme.getSubstations().stream()
                .map(e -> new RDFResourcesBuilder(new RDFResourcesId(e.getId()), cimClasses.substation)
                        .addDataProperty(cimClasses.identifiedObject.mRID, e.getId())
                        .addDataProperty(cimClasses.identifiedObject.name, e.getName())
                        .builder())
                .toList();
    }
}
