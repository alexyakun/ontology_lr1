package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class Switch extends RdfResourcesType {
    public Switch(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RdfResourcesProperty ratedCurrent = new RdfResourcesProperty(this,"ratedCurrent");
    public RdfResourcesProperty open = new RdfResourcesProperty(this,"open");
}
