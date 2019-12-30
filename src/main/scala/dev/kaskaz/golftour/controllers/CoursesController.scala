package dev.kaskaz.golftour.controllers

import dev.kaskaz.golftour.models.Course
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json._

class CoursesController extends ScalatraServlet with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  val COURSES = Seq(
    Course(1, "Campo Real", "2005", "Donald Steel", 18, 72, List("One", "Two"), false, true, "https://www.dolcecamporeal.com/pt/golfe/", "Turcifal", "Torres Vedras", "Lisboa", 39.0327626768318, -9.24289579133255),
    Course(2, "Quinta do Vale Golf Resort", "2005", "Donald Steel", 18, 72, List("One", "Two"), false, true, "https://www.dolcecamporeal.com/pt/golfe/", "Turcifal", "Torres Vedras", "Lisboa", 39.0327626768318, -9.24289579133255)
  )

  before() {
    contentType = "application/json"
  }

  get("/list") {
    COURSES
  }

  get("/details") {
    "details of courses"
  }

}


//{
//  id: 2,
//  name: 'Quinta do Vale Golf Resort',
//  openingYear: '2008',
//  architect: 'Severiano Ballesteros',
//  holes: 18,
//  pairs: 72,
//  facilities: ['Driving Range', 'Putting Green', 'Chipping Green', 'Buggies', 'Trolleys', 'Aluguer de Tacos', 'Loja', 'Restaurante', 'Bar', 'Sauna', 'Centro Hípico', 'Futebol', 'Piscina', 'Ténis'],
//  isClubHouse: true,
//  isAcademy: false,
//  website: 'https://www.dolcecamporeal.com/pt/golfe/',
//  local: 'Turcifal',
//  county: 'Torres Vedras',
//  district: 'Lisboa',
//  latitude: 39.0327626768318,
//  longitude: -9.24289579133255
//}