package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class ACLineSegmentDtps extends RdfResourcesType {
    public ACLineSegmentDtps(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty ratedActivePower = new RdfResourcesProperty(this,"ratedActivePower");
    public RdfResourcesProperty userConcentratedParameters = new RdfResourcesProperty(this,"userConcentratedParameters");
}
