package ru.alcereo;

import ru.alcereo.agents.springbootagent.AgentState;
import ru.alcereo.agents.springbootagent.SpringBootTomcatAgent;
import ru.alcereo.runners.SpringBootTomcatJavaJarRunner;

import java.io.File;
import java.io.IOException;

/**
 * Created by alcereo on 07.07.17.
 */
public class ExecuteTest {

    public static void main(String[] args) throws IOException {

        SpringBootTomcatJavaJarRunner runner = new SpringBootTomcatJavaJarRunner();

        runner.setFileName("sample-web-app-0.0.1-SNAPSHOT.jar");
        runner.setProjectDir(new File("sample-web-app"));

        SpringBootTomcatAgent agent = runner.runNewAgent();
        agent.getParser().addWorker(System.out::println);

        try {
            agent.waitForState(AgentState.STARTED);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Success!");

        agent.destroy();

    }
}
