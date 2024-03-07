package com.chatapp.messenger.dto;


import com.chatapp.messenger.enums.MessageType;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private String  content;
    private String sender;
    private MessageType type;
}
