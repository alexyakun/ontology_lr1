package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class ACLineSegmentCim extends RdfResourcesType {
    public RdfResourcesProperty r = new RdfResourcesProperty(this,"r");
    public RdfResourcesProperty r0 = new RdfResourcesProperty(this,"r0");
    public RdfResourcesProperty x = new RdfResourcesProperty(this,"x");
    public RdfResourcesProperty x0= new RdfResourcesProperty(this,"x0");
    public RdfResourcesProperty bch = new RdfResourcesProperty(this,"bch");
    public RdfResourcesProperty b0ch = new RdfResourcesProperty(this,"b0ch");

    public ACLineSegmentCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
}
