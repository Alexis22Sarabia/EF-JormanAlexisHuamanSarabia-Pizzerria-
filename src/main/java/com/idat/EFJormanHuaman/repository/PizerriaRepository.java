package com.idat.EFJormanHuaman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJormanHuaman.model.Pizerria;


@Repository
public interface PizerriaRepository  extends JpaRepository<Pizerria, Integer>{

}
