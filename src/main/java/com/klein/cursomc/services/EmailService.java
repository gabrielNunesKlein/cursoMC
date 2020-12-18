package com.klein.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.klein.cursomc.domain.Pedido;

public interface EmailService {
	
	void senOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
