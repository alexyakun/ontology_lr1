package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class EquivalentInjectionCim extends RdfResourcesType {
    public RdfResourcesProperty r = new RdfResourcesProperty(this,"r");
    public RdfResourcesProperty r2 = new RdfResourcesProperty(this,"r2");
    public RdfResourcesProperty x = new RdfResourcesProperty(this,"r");
    public RdfResourcesProperty x2 = new RdfResourcesProperty(this,"r2");
    public RdfResourcesProperty r0 = new RdfResourcesProperty(this,"r0");
    public RdfResourcesProperty x0 = new RdfResourcesProperty(this,"r0");


    public EquivalentInjectionCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
}
