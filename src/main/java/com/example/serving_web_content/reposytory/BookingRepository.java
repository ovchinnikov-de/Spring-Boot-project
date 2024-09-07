package com.example.serving_web_content.reposytory;

import com.example.serving_web_content.models.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Long> {
}
