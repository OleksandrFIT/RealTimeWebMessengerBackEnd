package com.realtimewebmessenger.model;

import com.realtimewebmessenger.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String senderName;
    private String receiverName;
    private String messageContent;

    private Status status;
}
