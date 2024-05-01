package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class TransformerEndCim extends RdfResourcesType {
    public TransformerEndCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty magBaseU= new RdfResourcesProperty(this,"magBaseU");
    public RdfResourcesProperty bmagSat= new RdfResourcesProperty(this,"bmagSat");
    public RdfResourcesProperty magSatFlux= new RdfResourcesProperty(this,"magSatFlux");
    public RdfResourcesProperty endNumber= new RdfResourcesProperty(this,"endNumber");
    public RdfResourcesProperty grounded= new RdfResourcesProperty(this,"grounded");
    public RdfResourcesProperty terminal = new RdfResourcesProperty(this,"Terminal");
}
