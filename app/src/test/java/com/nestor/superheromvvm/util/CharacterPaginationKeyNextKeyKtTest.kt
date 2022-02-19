package com.nestor.superheromvvm.util

import com.nestor.superheromvvm.data.repository.character.CharacterPaginationKey
import com.nestor.superheromvvm.data.repository.character.DEFAULT_CHARACTER_LIMIT
import org.junit.Assert.*

import org.junit.Test

class CharacterPaginationKeyNextKeyKtTest {

    @Test
    fun `should return the next key`() {
        val key = CharacterPaginationKey(offset = 100, limit = DEFAULT_CHARACTER_LIMIT)
        assertEquals(
            key.nextKey(),
            CharacterPaginationKey(
                offset = 100 + DEFAULT_CHARACTER_LIMIT,
                limit = DEFAULT_CHARACTER_LIMIT
            )
        )
    }
}