package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;

public class Breaker {
    public static RdfResource create(String id, RawEquipmentNodeDto value){
        return new RdfResourcesBuilder(new RdfResourcesId(id),CimClasses.breaker)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, value.getName())
                .addDataProperty(CimClasses.switchCim.open,"false")
                .addDataProperty(CimClasses.switchCim.ratedCurrent,"100.0")
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("genarate"))
                .addObjectProperty(CimClasses.equipmentCim.EquipmentContainer, new RdfResourcesId("genarate"))
                .builder();

    }

}
