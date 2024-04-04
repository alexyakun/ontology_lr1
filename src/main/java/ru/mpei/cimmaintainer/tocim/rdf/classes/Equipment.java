package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class Equipment extends RdfResourcesType {
    public Equipment(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RdfResourcesProperty EquipmentContainer = new RdfResourcesProperty(this,"EquipmentContainer");
}
