package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class PowerTransformerPropCim extends RdfResourcesType {
    public PowerTransformerPropCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty isPartOfGeneratorUnit= new RdfResourcesProperty(this,"isPartOfGeneratorUnit");
}
