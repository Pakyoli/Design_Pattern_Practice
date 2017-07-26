package com.my_spring.design_patterns;

import com.myspring.designpatterns.createPatterns.abstractFactoryPattern.ComputerFactory;
import org.junit.Test;

/**
 * Created by Patrick on 7/25/17.
 */
public class ShopComputerTest {

    @Test
    public void testShopComputer() throws Exception {
        new ComputerFactory().buildComputer("Desktop");
    }
}
