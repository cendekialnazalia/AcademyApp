package com.cendekia.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.cendekia.academy.data.CourseEntity
import com.cendekia.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}