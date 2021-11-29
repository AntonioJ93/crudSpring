package com.example.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.modelo.entity.Cliente;

// @Repository	//versiones antiguas
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
