package com.typesafe.config.waterdrop.impl;

import java.util.Collection;

final class ConfigNodeConcatenation extends ConfigNodeComplexValue {
    ConfigNodeConcatenation(Collection<AbstractConfigNode> children) {
        super(children);
    }

    @Override
    protected ConfigNodeConcatenation newNode(Collection<AbstractConfigNode> nodes) {
        return new ConfigNodeConcatenation(nodes);
    }
}
