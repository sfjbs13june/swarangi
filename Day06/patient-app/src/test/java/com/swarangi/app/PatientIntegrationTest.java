package com.swarangi.app;

import com.swarangi.app.controller.PatientController;
import com.swarangi.app.model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Base64Utils;

@RunWith(SpringRunner.class)
@WebMvcTest(PatientController.class)
public class PatientIntegrationTest {

    @InjectMocks
    PatientController patientController;

    @Autowired
    private MockMvc mockMvc;
    @Value("${patient.post.url}")
    String posturl;
    @Value("${patient.put.url}")
    String puturl;
    @Test
    public void testPostIntegration()throws Exception{
        String secret="Basic"+ Base64Utils.encodeToString(("user123"+":"+"password").getBytes());
        Patient patient=new Patient("pat01","merry","35","female","cold");
        ResultActions responseEntity = mockMvc.perform(post(posturl).header))
    }
}
