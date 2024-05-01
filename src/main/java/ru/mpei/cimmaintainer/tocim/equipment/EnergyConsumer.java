package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.*;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

public class EnergyConsumer {
    public static RdfResource create(String id, RawEquipmentNodeDto value){
        return new RdfResourcesBuilder(new RdfResourcesId(id), CimClasses.energyConsumer)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, value.getName())
                .addDataProperty(CimClasses.energyConsumerCim.grounded, Boolean.toString(!value.getFields().get(FieldLibId.ACTIVE_POWER).equals("disabled")))
                .addDataProperty(CimClasses.energyConsumerCim.pfixed, value.getFields().get(FieldLibId.ACTIVE_POWER))
                .addDataProperty(CimClasses.energyConsumerCim.p, value.getFields().get(FieldLibId.ACTIVE_POWER))
                .addDataProperty(CimClasses.energyConsumerCim.qfixed, value.getFields().get(FieldLibId.REACTIVE_POWER))
                .addDataProperty(CimClasses.energyConsumerCim.q, value.getFields().get(FieldLibId.REACTIVE_POWER))
                .addDataProperty(DtpsClasses.energyConsumerDtps.ratedVoltage, value.getFields().get(FieldLibId.RATED_VOLTAGE_LINE_TO_LINE))
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("genarate"))
                .addObjectProperty(CimClasses.equipmentCim.EquipmentContainer, new RdfResourcesId("genarate"))
                .addObjectProperty(CimClasses.energyConsumerCim.loadResponse, new RdfResourcesId("generate"))
                .builder();

    }
}
