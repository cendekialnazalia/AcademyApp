package com.cendekia.academy.ui.bookmark

import com.cendekia.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
