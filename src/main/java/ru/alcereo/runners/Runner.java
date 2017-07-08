package ru.alcereo.runners;

import ru.alcereo.agents.Agent;

import java.io.IOException;

/**
 * Created by alcereo on 07.07.17.
 */
public interface Runner<A extends Agent> {

    A runNewAgent() throws IOException;

}
