package com.justai.jaicf.template.connectors

import com.justai.jaicf.channel.jaicp.JaicpPollingConnector
import com.justai.jaicf.channel.jaicp.channels.ChatApiChannel
import com.justai.jaicf.channel.jaicp.channels.ChatWidgetChannel
import com.justai.jaicf.template.accessToken
import com.justai.jaicf.template.templateBot

fun main() {
    JaicpPollingConnector(
        templateBot,
        accessToken,
        channels = listOf(ChatApiChannel, ChatWidgetChannel)
    ).runBlocking()
}