package io.github.edmm.plugins.puppet.model;

import lombok.Getter;

@Getter
public class ResourceEventEntry {
    PuppetResourceStatus status;
    ResourceType resource_type;
    String resource_title;
    String containing_class;
    String name;
}
