package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

public class PowerTransformerEnd {
    public static RdfResource create(RawEquipmentNodeDto value, String numOfWinding, String transId){
        RdfResourcesId id = new RdfResourcesId();
        String name;
        String ratedU;
        String windingType;
        String ratedS = value.getFields().get(FieldLibId.RATED_APPARENT_POWER);

        if(numOfWinding.equals("1")){
            name = "First winding of " + value.getName();
            ratedU = value.getFields().get(FieldLibId.FIRST_WINDING_RATED_VOLTAGE);
            windingType = value.getFields().get(FieldLibId.FIRST_WINDING_TYPE);
        } else {
            name = "Second winding of " + value.getName();
            ratedU = value.getFields().get(FieldLibId.SECOND_WINDING_RATED_VOLTAGE);
            windingType = value.getFields().get(FieldLibId.SECOND_WINDING_TYPE);
        }
        double unom = Double.parseDouble(ratedU);
        double snom = Double.parseDouble(ratedS);
        double pk = Double.parseDouble(value.getFields().get(FieldLibId.SHORT_CIRCUIT_ACTIVE_POWER));
        double uk = Double.parseDouble(value.getFields().get(FieldLibId.SHORT_CIRCUIT_VOLTAGE));
        double px = Double.parseDouble(value.getFields().get(FieldLibId.IDLING_ACTIVE_POWER));
        double ix = Double.parseDouble(value.getFields().get(FieldLibId.IDLING_CURRENT));
        double r = pk * 0.001 * unom * unom / snom / snom;
        double x = uk/ 100 * unom * unom / snom;
        double g = px * 0.001 / unom / unom;
        double b = ix / 100 * snom / unom / unom;
        boolean grounded = windingType.endsWith("g");
        String clock  = windingType.replace("g","").replace("y","").replace("d","");
        if (clock.isEmpty()){
            clock = "0";
        }
        boolean saturation = !value.getFields().get(FieldLibId.SATURATION_EXIST).equals("no");
        return new RdfResourcesBuilder(id, CimClasses.powerTransformerEnd)
                .addDataProperty(CimClasses.identifiedObjectCim.mRID, id.getId())
                .addDataProperty(CimClasses.identifiedObjectCim.name, name)
                .addDataProperty(CimClasses.transformerEndCim.endNumber, numOfWinding)
                .addDataProperty(CimClasses.powerTransformerEndCim.phaseAndAngleClock, clock)
                .addDataProperty(CimClasses.transformerEndCim.grounded, Boolean.toString(grounded))
                .addDataProperty(CimClasses.powerTransformerEndCim.ratedU, ratedU)
                .addDataProperty(CimClasses.powerTransformerEndCim.ratedS, ratedS)
                .addDataProperty(CimClasses.powerTransformerEndCim.g, String.valueOf(g))
                .addDataProperty(CimClasses.powerTransformerEndCim.b, String.valueOf(b))
                .addDataProperty(CimClasses.powerTransformerEndDtps.doesSaturationExist, Boolean.toString(saturation))
                .addDataProperty(CimClasses.powerTransformerEndCim.x, String.valueOf(x))
                .addDataProperty(CimClasses.powerTransformerEndCim.r, String.valueOf(r))
                .addObjectProperty(CimClasses.powerTransformerEndCim.connectionKind, new RdfResourcesId("generate"))
                .addObjectProperty(CimClasses.conductingEquipmentCim.BaseVoltage,new RdfResourcesId("genarate"))
                .addObjectProperty(CimClasses.powerTransformerEndCim.powerTransformer, new RdfResourcesId(transId))
                .addObjectProperty(CimClasses.transformerEndCim.terminal, new RdfResourcesId("genarate"))
                .builder();

    }
}
