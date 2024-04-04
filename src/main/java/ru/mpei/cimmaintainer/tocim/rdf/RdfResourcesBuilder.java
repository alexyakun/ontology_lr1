package ru.mpei.cimmaintainer.tocim.rdf;

import java.util.ArrayList;
import java.util.List;

public class RdfResourcesBuilder {
    private final RdfResourcesId id;
    private final RdfResourcesType type;
    private List<RdfDataProperty> dataProperties = new ArrayList<>();
    private List<RdfObjectProperty> objectProperties = new ArrayList<>();


    public RdfResourcesBuilder(RdfResourcesId id, RdfResourcesType type) {
        this.id = id;
        this.type = type;
    }
    public RdfResourcesBuilder addDataProperty(
            RdfResourcesProperty rdfDataProperty,
            String value
    ) {
        this.dataProperties.add(new RdfDataProperty(rdfDataProperty, value));
        return this;
    }
    public RdfResourcesBuilder addObjectProperty(
            RdfResourcesProperty objectProperty,
            RdfResourcesId resourceId
    ) {
        this.objectProperties.add(new RdfObjectProperty(objectProperty, resourceId));
        return this;
    }

    public RdfResource builder() {
        return new RdfResource(id, type, dataProperties, objectProperties);
    }



}
