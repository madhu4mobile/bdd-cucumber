package com.triveratech.runner;

import io.cucumber.core.options.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value="@rest")
//@ConfigurationParameter(key = Constants.FILTER_NAME_PROPERTY_NAME, value=".* system .*")
public class FlightRunner {

}
