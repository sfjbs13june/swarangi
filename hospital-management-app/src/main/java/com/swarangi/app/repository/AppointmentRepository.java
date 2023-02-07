package com.swarangi.app.repository;

import com.swarangi.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    public Appointment save(Appointment ap);
    public List<Appointment> findBydoctorName(String doctorName);
    public Appointment findByPatientName(String patientName);
}
