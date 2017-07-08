package ru.alcereo.runners;

import ru.alcereo.agents.Agent;
import ru.alcereo.agents.DefaultShellAgent;

import java.io.IOException;

/**
 * Created by alcereo on 08.07.17.
 */
public class DockerImageShellRunner<A extends Agent> implements Runner<DefaultShellAgent> {

    private ProcessBuilder processBuilder = new ProcessBuilder();

    private String imageName;

    @Override
    public DefaultShellAgent runNewAgent() throws IOException {

        return null;
    }
}
