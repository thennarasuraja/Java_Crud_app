package com.example.Crud.Repositary;

import com.example.Crud.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepositary extends JpaRepository<Task,Long> {
}
