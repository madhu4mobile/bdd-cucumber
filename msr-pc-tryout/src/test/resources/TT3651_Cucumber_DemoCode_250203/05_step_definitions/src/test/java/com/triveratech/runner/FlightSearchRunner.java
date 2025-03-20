package com.triveratech.runner;

import io.cucumber.core.options.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Flight Search Test Suite")
@SelectClasspathResource("features/departures")
@ConfigurationParameter(key= "cucumber.glue",
                        value="com.triveratech.destination.flights")
public class FlightSearchRunner {



}
