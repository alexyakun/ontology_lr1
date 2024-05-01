package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class TerminalCim extends RdfResourcesType {
    public TerminalCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty phases= new RdfResourcesProperty(this,"phases");
    public RdfResourcesProperty conductingEquipment= new RdfResourcesProperty(this,"ConductingEquipment");
    public RdfResourcesProperty topologicalNode= new RdfResourcesProperty(this,"TopologicalNode");
    public RdfResourcesProperty connectivityNode = new RdfResourcesProperty(this,"ConnectivityNode");
}
