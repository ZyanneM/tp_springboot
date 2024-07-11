package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIResources {

    // Simulated list of IDs
    public List<Integer> idList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    // GET method
    @GetMapping("/get")
    public String getMessage() {
        return "GET request received!";
    }

    // POST method
    @PostMapping("/post")
    public String postMessage() {
        return "POST request received!";
    }

    // PUT method
    @PutMapping("/put")
    public String putMessage() {
        return "PUT request received!";
    }

    // DELETE method with ID parameter
    @DeleteMapping("/delete/{id}")
    public String deleteMessage(@PathVariable int id) {
        if (idList.contains(id)) {
            idList.remove(Integer.valueOf(id));
            return "The id " + id + " exists, delete ok";
        } else {
            return "The id " + id + " does not exist, delete failed";
        }
    }
}
