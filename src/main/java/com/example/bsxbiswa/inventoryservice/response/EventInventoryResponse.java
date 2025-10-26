package com.example.bsxbiswa.inventoryservice.response;

import com.example.bsxbiswa.inventoryservice.entity.Venue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EventInventoryResponse {
    private String event;
    private Long capacity;
    private Venue venue;
}
