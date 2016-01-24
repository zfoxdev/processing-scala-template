package com.company.app

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

  override def settings: Unit = {
    size(800, 600)
  }

  override def setup: Unit = {

  }

  override def draw: Unit = {
    background(0)
  }

}
