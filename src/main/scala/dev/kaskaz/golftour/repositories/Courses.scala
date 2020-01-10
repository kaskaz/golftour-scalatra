package dev.kaskaz.golftour.repositories

import slick.jdbc.H2Profile.api._
import slick.lifted.ProvenShape

class Courses(tag: Tag)
  extends Table[(Int, String, String, String, Int, Int, String, Boolean, Boolean, String, String, String,
  String, Double, Double)] (tag, "COURSES") {

  def id: Rep[Int] = column[Int]("ID", O.PrimaryKey)
  def name: Rep[String] = column[String]("NAME")
  def openingYear: Rep[String] = column[String]("OPENING_YEAR")
  def architect: Rep[String] = column[String]("ARCHITECT")
  def holes: Rep[Int] = column[Int]("HOLES")
  def pairs: Rep[Int] = column[Int]("PAIRS")
  def facilities: Rep[String] = column[String]("FACILITIES")
  def isClubHouse: Rep[Boolean] = column[Boolean]("IS_CLUB_HOUSE")
  def isAcademy: Rep[Boolean] = column[Boolean]("IS_ACADEMY")
  def website: Rep[String] = column[String]("WEBSITE")
  def local: Rep[String] = column[String]("LOCAL")
  def county: Rep[String] = column[String]("COUNTY")
  def district: Rep[String] = column[String]("DISTRICT")
  def latitude: Rep[Double] = column[Double]("LATITUDE")
  def longitude: Rep[Double] = column[Double]("LONGITUDE")

  override def * = (id, name, openingYear, architect, holes, pairs, facilities, isClubHouse,
    isAcademy, website, local, county, district, latitude, longitude)
}


class Suppliers(tag: Tag)
  extends Table[(Int, String, String, String, String, String)](tag, "SUPPLIERS") {

  def id: Rep[Int] = column[Int]("SUP_ID", O.PrimaryKey)
  def name: Rep[String] = column[String]("SUP_NAME")
  def street: Rep[String] = column[String]("STREET")
  def city: Rep[String] = column[String]("CITY")
  def state: Rep[String] = column[String]("STATE")
  def zip: Rep[String] = column[String]("ZIP")

  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[(Int, String, String, String, String, String)] =
    (id, name, street, city, state, zip)
}