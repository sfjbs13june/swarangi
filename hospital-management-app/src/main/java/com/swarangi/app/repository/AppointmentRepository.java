package com.swarangi.app.repository;

import com.swarangi.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    public Appointment save(Appointment ap);
    public Appointment findBydoctorName(String doctorName);
    public Appointment findByPatientName(String patientName);
}
