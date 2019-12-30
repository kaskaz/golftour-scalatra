package dev.kaskaz.golftour.models

case class Accommodation (
  id: Int,
  name: String,
  kind: String,
  capacity: Int,
  address: String,
  local: String,
  county: String,
  district: String,
  latitude: Long,
  longitude: Long,
)
