package com.alfredo.cursomc.services;

import javax.mail.internet.MimeMessage;

import com.alfredo.cursomc.domain.Cliente;

import org.springframework.mail.SimpleMailMessage;

import com.alfredo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}