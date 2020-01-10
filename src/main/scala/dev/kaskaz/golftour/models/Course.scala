package dev.kaskaz.golftour.models

case class Course (
  id: Int,
  name: String,
  openingYear: String,
  architect: String,
  holes: Int,
  pairs: Int,
  facilities: List[String],
  isClubHouse: Boolean,
  isAcademy: Boolean,
  website: String,
  local: String,
  county: String,
  district: String,
  latitude: Double,
  longitude: Double
)
