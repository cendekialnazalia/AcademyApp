package com.cendekia.academy.di

import android.content.Context
import com.cendekia.academy.data.source.AcademyRepository
import com.cendekia.academy.data.source.remote.RemoteDataSource
import com.cendekia.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}