package com.sample.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.test.model.Publications;
import com.sample.test.repository.PublicationsRepository;

@Service
public class PublicationsService {

    @Autowired
    private PublicationsRepository publicationsRepository;

    public List<Publications> getAllPublications() {
        return publicationsRepository.findAll();
    }

    public Publications getPublicationsByName(String name) {
        return publicationsRepository.findByName(name);
    }

    public Publications getPublicationsByDays(String days) {
        return publicationsRepository.findByDays(days);
    }

    public Publications getPublicationsByPublisher(String publisher) {
        return publicationsRepository.findByPublisher(publisher);
    }

    public Publications getPublicationsByActive(boolean active) {
        return publicationsRepository.findByActive(active);
    }

    public Publications getPublicationsByNameAndDaysAndPublisherAndActive(String name, String days, String publisher, boolean active) {
        return publicationsRepository.findByNameAndDaysAndPublisherAndActive(name, days, publisher, active);
    }

    public Publications savePublications(Publications publications) {
        return publicationsRepository.saveAndFlush(publications);
    }

    public void deletePublicationsByName(String name) {
        publicationsRepository.deleteByName(name);
    }

    public void deletePublicationsByDays(String days) {
        publicationsRepository.deleteByDays(days);
    }

    public void deletePublicationsByPublisher(String publisher) {
        publicationsRepository.deleteByPublisher(publisher);
    }

    public void deletePublicationsByActive(boolean active) {
        publicationsRepository.deleteByActive(active);
    }

    public void deletePublicationsByNameAndDaysAndPublisherAndActive(String name, String days, String publisher, boolean active) {
        publicationsRepository.deleteByNameAndDaysAndPublisherAndActive(name, days, publisher, active);
    }

}