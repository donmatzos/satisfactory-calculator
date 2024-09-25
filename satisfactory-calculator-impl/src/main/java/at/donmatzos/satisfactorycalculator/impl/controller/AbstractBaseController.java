package at.donmatzos.satisfactorycalculator.impl.controller;

import org.springframework.web.bind.annotation.GetMapping;

public abstract class AbstractBaseController
{
    protected final String HEALTH = "healthy";

    @GetMapping("/health")
    public String getHealth() {
        return HEALTH;
    }
}
