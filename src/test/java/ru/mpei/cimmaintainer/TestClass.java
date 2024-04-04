package ru.mpei.cimmaintainer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.fasterxml.jackson.module.kotlin.ExtensionsKt.jacksonObjectMapper;

public class TestClass {

    private ObjectMapper mapper = jacksonObjectMapper();

    @Test
    public void test() {
        String json = null;
        try {
            json = Files.readString(Paths.get("src/test/resources/lr1_scheme.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        RawSchemeDto scheme = null;
        try {
            scheme = mapper.readValue(json, RawSchemeDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        var cim = CimConverter.toCim(scheme);

        Assertions.assertNotNull(cim);
    }

    @Test
    public void test2(){
        String json = null;
        try {
            json = Files.readString(Paths.get("src/test/resources/lr1_scheme.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        RawSchemeDto scheme = null;
        try {
            scheme = mapper.readValue(json, RawSchemeDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        var cim = CimConverter.toCim(scheme);

        Assertions.assertNotNull(cim);
    }

    @Test
    public void test1() {

//        var resourcesSubstation = new RdfResourcesBuilder(
//                new RdfResourcesId("c4b66487-d98a-4d8a-87f4-142124b18e14"), CimClasses.substation
//        )
//                .addDataProperty(
//                        CimClasses.identifiedObject.mRID,
//                        "c4b66487-d98a-4d8a-87f4-142124b18e14")
//                .addDataProperty(CimClasses.identifiedObject.name,
//                        "Substation 1")
//                .builder();
        var resourcesLine = new RdfResourcesBuilder(
                new RdfResourcesId("d55146be-1f7e-4113-94a2-08eed9e3bdf7"), CimClasses.line
        )
                .addDataProperty(
                        CimClasses.identifiedObject.mRID,
                        "d55146be-1f7e-4113-94a2-08eed9e3bdf7")
                .addDataProperty(CimClasses.identifiedObject.name,
                        "Transmission Line 1")
                .builder();
        System.out.println(resourcesLine);
    }

}
