package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateRepository extends JpaRepository<Date, Long> {
}
