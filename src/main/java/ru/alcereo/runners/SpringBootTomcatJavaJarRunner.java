package ru.alcereo.runners;

import ru.alcereo.agents.springbootagent.SpringBootTomcatAgent;

import java.io.IOException;

/**
 * Created by alcereo on 08.07.17.
 */
public class SpringBootTomcatJavaJarRunner extends JavaJarShellProjectRunner<SpringBootTomcatAgent> {

    @Override
    public SpringBootTomcatAgent runNewAgent() throws IOException {
        SpringBootTomcatAgent agent = new SpringBootTomcatAgent();
        agent.mountProcess(getProcessBuilder().start());
        return agent;
    }

}
