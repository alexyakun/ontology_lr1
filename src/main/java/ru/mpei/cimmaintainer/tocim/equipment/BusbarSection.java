package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.links.Terminal;
import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;

import java.util.List;

public class BusbarSection {
    public static RdfResource create(String id, RawEquipmentNodeDto value){
        List<RawEquipmentNodeDto.PortDto> ports = value.getPorts();
        int count = 1;
        for (RawEquipmentNodeDto.PortDto port : ports) {
            RdfResource terminal = Terminal.create(port.getId(), value.getName(), count, id);
        }

        return new RdfResourcesBuilder(new RdfResourcesId(id), CimClasses.busbarSection)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, value.getName())
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("genarate"))
                .addObjectProperty(CimClasses.equipmentCim.EquipmentContainer, new RdfResourcesId("genarate"))
                .builder();

    }
}
