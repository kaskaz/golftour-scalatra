package dev.kaskaz.golftour.services


import dev.kaskaz.golftour.models.Course
import dev.kaskaz.golftour.repositories.CoursesRepository

import scala.collection.mutable.ListBuffer

object CoursesService {

  def getAll(): ListBuffer[Course] = {
    val list = new ListBuffer[Course]()
    CoursesRepository.
    list
  }
}
