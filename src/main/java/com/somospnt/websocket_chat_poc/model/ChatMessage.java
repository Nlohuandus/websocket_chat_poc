package com.somospnt.websocket_chat_poc.model;

import com.somospnt.websocket_chat_poc.model.enums.MessageType;
import lombok.*;

/**
 * Represents a chat message in the chat application.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
