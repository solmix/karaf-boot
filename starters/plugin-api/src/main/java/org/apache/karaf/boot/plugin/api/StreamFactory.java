package org.apache.karaf.boot.plugin.api;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public interface StreamFactory {
    OutputStream create(File file) throws IOException;
}
