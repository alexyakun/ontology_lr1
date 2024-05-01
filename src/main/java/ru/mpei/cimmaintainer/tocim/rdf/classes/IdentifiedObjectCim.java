package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;

public class IdentifiedObjectCim extends RdfResourcesType {
//    private static RDFResourcesType type = cimClasses.identifiedObject;
    public IdentifiedObjectCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RdfResourcesProperty mRID = new RdfResourcesProperty(this,"mRID");
    public RdfResourcesProperty name = new RdfResourcesProperty(this,"name");
    public RdfResourcesProperty DiagramObjects = new RdfResourcesProperty(this, "DiagramObjects");


}
