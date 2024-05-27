package com.tinusj.configurator.service;

import com.tinusj.configurator.entity.PropertyField;

import java.util.List;

public interface IConfigHandler {

    List<PropertyField> getProperties(String fileAsString);

    String setProperties(List<PropertyField> properties);
}
