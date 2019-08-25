package com.typesafe.config.waterdrop.impl;

import com.typesafe.config.waterdrop.ConfigMergeable;
import com.typesafe.config.waterdrop.ConfigValue;

interface MergeableValue extends ConfigMergeable {
    // converts a Config to its root object and a ConfigValue to itself
    ConfigValue toFallbackValue();
}
