package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.*;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

public class EquivalentInjection {
    public static RdfResource create(String id, RawEquipmentNodeDto value){
        double imp_pos_neg = Double.parseDouble(value.getFields().get(FieldLibId.IMPEDANCE_POS_NEG_SEQ));
        double angle_pos_neg = Double.parseDouble(value.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_POS_NEG_SEQ));
        double imp_zero = Double.parseDouble(value.getFields().get(FieldLibId.IMPEDANCE_ZERO_SEQ));
        double angle_zero = Double.parseDouble(value.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_ZERO_SEQ));
        double r, r2, x, x2, r0, x0;
        r = imp_pos_neg * Math.cos(Math.toRadians(angle_pos_neg));
        x = imp_pos_neg * Math.sin(Math.toRadians(angle_pos_neg));
        r0 = imp_zero * Math.cos(Math.toRadians(angle_zero));
        x0 = imp_zero * Math.sin(Math.toRadians(angle_zero));
        r2 = r;
        x2 = x;
        return new RdfResourcesBuilder(new RdfResourcesId(id), CimClasses.equivalentInjection)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id)
                .addDataProperty(CimClasses.identifiedObjectCim.name, value.getName())
                .addDataProperty(CimClasses.equivalentInjectionCim.r, String.valueOf(r))
                .addDataProperty(CimClasses.equivalentInjectionCim.r2, String.valueOf(r2))
                .addDataProperty(CimClasses.equivalentInjectionCim.x, String.valueOf(x))
                .addDataProperty(CimClasses.equivalentInjectionCim.x2, String.valueOf(x2))
                .addDataProperty(CimClasses.equivalentInjectionCim.r0, String.valueOf(r0))
                .addDataProperty(CimClasses.equivalentInjectionCim.x0, String.valueOf(x0))
                .addDataProperty(DtpsClasses.equivalentInjection.emfTimeConstant, value.getFields().get(FieldLibId.EMF_TIME_CONSTANT))
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("genarate"))
                .addObjectProperty(CimClasses.equipmentCim.EquipmentContainer, new RdfResourcesId("genarate"))
                .builder();

    }
}
