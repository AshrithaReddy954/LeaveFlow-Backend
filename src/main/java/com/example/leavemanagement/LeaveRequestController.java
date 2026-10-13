
package com.example.leavemanagement;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/leaves")
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:5174",
    "https://leaveflow-frontend-4nhz.onrender.com"
})
public class LeaveRequestController {

    private final LeaveRequestRepository repository;

    public LeaveRequestController(LeaveRequestRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<LeaveRequest> getAllLeaves() {
        return repository.findAll();
    }

    @PostMapping
    public LeaveRequest createLeave(@RequestBody LeaveRequest leaveRequest) {
        return repository.save(leaveRequest);
    }
}