package com.allied.chat.ejb;

import java.util.Date;
import javax.ejb.Local;
import com.allied.chat.web.Message;

/**
 * Local interface for chat logic EJB
 *
 * @author aarocreo
 */
@Local
public interface ChatManagerLocal {

    void sendMessage(Message msg);

    Message retrieveLatest(Date after);

}
