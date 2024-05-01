package ru.mpei.cimmaintainer.tocim.diagram;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

public class Diagram {
    public static RdfResource convert(RawSchemeDto scheme){
        RdfResourcesId rdfResourcesId = new RdfResourcesId();
        return new RdfResourcesBuilder(rdfResourcesId, CimClasses.diagram)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, rdfResourcesId.getId())
                .addDataProperty(CimClasses.diagramCim.x1InitialView, "0")
                .addDataProperty(CimClasses.diagramCim.y1InitialView, "0")
                .addDataProperty(CimClasses.diagramCim.x2InitialView, String.valueOf(scheme.getOffsetX()))
                .addDataProperty(CimClasses.diagramCim.y2InitialView, String.valueOf(scheme.getOffsetY()))
                .addObjectProperty(CimClasses.diagramCim.orientation, new RdfResourcesId("http://iec.ch/TC57/2016/CIM-schema-cim#OrientationKind.negative"))
                .builder();
    }
}
