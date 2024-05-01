package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class EnergyConsumerCim extends RdfResourcesType {
    public EnergyConsumerCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty grounded = new RdfResourcesProperty(this,"grounded");
    public RdfResourcesProperty pfixed = new RdfResourcesProperty(this,"pfixed");
    public RdfResourcesProperty p = new RdfResourcesProperty(this,"p");
    public RdfResourcesProperty qfixed = new RdfResourcesProperty(this,"qfixed");
    public RdfResourcesProperty q = new RdfResourcesProperty(this,"q");
    public RdfResourcesProperty loadResponse = new RdfResourcesProperty(this,"LoadResponse");
}
