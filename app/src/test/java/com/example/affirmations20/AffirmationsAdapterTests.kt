package com.example.affirmations20

import ItemAdapter
import com.example.affirmations20.model.Affirmation
import org.junit.Test
import android.content.Context
import org.junit.Assert.assertEquals
import org.mockito.Mockito.mock
class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}