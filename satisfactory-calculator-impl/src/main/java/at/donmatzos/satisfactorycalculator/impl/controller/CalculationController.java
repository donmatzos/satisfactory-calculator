package at.donmatzos.satisfactorycalculator.impl.controller;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequestMapping("/api/calculate")
@RestController("Calculation Controller V0.1")
public class CalculationController extends AbstractBaseController
{
    @PostMapping("/add")
    public int addTwoNumbers(@Parameter int num1, @Parameter int num2) {
        return num1 + num2;
    }
}
