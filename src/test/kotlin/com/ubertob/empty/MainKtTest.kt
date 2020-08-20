package com.ubertob.empty

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class MainKtTest {

    @Test
    fun `main test`(){
       expectThat(4 + 3).isEqualTo(7)
    }

}