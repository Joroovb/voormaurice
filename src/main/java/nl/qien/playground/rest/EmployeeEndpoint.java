package nl.qien.playground.rest;

import nl.qien.playground.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndpoint {

    @GetMapping("/string")
    public String getEmployeeString() {
        System.out.println("GET is gelukt");
        return "Goed gedaan maat!";
    }

    @PostMapping("/new")
    public Employee newEmployee(@RequestBody Employee employee) {
        return employee;
    }
}
