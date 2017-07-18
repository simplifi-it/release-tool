package com.simplifi.it.rt.config.version;

import com.simplifi.it.javautil.err.ReturnError;
import com.simplifi.it.javautil.err.ReturnErrorImpl;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;

public class MavenVersionManipulator implements VersionManipulator
{
  public static final MavenVersionManipulator INSTANCE = new MavenVersionManipulator();

  private MavenVersionManipulator() {
  }

  @Override
  public Pair<String, ReturnError> getVersion() {
    return null;
  }

  @Override
  public ReturnError replaceVersion(String nextVersion) {
    return null;
  }

  @Override
  public boolean hasConfig() {
    return false;
  }

  @Override
  public ReturnError validateConfig(Map<String, String> config) {
    if (config.isEmpty()) {
      return null;
    }

    return new ReturnErrorImpl("There are no config parameters");
  }
}
