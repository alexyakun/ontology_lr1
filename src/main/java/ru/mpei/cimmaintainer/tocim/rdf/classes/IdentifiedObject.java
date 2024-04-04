package ru.mpei.cimmaintainer.tocim.rdf.casses;

import ru.mpei.cimmaintainer.tocim.rdf.cimClasses;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.voltage.XmlNameSpace;

public class IdentifiedObject extends RDFResourcesType {
//    private static RDFResourcesType type = cimClasses.identifiedObject;
    public IdentifiedObject(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RDFResourcesProperty mRID = new RDFResourcesProperty(this,"mRID");
    public RDFResourcesProperty name = new RDFResourcesProperty(this,"name");


}
