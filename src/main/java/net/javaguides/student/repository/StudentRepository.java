package net.javaguides.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.javaguides.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    @Modifying
    @Query("UPDATE Student m SET m.id = :newId WHERE m.id = :oldId")
    void updateId(@Param("oldId") Long oldId, @Param("newId") Long newId);

    @Query("SELECT m.id FROM Student m")
    List<Long> findAllIds();
}
