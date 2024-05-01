package ru.mpei.cimmaintainer.tocim.rdf;

import ru.mpei.cimmaintainer.tocim.rdf.classes.*;

public class CimClasses {
    public static IdentifiedObjectCim identifiedObjectCim = new IdentifiedObjectCim(
            CimNamespace.cim,
            "IdentifiedObject"
    );
    public static BaseFrequencyCim baseFrequencyCim = new BaseFrequencyCim(
            CimNamespace.cim,
            "BaseFrequency"
    );
    public static BaseVoltageCim baseVoltageCim = new BaseVoltageCim(
            CimNamespace.cim,
            "BaseVoltage"
    );
    public static VoltageLevelCim voltageLevelCim = new VoltageLevelCim(
            CimNamespace.cim,
            "VoltageLevel"
    );
    public static SwitchCim switchCim = new SwitchCim(
            CimNamespace.cim,
            "Switch"
    );
    public static ConductingEquipmentCim conductingEquipmentCim = new ConductingEquipmentCim(
            CimNamespace.cim,
            "ConductingEquipment"
    );
    public static EquipmentCim equipmentCim = new EquipmentCim(CimNamespace.cim,"Equipment");
    public static DiagramCim diagramCim = new DiagramCim(
            CimNamespace.cim,
            "Diagram"
    );
    public static ACLineSegmentCim acLineSegmentCim = new ACLineSegmentCim(
            CimNamespace.cim,
            "ACLineSegment"
    );
    public static PowerTransformerPropCim powerTransformerPropCim = new PowerTransformerPropCim(
            CimNamespace.cim,
            "PowerTransformer"
    );
    public static TransformerEndCim transformerEndCim = new TransformerEndCim(
            CimNamespace.cim,
            "TransformerEnd"
    );
    public static EnergyConsumerCim energyConsumerCim = new EnergyConsumerCim(
            CimNamespace.cim,
            "EnergyConsumer"
    );
    public static ConductorCim conductorCim = new ConductorCim(
            CimNamespace.cim,
            "Conductor"
    );

    public static EquivalentInjectionCim equivalentInjectionCim = new EquivalentInjectionCim(
            CimNamespace.cim,
            "EquivalentInjection"
    );
    public static PowerTransformerEndCim powerTransformerEndCim = new PowerTransformerEndCim(
            CimNamespace.cim,
            "PowerTransformerEnd"
    );
    public static PowerTransformerEndDtps powerTransformerEndDtps = new PowerTransformerEndDtps(
            CimNamespace.dtps,
            "PowerTransformerEnd"
    );
    public static ACDCTerminalCim acdcTerminalCim = new ACDCTerminalCim(
            CimNamespace.cim,
            "ACDCTerminal"
    );
    public static TerminalCim terminalCim = new TerminalCim(
            CimNamespace.cim,
            "Terminal"
    );

    public static RdfResourcesType substation = new RdfResourcesType(CimNamespace.cim, "Substation");
    public static RdfResourcesType line = new RdfResourcesType(CimNamespace.cim, "Line");
    public static RdfResourcesType bFrequency = new RdfResourcesType(CimNamespace.cim, "BaseFrequency");
    public static RdfResourcesType bVoltage = new RdfResourcesType(CimNamespace.cim,"BaseVoltage");
    public static RdfResourcesType voltLevel = new RdfResourcesType(CimNamespace.cim,"VoltageLevel");
    public static RdfResourcesType breaker = new RdfResourcesType(CimNamespace.cim,"Breaker");
    public static RdfResourcesType diagram = new RdfResourcesType(CimNamespace.cim,"Diagram");
    public static RdfResourcesType equivalentInjection = new RdfResourcesType(CimNamespace.cim,"EquivalentInjection");
    public static RdfResourcesType acLineSegment = new RdfResourcesType(CimNamespace.cim, "ACLineSegment");
    public static RdfResourcesType busbarSection = new RdfResourcesType(CimNamespace.cim, "BusbarSection");
    public static RdfResourcesType energyConsumer = new RdfResourcesType(CimNamespace.cim, "EnergyConsumer");
    public  static  RdfResourcesType powerTransformer = new RdfResourcesType(CimNamespace.cim, "PowerTransformer");
    public static RdfResourcesType powerTransformerEnd = new RdfResourcesType(CimNamespace.cim, "PowerTransformerEnd");
    public static RdfResourcesType terminal = new RdfResourcesType(CimNamespace.cim, "Terminal");
}
