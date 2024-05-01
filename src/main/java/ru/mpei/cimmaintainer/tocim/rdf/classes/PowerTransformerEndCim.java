package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

public class PowerTransformerEndCim extends RdfResourcesType {
    public PowerTransformerEndCim(NamespaceXml nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RdfResourcesProperty phaseAndAngleClock= new RdfResourcesProperty(this,"phaseAndAngleClock");
    public RdfResourcesProperty ratedU= new RdfResourcesProperty(this,"ratedU");
    public RdfResourcesProperty ratedS= new RdfResourcesProperty(this,"ratedS");
    public RdfResourcesProperty g= new RdfResourcesProperty(this,"g");
    public RdfResourcesProperty b= new RdfResourcesProperty(this,"b");
    public RdfResourcesProperty x= new RdfResourcesProperty(this,"x");
    public RdfResourcesProperty r= new RdfResourcesProperty(this,"r");
    public RdfResourcesProperty connectionKind= new RdfResourcesProperty(this,"connectionKind");
    public RdfResourcesProperty powerTransformer= new RdfResourcesProperty(this,"PowerTransformer");

}
