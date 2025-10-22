package com.example.bsxbiswa.inventoryservice.repository;

import com.example.bsxbiswa.inventoryservice.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
