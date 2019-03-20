package dsl

import java.time.LocalDate

/**
 *  The default message format we use for communications between publishers and receivers.
 *  A message must contain a [senderId] unique within a communication group, a [sendTime]
 *  to indicate the time when the message is sent out,
 */
data class Message(
    val senderId : String,
    val sendTime : LocalDate,
    val requireResponse : Boolean = false,
    val isExclusiveMessage : Boolean = false
)