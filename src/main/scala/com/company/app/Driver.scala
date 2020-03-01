package com.company.app

import com.company.app.conf.AppConfig
import processing.core.PApplet

/**
  *
  */
object Driver extends PApplet {

  def main(args: Array[String]): Unit = {
    PApplet.main("com.company.app.Driver")
  }

}

class Driver  extends PApplet {

  val displayStats = true //TODO pull from config file
  val windowed = false //TODO pull from config file

  override def settings: Unit = {
    if(windowed) {
      size(AppConfig.windowSettings.sizeX, AppConfig.windowSettings.sizeY, "processing.opengl.PGraphics2D")
    } else {
      fullScreen("processing.opengl.PGraphics2D")
    }
  }

  override def setup: Unit = {
    frameRate(60)
    AppConfig.init(width, height)
  }

  override def draw: Unit = {
    background(0)

    if(displayStats) {
      pushMatrix()
      translate(AppConfig.windowSettings.sizeX*0.02f, AppConfig.windowSettings.sizeX*0.02f)
      textSize(18)
      text(s"fps: $frameRate\nMouseX: $mouseX\nMouseY: $mouseY", 0, 0)
      popMatrix()
    }
  }

}
