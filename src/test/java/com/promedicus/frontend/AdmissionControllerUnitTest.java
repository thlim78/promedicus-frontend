package com.promedicus.frontend;

/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.promedicus.frontend.model.Admission;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.promedicus.frontend.controller.AdmissionController;
import com.promedicus.frontend.repositories.UserRepository;
*/

public class AdmissionControllerUnitTest {

    /*
    private static AdmissionController admissionController;
    private static UserRepository mockedUserRepository;
    private static BindingResult mockedBindingResult;
    private static Model mockedModel;

    @BeforeClass
    public static void setUpUserControllerInstance() {
        mockedUserRepository = mock(UserRepository.class);
        mockedBindingResult = mock(BindingResult.class);
        mockedModel = mock(Model.class);
        admissionController = new AdmissionController(mockedUserRepository);
    }

    @Test
    public void whenCalledshowSignUpForm_thenCorrect() {
        Admission admission = new Admission("John", "john@domain.com");

        assertThat(admissionController.showSignUpForm(admission)).isEqualTo("add-admission");
    }
    
    @Test
    public void whenCalledaddUserAndValidUser_thenCorrect() {
        Admission admission = new Admission("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(false);

        assertThat(admissionController.addUser(admission, mockedBindingResult, mockedModel)).isEqualTo("index");
    }

    @Test
    public void whenCalledaddUserAndInValidUser_thenCorrect() {
        Admission admission = new Admission("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(true);

        assertThat(admissionController.addUser(admission, mockedBindingResult, mockedModel)).isEqualTo("add-admission");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCalledshowUpdateForm_thenIllegalArgumentException() {
        assertThat(admissionController.showUpdateForm(0, mockedModel)).isEqualTo("update-user");
    }
    
    @Test
    public void whenCalledupdateUserAndValidUser_thenCorrect() {
        Admission admission = new Admission("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(false);

        assertThat(admissionController.updateUser(1l, admission, mockedBindingResult, mockedModel)).isEqualTo("index");
    }

    @Test
    public void whenCalledupdateUserAndInValidUser_thenCorrect() {
        Admission admission = new Admission("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(true);

        assertThat(admissionController.updateUser(1l, admission, mockedBindingResult, mockedModel)).isEqualTo("update-admission");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void whenCalleddeleteUser_thenIllegalArgumentException() {
        assertThat(admissionController.deleteUser(1l, mockedModel)).isEqualTo("index");
    }

    */
}
