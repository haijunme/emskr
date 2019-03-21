package dsl

import org.jetbrains.annotations.NotNull
import java.time.LocalDate

/**
 * The default message format used for communications between servers
 */
data class Message(
    val messageId: String,
    val senderId : String,
    val senderGroupId: String,
    val receiverGroupId: String,
    @NotNull val sendTime: LocalDate,
    val requireResponse : Boolean = false,
    val isExclusiveMessage: Boolean = false,
    val messageContent: String
)