package ru.mpei.cimmaintainer.tocim.voltage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RDFResourcesId {
    private final String Id;

    @Override
    public String toString() {
        return  Id;
    }
}
