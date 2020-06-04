package br.com.wpp;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class WhatsAppMensagem {
	private static final String SID_CONTA	= "ACXXXXXXXXX";
	private static final String TOKEN		= "token_conta";
	private static PhoneNumber de_whatsapp_numero;
	private static PhoneNumber para_whatsapp_numero;

	public static void main(String[] args) {
		String mensagem = "Hello World!";
		
		Twilio.init(SID_CONTA, TOKEN);

		de_whatsapp_numero		= new PhoneNumber("whatsapp:+99001112233");
		para_whatsapp_numero	= new PhoneNumber("whatsapp:+99004445566");
		
		Message.creator(de_whatsapp_numero, para_whatsapp_numero, mensagem).create();
		
	}
	
}
