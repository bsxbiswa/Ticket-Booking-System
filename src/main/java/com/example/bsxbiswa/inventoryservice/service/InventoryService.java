package com.example.bsxbiswa.inventoryservice.service;

import com.example.bsxbiswa.inventoryservice.repository.EventRepository;
import com.example.bsxbiswa.inventoryservice.repository.VenueRepository;
import com.example.bsxbiswa.inventoryservice.response.EventInventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final EventRepository eventRepository;
    private final VenueRepository venueRepository;

    @Autowired
    public InventoryService( final EventRepository eventRepository, final VenueRepository venueRepository){
        this.eventRepository = eventRepository;
        this.venueRepository = venueRepository;
    }

    public List<EventInventoryResponse> getAllEvents () {

    }
}
