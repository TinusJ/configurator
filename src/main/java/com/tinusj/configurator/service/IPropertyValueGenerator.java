package com.tinusj.configurator.service;


import com.tinusj.configurator.entity.PropertyField;

public interface IPropertyValueGenerator {

    PropertyField generateValue(PropertyField propertyField);
}
