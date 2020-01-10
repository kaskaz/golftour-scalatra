package dev.kaskaz.golftour.controllers

import dev.kaskaz.golftour.models.Course
import dev.kaskaz.golftour.repositories.CoursesRepository
import dev.kaskaz.golftour.services.CoursesService
import org.json4s.JsonAST.JObject
import org.json4s.JsonDSL._
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json._

import scala.collection.mutable.ListBuffer


class CoursesController extends ScalatraServlet with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  val COURSES = Seq(
    Course(1, "Campo Real", "2005", "Donald Steel", 18, 72, List("One", "Two"), false, true, "https://www.dolcecamporeal.com/pt/golfe/", "Turcifal", "Torres Vedras", "Lisboa", 39.0327626768318, -9.24289579133255),
    Course(2, "Quinta do Vale Golf Resort", "2005", "Donald Steel", 18, 72, List("One", "Two"), false, true, "https://www.dolcecamporeal.com/pt/golfe/", "Turcifal", "Torres Vedras", "Lisboa", 39.0327626768318, -9.24289579133255)
  )

  before() {
    contentType = "application/json"
    response.setHeader("Access-Control-Allow-Origin", "*")
  }

  get("/list") {
    val list = ListBuffer[JObject]()
    CoursesService.getAll().foreach(course =>
      list += ("id", course.id)
            ~ ("name", course.name)
            ~ ("local", course.local)
            ~ ("openingYear", course.openingYear)
            ~ ("pairs", course.pairs)
            ~ ("holes", course.holes)
            ~ ("isClubHouse", course.isClubHouse)
            ~ ("isAcademy", course.isAcademy)
    )
    list
  }

  get("/details") {
    "details of courses"
  }

}