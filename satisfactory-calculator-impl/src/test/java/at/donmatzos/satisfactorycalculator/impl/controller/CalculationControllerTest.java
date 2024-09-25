package at.donmatzos.satisfactorycalculator.impl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
@EnableAutoConfiguration
@Test
public class CalculationControllerTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    private CalculationController calculationController;

    public void testCalculationHealth() {
        Assert.assertEquals(calculationController.getHealth(), calculationController.HEALTH);
    }
}
