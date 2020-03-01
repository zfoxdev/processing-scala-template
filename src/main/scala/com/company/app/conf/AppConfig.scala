package com.company.app.conf

import com.typesafe.config.ConfigFactory

object AppConfig {

  private val config = ConfigFactory.load()

  case class WindowSettings(sizeX: Int, sizeY: Int)

  var windowSettings: WindowSettings = WindowSettings(
    sizeX = config.getInt("window.sizeX"),
    sizeY = (config.getInt("window.sizeX")*0.6).toInt
  )

  /**
    * Call from settings() after it has been decided if the game
    * is being run in windowed mode or full screen and the final
    * screen sizes have been determined.
    */
  def init(width: Int, height: Int): Unit = {
    windowSettings = WindowSettings(
      sizeX = width,
      sizeY = height
    )
  }

}