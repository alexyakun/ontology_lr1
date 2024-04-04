package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RdfResourcesId {
    private final String Id;

    @Override
    public String toString() {
        return  Id;
    }
}
