package runners;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite // Marks as runnable test
@IncludeEngines("cucumber") // Use cucumber test engine
@SelectClasspathResource("features") // point to feature folder
// PLUGIN_PROPERTY_NAME: Pretty=colored console output, HTML: export results to report file
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
// GLUE_PROPERTY_NAME Reference to steps package
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps")

public class TestRunner {
}

