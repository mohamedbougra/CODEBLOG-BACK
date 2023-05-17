package com.example.springboottest.web;

import com.example.springboottest.entity.Writer;
import com.example.springboottest.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/in")
public class WriterController {
     @Autowired
      WriterService writerService;
@GetMapping("/{username}")
     public Writer findbyUserName(@PathVariable String username){
          return writerService.findByUsername(username);
     }
    @PutMapping("/{username}")
    public Writer updateWriter(@PathVariable String username, @RequestBody Writer writer){
        Writer existingWriter = writerService.findByUsername(username);
        existingWriter.setFirstName(writer.getFirstName());
        existingWriter.setLastName(writer.getLastName());
        existingWriter.setEmail(writer.getEmail());
        existingWriter.setPhone(writer.getPhone());
        existingWriter.setJob(writer.getJob());
        existingWriter.setLinkedInProfile(writer.getLinkedInProfile());
        existingWriter.setGithubProfile(writer.getGithubProfile());
        existingWriter.setBio(writer.getBio());
        existingWriter.setYearsOfExperience(writer.getYearsOfExperience());
        existingWriter.setArticleList(writer.getArticleList());
        existingWriter.setCategories(writer.getCategories());
        existingWriter.setProfileImage(writer.getProfileImage());
        existingWriter.setCompanyName(writer.getCompanyName());
        return writerService.updateWriter(existingWriter);
    }
    @PutMapping("/signup")
    public Writer updateWriter(@RequestBody Writer writer){
        return writerService.addWriter(writer);
    }
}