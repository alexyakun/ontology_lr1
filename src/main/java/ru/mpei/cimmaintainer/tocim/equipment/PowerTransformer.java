package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

public class PowerTransformer {
    public static RdfResource create(String id, RawEquipmentNodeDto value){

        RdfResource firstWinding = PowerTransformerEnd.create(value, "1", id);
        RdfResource secondWinding = PowerTransformerEnd.create(value, "2", id);
        System.out.println(firstWinding);
        System.out.println(secondWinding);

        return new RdfResourcesBuilder(new RdfResourcesId(id), CimClasses.powerTransformer)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, value.getName())
                .addDataProperty(CimClasses.powerTransformerPropCim.isPartOfGeneratorUnit, "false")
                .addDataProperty(CimClasses.transformerEndCim.magBaseU, value.getFields().get(FieldLibId.MAGNETIZATION_VOLTAGE))
                .addDataProperty(CimClasses.transformerEndCim.bmagSat, value.getFields().get(FieldLibId.AIR_CORE_RESISTANCE))
                .addDataProperty(CimClasses.transformerEndCim.magSatFlux, Double.toString(Double.parseDouble(value.getFields().get(FieldLibId.SATURATION_COEFFICIENT))/100))
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("generate"))
                .addObjectProperty(CimClasses.equipmentCim.EquipmentContainer, new RdfResourcesId("generate"))
                .builder();

    }
}
