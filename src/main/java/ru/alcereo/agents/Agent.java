package ru.alcereo.agents;

import java.io.InputStream;

/**
 * Created by alcereo on 07.07.17.
 */
public interface Agent {

    boolean isAlive();

    InputStream getInputStream();

    InputStream getErrorStream();

    int getExitCode();

}
