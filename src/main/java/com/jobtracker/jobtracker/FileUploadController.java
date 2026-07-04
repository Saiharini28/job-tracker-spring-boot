package com.jobtracker.jobtracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class FileUploadController {

    private static final String UPLOAD_DIR = "uploads/";

    @PostMapping("/upload")
    public ResponseEntity<String> uploadResume(@RequestParam("file") MultipartFile file) {

        try {
            Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());

            Files.createDirectories(path.getParent());

            Files.write(path, file.getBytes());

            return ResponseEntity.ok(file.getOriginalFilename());

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Upload Failed");
        }
    }
}