package com.sample.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.model.Publications;
import com.sample.test.service.PublicationsService;

@RestController
@RequestMapping("/publications")
public class PublicationsController {

    @Autowired
    private PublicationsService publicationsService;

    @GetMapping("/all")
    public List<Publications> getAllPublications() {
        return publicationsService.getAllPublications();
    }

    @GetMapping("/name/{name}")
    public Publications getPublicationsByName(@PathVariable String name) {
        return publicationsService.getPublicationsByName(name);
    }

    @GetMapping("/days/{days}")
    public Publications getPublicationsByDays(@PathVariable String days) {
        return publicationsService.getPublicationsByDays(days);
    }

    @GetMapping("/publisher/{publisher}")
    public Publications getPublicationsByPublisher(@PathVariable String publisher) {
        return publicationsService.getPublicationsByPublisher(publisher);
    }

    @GetMapping("/active/{active}")
    public Publications getPublicationsByActive(@PathVariable boolean active) {
        return publicationsService.getPublicationsByActive(active);
    }

    @GetMapping("/nameanddaysandpublisherandactive/{name}/{days}/{publisher}/{active}")
    public Publications getPublicationsByNameAndDaysAndPublisherAndActive(@PathVariable String name, @PathVariable String days, @PathVariable String publisher, @PathVariable boolean active) {
        return publicationsService.getPublicationsByNameAndDaysAndPublisherAndActive(name, days, publisher, active);
    }

    @PostMapping("/save")
    public Publications savePublications(@RequestBody Publications publications) {
        return publicationsService.savePublications(publications);
    }

    @DeleteMapping("/name/{name}")
    public void deletePublicationsByName(@PathVariable String name) {
        publicationsService.deletePublicationsByName(name);
    }

    @DeleteMapping("/days/{days}")
    public void deletePublicationsByDays(@PathVariable String days) {
        publicationsService.deletePublicationsByDays(days);
    }

    @DeleteMapping("/publisher/{publisher}")
    public void deletePublicationsByPublisher(@PathVariable String publisher) {
        publicationsService.deletePublicationsByPublisher(publisher);
    }

    @DeleteMapping("/active/{active}")
    public void deletePublicationsByActive(@PathVariable boolean active) {
        publicationsService.deletePublicationsByActive(active);
    }

    @DeleteMapping("/nameanddaysandpublisherandactive/{name}/{days}/{publisher}/{active}")
    public void deletePublicationsByNameAndDaysAndPublisherAndActive(@PathVariable String name, @PathVariable String days, @PathVariable String publisher, @PathVariable boolean active) {
        publicationsService.deletePublicationsByNameAndDaysAndPublisherAndActive(name, days, publisher, active);
    }

}