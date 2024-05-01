package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class PowerTransformerEndDtps extends RdfResourcesType {
    public PowerTransformerEndDtps(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty doesSaturationExist= new RdfResourcesProperty(this,"doesSaturationExist");
}
