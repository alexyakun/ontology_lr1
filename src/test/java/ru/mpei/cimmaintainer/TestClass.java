package ru.mpei.cimmaintainer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mpei.cimmaintainer.tocim.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.casses.IdentifiedObject;
import ru.mpei.cimmaintainer.tocim.rdf.cimClasses;
import ru.mpei.cimmaintainer.tocim.rdf.cimClassesProperties;
import ru.mpei.cimmaintainer.tocim.voltage.RDFDataProperty;
import ru.mpei.cimmaintainer.tocim.voltage.RDFResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.fasterxml.jackson.module.kotlin.ExtensionsKt.jacksonObjectMapper;

public class TestClass {

    private ObjectMapper mapper = jacksonObjectMapper();

    @Test
    public void test() {
//        String json = null;
//        try {
//            json = Files.readString(Paths.get("src/test/resources/lr1_scheme.json"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        RawSchemeDto scheme = null;
//        try {
//            scheme = mapper.readValue(json, RawSchemeDto.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        var cim = CimConverter.toCim(scheme);
//
//        Assertions.assertNotNull(cim);
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

        var resourcesSubstation = new RDFResourcesBuilder(
                new RDFResourcesId("c4b66487-d98a-4d8a-87f4-142124b18e14"), cimClasses.substation
        )
                .addDataProperty(
                        cimClasses.identifiedObject.mRID,
                        "c4b66487-d98a-4d8a-87f4-142124b18e14")
                .addDataProperty(cimClasses.identifiedObject.name,
                        "Substation 1")
                .builder();

        System.out.println(resourcesSubstation);
    }

}
