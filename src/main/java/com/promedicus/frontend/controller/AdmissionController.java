package com.promedicus.frontend.controller;

import javax.validation.Valid;

import com.promedicus.frontend.model.Admission;
import com.promedicus.frontend.model.type.Category;
import com.promedicus.frontend.model.type.Gender;
import com.promedicus.frontend.service.AdmissionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdmissionController {
    
    private final AdmissionService admissionService;

    public AdmissionController(AdmissionService admissionService) {
        this.admissionService = admissionService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("admissions", admissionService.list());
        return "index";
    }

    @GetMapping("/create")
    public String showCreateAdmissionForm(Admission admission, Model model) {
        model.addAttribute("genders", Gender.values());
        model.addAttribute("categories", Category.values());
        return "create-admission";
    }

    @PostMapping("/add")
    public String create(@Valid Admission admission, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("genders", Gender.values());
            model.addAttribute("categories", Category.values());
            return "create-admission";
        }

        admissionService.create(admission);
        model.addAttribute("admissions", admissionService.list());
        return "redirect:/";
    }
    
    @GetMapping("/edit/{id}")
    public String showUpdateAdmissionForm(@PathVariable("id") Long id, Model model) {
        Admission admission = admissionService.get(id);
        model.addAttribute("admission", admission);
        model.addAttribute("genders", Gender.values());
        model.addAttribute("categories", Category.values());
        return "update-admission";
    }
    
    @PostMapping("/update/{id}")
    public String updateAdmission(@PathVariable("id") Long id, @Valid Admission admission, BindingResult result, Model model) {
        if (result.hasErrors()) {
            admission.setId(id);
            model.addAttribute("genders", Gender.values());
            model.addAttribute("categories", Category.values());
            return "update-admission";
        }
        admissionService.update(id, admission);
        model.addAttribute("admissions", admissionService.list());
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteAdmission(@PathVariable("id") Long id, Model model) {
        admissionService.delete(id);
        model.addAttribute("admissions", admissionService.list());
        return "redirect:/";
    }
}
