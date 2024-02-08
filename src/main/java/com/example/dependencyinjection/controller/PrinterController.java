package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.PrinterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrinterController {

    private final PrinterService printerService;

    @GetMapping("/print")
    public String Printer(@RequestParam(defaultValue = "Hello", value = "text") String text) {
        printerService.print(text);
        return "test";
    }
}
