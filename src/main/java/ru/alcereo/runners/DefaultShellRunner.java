package ru.alcereo.runners;

import ru.alcereo.agents.DefaultShellAgent;

import java.io.IOException;

/**
 * Created by alcereo on 08.07.17.
 */
public class DefaultShellRunner implements Runner<DefaultShellAgent> {

    private ProcessBuilder processBuilder;

    public DefaultShellRunner(ProcessBuilder processBuilder) {
        this.processBuilder = processBuilder;
    }

    @Override
    public DefaultShellAgent runNewAgent() throws IOException {
        DefaultShellAgent agent = new DefaultShellAgent();
        agent.mountProcess(processBuilder.start());
        return agent;
    }

    public ProcessBuilder getProcessBuilder() {
        return processBuilder;
    }

    public void setProcessBuilder(ProcessBuilder processBuilder) {
        this.processBuilder = processBuilder;
    }

}
