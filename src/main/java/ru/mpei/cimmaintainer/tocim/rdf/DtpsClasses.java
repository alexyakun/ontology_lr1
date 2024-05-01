package ru.mpei.cimmaintainer.tocim.rdf;

import ru.mpei.cimmaintainer.tocim.rdf.classes.ACLineSegmentDtps;
import ru.mpei.cimmaintainer.tocim.rdf.classes.EnergyConsumerDtps;
import ru.mpei.cimmaintainer.tocim.rdf.classes.EquivalentInjectionDtps;

public class DtpsClasses {
    public static EquivalentInjectionDtps equivalentInjection = new EquivalentInjectionDtps(
            CimNamespace.dtps,
            "EquivalentInjection");
    public static ACLineSegmentDtps acLineSegmentDtps = new ACLineSegmentDtps(
            CimNamespace.dtps,
            "ACLineSegment"
    );
    public static EnergyConsumerDtps energyConsumerDtps = new EnergyConsumerDtps(
            CimNamespace.dtps,
            "EnergyConsumer"
    );
}
