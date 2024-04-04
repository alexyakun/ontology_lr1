package ru.mpei.cimmaintainer.tocim.rdf;

import ru.mpei.cimmaintainer.tocim.rdf.casses.IdentifiedObject;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesType;

public class cimClasses {
    public static IdentifiedObject identifiedObject = new IdentifiedObject(
            cimNameSpace.cim,
            "IdentifiedObject"
    );

    public static RDFResourcesType substation = new RDFResourcesType(cimNameSpace.cim, "Substation");
    public static RDFResourcesType line = new RDFResourcesType(cimNameSpace.cim, "Line");

    public static class Some {

    }
}
