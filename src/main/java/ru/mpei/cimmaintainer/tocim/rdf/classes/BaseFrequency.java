package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class BaseFrequency extends RdfResourcesType {
    public BaseFrequency(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RdfResourcesProperty frequency = new RdfResourcesProperty(this,"frequency");

}
