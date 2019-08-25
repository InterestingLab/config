/**
 *   Copyright (C) 2011-2012 Typesafe Inc. <http://typesafe.com>
 */
package com.typesafe.config.waterdrop.impl;

import com.typesafe.config.waterdrop.ConfigIncluder;
import com.typesafe.config.waterdrop.ConfigIncluderClasspath;
import com.typesafe.config.waterdrop.ConfigIncluderFile;
import com.typesafe.config.waterdrop.ConfigIncluderURL;

interface FullIncluder extends ConfigIncluder, ConfigIncluderFile, ConfigIncluderURL,
            ConfigIncluderClasspath {

}
