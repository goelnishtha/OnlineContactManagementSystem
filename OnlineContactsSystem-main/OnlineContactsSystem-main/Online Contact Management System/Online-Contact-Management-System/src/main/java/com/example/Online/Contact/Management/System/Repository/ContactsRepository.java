package com.example.Online.Contact.Management.System.Repository;

import com.example.Online.Contact.Management.System.Models.Contacts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

    @Query(value = "SELECT * FROM Contacts", nativeQuery = true)
    List<Contacts> viewAllUsers();

    @Modifying
    @Transactional
    @Query(value = "UPDATE Contacts SET name=?1, email=?2 WHERE phono=?3", nativeQuery = true)
    void updateUser(String name, String email, String phono);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Contacts WHERE email=?1", nativeQuery = true)
    void deleteUser(String email);

}
