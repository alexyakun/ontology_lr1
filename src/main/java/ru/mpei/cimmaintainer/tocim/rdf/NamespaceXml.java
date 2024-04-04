package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NamespaceXml {
    private final String alias;
    private final String uri;

//    @Override
//    public String toString() {
//        return "XmlNameSpace{" +
//                "alias='" + alias + '\'' +
//                ", uri='" + uri + '\'' +
//                '}';
//    }
}
