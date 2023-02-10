package com.swarangi.app;

import com.swarangi.app.controller.PrescriptionController;
import com.swarangi.app.model.Prescription;
import com.swarangi.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {

    @InjectMocks
    PrescriptionController prescriptionController;

    @Mock
    Prescription prescription;

    @Mock
    PrescriptionRepository prescriptionRepository;

    @BeforeEach
    void setUp(){
        prescription= Mockito.mock(Prescription.class);
        prescriptionRepository=Mockito.mock(PrescriptionRepository.class);
    }
    @Test
    public void TestSavePrescriptionController(){

        Prescription pre=new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(pre);
        Prescription result=prescriptionController.savePrescription(prescription);
        assertEquals(pre,result);

    }
    @Test
    public void TestGetAllPrescriptionController(){
        List<Prescription> prescriptions=new ArrayList();
        Prescription prescription1=new Prescription();
        prescription1.setPrescriptionId("pre123");
        prescription1.setAppointmentId("123");
        prescription1.setDescription("cold fever");
        prescription1.setPatientName("Mahima");
        prescription1.setDoctorName("doc1");
        prescriptions.add(prescription1);

        when(prescriptionRepository.findAll()).thenReturn(prescriptions);
        List<Prescription> result=prescriptionController.getAllPrescriptions();
        assertEquals(prescriptions.size(),1);
        assertEquals(prescriptions.get(0).getPrescriptionId(),result.get(0).getPrescriptionId());
        assertEquals(prescriptions.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(prescriptions.get(0).getDescription(),result.get(0).getDescription());
        assertEquals(prescriptions.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(prescriptions.get(0).getDoctorName(),result.get(0).getDoctorName());

    }

}
