package ru.mpei.cimmaintainer;

import kotlin.NotImplementedError;
import ru.mpei.cimmaintainer.tocim.diagram.Diagram;
import ru.mpei.cimmaintainer.tocim.equipment.*;
import ru.mpei.cimmaintainer.tocim.frequency.BaseFrequency;
import ru.mpei.cimmaintainer.tocim.line.Line;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;

import ru.mpei.cimmaintainer.tocim.substation.Substation;
import ru.mpei.cimmaintainer.tocim.voltage.base.BaseVoltage;
import ru.mpei.cimmaintainer.tocim.voltage.level.VoltageLevel;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.dto.scheme.RawSchemeDto;
import ru.nti.dtps.proto.lib.equipment.EquipmentLibId;

import java.util.List;
import java.util.Map;

public class CimConverter {
    public static String toCim(RawSchemeDto scheme) {
        List<RdfResource> resources = Substation.convert(scheme);
        Map<String, RawEquipmentNodeDto> nodes = scheme.getNodes();
        for (Map.Entry<String, RawEquipmentNodeDto> entry : nodes.entrySet()) {
            String key = entry.getKey();
            RawEquipmentNodeDto value = entry.getValue();
            if(value.getLibEquipmentId() == EquipmentLibId.CIRCUIT_BREAKER){
                System.out.println(Breaker.create(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.POWER_SYSTEM_EQUIVALENT){
                System.out.println(EquivalentInjection.create(key, value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.TRANSMISSION_LINE_SEGMENT){
                System.out.println(ACLineSegment.create(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.BUS){
                System.out.println(BusbarSection.create(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.TWO_WINDING_POWER_TRANSFORMER){
                System.out.println(PowerTransformer.create(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.LOAD){
                System.out.println(EnergyConsumer.create(key,value));
            }
        }

        //System.out.println(resources);
        System.out.println(Diagram.convert(scheme));
        System.out.println(Line.convert(scheme));
        System.out.println(BaseFrequency.convert());
        System.out.println(BaseVoltage.convert());
        System.out.println(VoltageLevel.convert());


        throw new NotImplementedError();
    }
}
