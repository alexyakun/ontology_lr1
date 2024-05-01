package ru.mpei.cimmaintainer.tocim.links;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;

import java.util.List;

public class Terminal  {
    public static RdfResource create(String id, String nodeName, int count, String nodeId){

        return new RdfResourcesBuilder(new RdfResourcesId(id), CimClasses.terminal)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, nodeName+" "+count)
                .addDataProperty(CimClasses.acdcTerminalCim.sequenceNumber,String.valueOf(count))
                .addObjectProperty(CimClasses.terminalCim.phases, new RdfResourcesId("http://iec.ch/TC57/2016/CIM-schema-cim#PhaseCode.ABC"))
//                .addObjectProperty(CimClasses.terminalCim.conductingEquipment, )
//                .addObjectProperty(CimClasses.terminalCim.topologicalNode, )
//                .addObjectProperty(CimClasses.terminalCim.connectivityNode, )
                .builder();

    }
}
