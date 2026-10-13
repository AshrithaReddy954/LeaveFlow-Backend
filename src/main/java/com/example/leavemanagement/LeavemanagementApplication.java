
package com.example.leavemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:5174",
    "https://leaveflow-frontend-4nhz.onrender.com"
})
public class LeavemanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeavemanagementApplication.class, args);
    }

    @GetMapping("/api/health")
    public String healthCheck() {
        return "LeaveFlow Backend is working successfully!";
    }
}
