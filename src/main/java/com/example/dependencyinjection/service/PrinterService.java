package com.example.dependencyinjection.service;

import com.example.dependencyinjection.model.IPrintable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PrinterService {
    IPrintable printer;

    public PrinterService(IPrintable printer) {
        this.printer = printer;
    }

    public void print(String text) {
        printer.print(text);
    }
}
