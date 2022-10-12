package firstapi2.FirstApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/factorial")
public class FactorialController {

    @GetMapping(value = "/{n}")
    public int getFactorial(
            @PathVariable(
                    required = true
            ) int n
    ) {
        int factorial = 1;
        if (n == 0)
            return 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
