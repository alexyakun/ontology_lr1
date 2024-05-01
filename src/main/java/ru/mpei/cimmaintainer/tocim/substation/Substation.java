package ru.mpei.cimmaintainer.tocim.substation;

import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class Substation {
    public static List<RdfResource> convert(RawSchemeDto scheme){
        return scheme.getSubstations().stream()
                .map(e -> new RdfResourcesBuilder(new RdfResourcesId(e.getId()), CimClasses.substation)
                        .addDataProperty(CimClasses.identifiedObjectCim.mRID, e.getId())
                        .addDataProperty(CimClasses.identifiedObjectCim.name, e.getName())
                        .builder())
                .toList();
    }
}
