package com.example.kinghelper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()
    init{
        initializesCourse()
    }

    private fun initializesCourse(){
        var course = CourseInfo(courseId = "android_intents", title = "Android Prog with intents")
        courses[course.courseId] =  course

        course = CourseInfo(courseId = "android_intents1", title = "Android Prog2 with intents")
        courses[course.courseId] =  course
        course = CourseInfo(courseId = "android_intents2", title = "Android Prog3 with intents")
        courses[course.courseId] =  course

    }
}