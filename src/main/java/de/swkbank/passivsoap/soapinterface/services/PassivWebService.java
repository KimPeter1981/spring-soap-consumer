package de.swkbank.passivsoap.soapinterface.services;

import de.swkbank.passivsoap.soapinterface.model.GetBankResponseType;
import de.swkbank.passivsoap.soapinterface.model.GetBankType;
import de.swkbank.passivsoap.soapinterface.model.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class PassivWebService {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public String getBank() {
        ObjectFactory objectFactory = new ObjectFactory();
        GetBankType bankType = objectFactory.createGetBankType();
        bankType.setBlz("37050198");
        GetBankResponseType getBankResponseType = (GetBankResponseType) template.marshalSendAndReceive("http://thomas-bayer.com/blz/BLZService", bankType);
        return null;
    }

}
