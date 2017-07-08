package ru.alcereo.agents;

import ru.alcereo.parsers.ShellParser;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

/**
 * Created by alcereo on 08.07.17.
 */
public class DefaultShellAgent implements Agent{

    private Process process;
    private ShellParser parser = new ShellParser(this);
    
    public DefaultShellAgent() {
    }

    public void destroy() {
        parser.deactivate();
        process.destroy();
    }

    public DefaultShellAgent mountProcess(Process process) {
        this.process = process;
        parser.start();
        return this;
    }

    public ShellParser getParser() {
        return parser;
    }

    public void setParser(ShellParser parser) {
        this.parser = parser;
    }

//    ┌--------------------------------------------------┐
//    |               process - DELEGATION               |
//    └--------------------------------------------------┘

    public boolean isAlive() {
        return process.isAlive();
    }

    public InputStream getInputStream() {
        return process.getInputStream();
    }

    public InputStream getErrorStream() {
        return process.getErrorStream();
    }

    public int getExitCode() {
        return process.exitValue();
    }

    public OutputStream getOutputStream() {
        return process.getOutputStream();
    }

    public int waitFor() throws InterruptedException {
        return process.waitFor();
    }

    public boolean waitFor(long timeout, TimeUnit unit) throws InterruptedException {
        return process.waitFor(timeout, unit);
    }

    public int exitValue() {
        return process.exitValue();
    }

    public Process destroyForcibly() {
        return process.destroyForcibly();
    }

//    -----------------------------------------------------

}
