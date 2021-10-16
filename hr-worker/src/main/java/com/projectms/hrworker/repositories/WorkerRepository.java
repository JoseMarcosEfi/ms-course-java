package com.projectms.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectms.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}