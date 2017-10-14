package com.simplifi.it.rt.config.version;

import com.simplifi.it.javautil.err.ReturnError;
import org.apache.commons.lang3.tuple.Pair;

public interface VersionManipulator
{
  Pair<String, ReturnError> getVersion();
  ReturnError replaceVersion(String nextVersion);
}
