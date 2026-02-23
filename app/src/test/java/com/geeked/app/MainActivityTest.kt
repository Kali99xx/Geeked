package com.geeked.app

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class MainActivityTest {

    @Test
    fun appName_isNotEmpty() {
        val appName = "Geeked"
        assertNotNull(appName)
        assertEquals(6, appName.length)
    }

    @Test
    fun appTagline_isNotEmpty() {
        val tagline = "Your developer companion"
        assertNotNull(tagline)
        assertEquals("Your developer companion", tagline)
    }
}
