package ru.mpei.cimmaintainer.tocim;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.mpei.cimmaintainer.tocim.voltage.RDFDataProperty;
import ru.mpei.cimmaintainer.tocim.voltage.RDFObjectProperty;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesType;

import java.util.List;

@Getter
@AllArgsConstructor
public class RdfResource {
    private final RDFResourcesId id;
    private final RDFResourcesType type;
    private final List<RDFDataProperty> dataPropertyList;
    private final List<RDFObjectProperty> objectPropertyList;

    @Override
    public String toString() {
        StringBuilder xmlBuilder = new StringBuilder();

        xmlBuilder.append("\t<").append(type.getNameSpace().getAlias())
                .append(":").append(type.getNameType()).append(" rdf:ID = \"_").append(id).append("\">\n");

        dataPropertyList.forEach(e -> xmlBuilder.append(e.toString()).append("\n"));
        //TODO: objectProp
        xmlBuilder.append("\t</").append(type.getNameSpace().getAlias())
                .append(":").append(type.getNameType()).append(">\n");

        return xmlBuilder.toString();

//        StringBuilder xmlBulder = new StringBuilder();
//        xmlBulder.append("\t<")
//                .append(type.getNameSpace().getAlias())
//                .append(":").append(type.getNameType())
//                .append(" ")
//                .append("rdf:ID = _")
//                .append(id)
//                .append("\">\n");
//
//        return "RdfResource{" +
//                "id=" + id +
//                ", type=" + type +
//                ", dataPropertyList=" + dataPropertyList +
//                ", objectPropertyList=" + objectPropertyList +
//                '}';
    }
}
