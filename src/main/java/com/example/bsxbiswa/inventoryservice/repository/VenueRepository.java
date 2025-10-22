package com.example.bsxbiswa.inventoryservice.repository;

import com.example.bsxbiswa.inventoryservice.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {

}
