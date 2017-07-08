package ru.alcereo.runners;

import ru.alcereo.agents.DefaultShellAgent;

import java.io.File;
import java.io.IOException;

/**
 * Created by alcereo on 08.07.17.
 */
public abstract class JavaJarShellProjectRunner<AGENT_TYPE extends DefaultShellAgent> implements Runner<AGENT_TYPE> {

    private ProcessBuilder processBuilder = new ProcessBuilder();

    @Override
    public abstract AGENT_TYPE runNewAgent() throws IOException;

    public void setFileName(String fileName) {
        processBuilder.command("java","-jar",fileName);
    }

    public void setProjectDir(File projectDir) {

        processBuilder.directory(
                projectDir.toPath()
                        .resolve("build")
                        .resolve("libs")
                        .toFile()
        );
    }

    public ProcessBuilder getProcessBuilder() {
        return processBuilder;
    }
}
