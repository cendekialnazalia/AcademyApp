package com.cendekia.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.cendekia.academy.data.CourseEntity
import com.cendekia.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}