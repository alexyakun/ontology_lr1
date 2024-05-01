package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class BaseVoltageCim extends RdfResourcesType {
    public BaseVoltageCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RdfResourcesProperty nominalVoltage = new RdfResourcesProperty(this,"nominalVoltage");
}
