package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.*;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;

public class ACLineSegment {
    public static RdfResource create(String id, RawEquipmentNodeDto value){
        return new RdfResourcesBuilder(new RdfResourcesId(id), CimClasses.acLineSegment)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, value.getName())
                .addDataProperty(CimClasses.conductorCim.length, "40.0")
                .addDataProperty(CimClasses.acLineSegmentCim.r, "1")
                .addDataProperty(CimClasses.acLineSegmentCim.r0, "2")
                .addDataProperty(CimClasses.acLineSegmentCim.x, "3")
                .addDataProperty(CimClasses.acLineSegmentCim.x0, "4")
                .addDataProperty(CimClasses.acLineSegmentCim.bch, "5")
                .addDataProperty(CimClasses.acLineSegmentCim.b0ch, "6")
                .addDataProperty(DtpsClasses.acLineSegmentDtps.ratedActivePower, "100")
                .addDataProperty(DtpsClasses.acLineSegmentDtps.userConcentratedParameters, "false")
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("generate"))
                .addObjectProperty(CimClasses.equipmentCim.EquipmentContainer, new RdfResourcesId("generate"))
                .builder();

    }
}
