package com.my_spring.design_patterns;

import com.myspring.designpatterns.createPatterns.builderPattern.BuildComputer;
import org.junit.Test;

/**
 * Created by Patrick on 7/25/17.
 */
public class BuildComputerTest {

    @Test
    public void testBuildComputerA() throws Exception {

        new BuildComputer().buildA();
    }

    @Test
    public void testBuildComputerB() throws Exception {
        new BuildComputer().buildB();
    }

}
