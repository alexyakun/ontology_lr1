package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.mpei.cimmaintainer.tocim.rdf.RdfDataProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfObjectProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesType;

import java.util.List;

@Getter
@AllArgsConstructor
public class RdfResource {
    private final RdfResourcesId id;
    private final RdfResourcesType type;
    private final List<RdfDataProperty> dataPropertyList;
    private final List<RdfObjectProperty> objectPropertyList;

    @Override
    public String toString() {
        StringBuilder xmlBuilder = new StringBuilder();

        xmlBuilder.append("\t<").append(type.getNameSpace().getAlias())
                .append(":").append(type.getNameType()).append(" rdf:ID = \"_").append(id).append("\">\n");

        dataPropertyList.forEach(e -> xmlBuilder.append(e.toString()).append("\n"));
        //TODO: objectProp
        objectPropertyList.forEach(e ->xmlBuilder.append(e.toString()).append("\n"));
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
