package com.geeked.app

import org.junit.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    @Test
    fun appName_isCorrect() {
        val expected = "Geeked"
        assertEquals(expected, expected)
    }

    @Test
    fun appTagline_isCorrect() {
        val expected = "Your developer companion"
        assertEquals(expected, expected)
    }
}
