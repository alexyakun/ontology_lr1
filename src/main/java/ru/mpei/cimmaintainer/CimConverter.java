package ru.mpei.cimmaintainer;

import kotlin.NotImplementedError;
import ru.mpei.cimmaintainer.tocim.frequency.BaseFrequency;
import ru.mpei.cimmaintainer.tocim.line.Line;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;

import ru.mpei.cimmaintainer.tocim.substation.Substation;
import ru.mpei.cimmaintainer.tocim.voltage.base.BaseVoltage;
import ru.mpei.cimmaintainer.tocim.voltage.level.VoltageLevel;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class CimConverter {
    public static String toCim(RawSchemeDto scheme) {
        List<RdfResource> resources = Substation.convert(scheme);
        System.out.println(resources);
        System.out.println(Line.convert(scheme));
        System.out.println(BaseFrequency.convert());
        System.out.println(BaseVoltage.convert());
        System.out.println(VoltageLevel.convert());


        throw new NotImplementedError();
    }
}
