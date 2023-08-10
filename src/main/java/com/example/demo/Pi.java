package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Pi {

    @PostMapping("v1/pi/calculations")
    public ResponseEntity<Map<String, Object>> calculatePi(@RequestBody Map<String, Object> requestBody) {
        int iterations = (int) requestBody.get("iterations");
        int decimalPlaces = (int) requestBody.get("decimalPlaces");

        double pi = calculatePiWithIterations(iterations);
        String formattedPi = formatPi(pi, decimalPlaces);

        Map<String, Object> response = new HashMap<>();
        response.put("pi", formattedPi);
        response.put("statusCode", HttpStatus.OK.value());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private double calculatePiWithIterations(int iterations) {
        double pi = 0;
        for (int i = 0; i < iterations; i++) {
            pi += (i % 2 == 0 ? 1 : -1) * 4.0 / (2 * i + 1);
        }
        return pi;
    }

    private String formatPi(double pi, int decimalPlaces) {
        String pattern = "#.";
        for (int i = 0; i < decimalPlaces; i++) {
            pattern += "#";
        }
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(pi);
    }
}
