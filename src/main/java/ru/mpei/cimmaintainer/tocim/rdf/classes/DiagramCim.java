package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class DiagramCim extends RdfResourcesType {

    public DiagramCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty x1InitialView = new RdfResourcesProperty(this,"x1InitialView");
    public RdfResourcesProperty y1InitialView = new RdfResourcesProperty(this,"y1InitialView");
    public RdfResourcesProperty x2InitialView = new RdfResourcesProperty(this,"x2InitialView");
    public RdfResourcesProperty y2InitialView = new RdfResourcesProperty(this,"y2InitialView");
    public RdfResourcesProperty orientation = new RdfResourcesProperty(this,"orientation");
}
