package br.unisales.FabSoft.controller;

import br.unisales.FabSoft.model.EmailDetails;
import br.unisales.FabSoft.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping
public class EmailController {
    
    @Autowired
    private EmailService emailService;
    
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details){
        return emailService.sendMail(details);
    }
    
    @PostMapping("/sendMailWichAttachment")
    public String sendMailWichAttachment(@RequestBody EmailDetails details){
        return emailService.sendMailWichAttachment(details);
    }
    
}

