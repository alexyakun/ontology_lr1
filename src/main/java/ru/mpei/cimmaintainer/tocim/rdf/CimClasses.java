package ru.mpei.cimmaintainer.tocim.rdf;

import ru.mpei.cimmaintainer.tocim.rdf.classes.*;

public class CimClasses {
    public static IdentifiedObject identifiedObject = new IdentifiedObject(
            CimNamespace.cim,
            "IdentifiedObject"
    );
    public static BaseFrequency baseFrequency = new BaseFrequency(
            CimNamespace.cim,
            "BaseFrequency"
    );
    public static BaseVoltage baseVoltage = new BaseVoltage(
            CimNamespace.cim,
            "BaseVoltage"
    );
    public static VoltageLevel voltageLevel = new VoltageLevel(
            CimNamespace.cim,
            "VoltageLevel"
    );
    public static Switch aswitch = new Switch(
            CimNamespace.cim,
            "Switch"
    );

    public static RdfResourcesType substation = new RdfResourcesType(CimNamespace.cim, "Substation");
    public static RdfResourcesType line = new RdfResourcesType(CimNamespace.cim, "Line");
    public static RdfResourcesType bFrequency = new RdfResourcesType(CimNamespace.cim, "BaseFrequency");
    public static RdfResourcesType bVoltage = new RdfResourcesType(CimNamespace.cim,"BaseVoltage");
    public static RdfResourcesType voltLevel = new RdfResourcesType(CimNamespace.cim,"VoltageLevel");
    public static RdfResourcesType breaker = new RdfResourcesType(CimNamespace.cim,"Breaker");

    public static class Some {

    }
}
