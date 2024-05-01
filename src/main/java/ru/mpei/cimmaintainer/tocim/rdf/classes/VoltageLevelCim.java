package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class VoltageLevelCim extends RdfResourcesType {
    public VoltageLevelCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RdfResourcesProperty BaseVoltage = new RdfResourcesProperty(this,"BaseVoltage");
    public RdfResourcesProperty Substation = new RdfResourcesProperty(this,"Substation");
}
