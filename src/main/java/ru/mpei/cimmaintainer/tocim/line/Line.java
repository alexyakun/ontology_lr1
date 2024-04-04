package ru.mpei.cimmaintainer.tocim.line;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class Line {
    public static List<RdfResource> convert(RawSchemeDto scheme){
        return scheme.getTransmissionLines().stream()
                .map(e -> new RdfResourcesBuilder(new RdfResourcesId(e.getId()), CimClasses.line)
                        .addDataProperty(CimClasses.identifiedObject.mRID, e.getId())
                        .addDataProperty(CimClasses.identifiedObject.name, e.getName())
                        .builder())
                .toList();
    }
}
