package com.company.app.conf

import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory

import scala.util.Try

/**
  *
  */
object ConfigurationUtil {

  private val logger = LoggerFactory.getLogger(ConfigurationUtil.getClass)
  private val config = ConfigFactory.load()

  def safeGet(path: String, defaultValue: String): String = {
    val attempt = Try(Option(config.getString(path)))
    if(attempt isFailure) logger.warn(s"Failed to load config path: $path using default: $defaultValue")
    (for (o <- attempt.toOption; value <- o) yield value) getOrElse defaultValue
  }

  def safeGet(path: String, defaultValue: Int): Int = {
    val attempt = Try(Option(config.getInt(path)))
    if(attempt isFailure) logger.warn(s"Failed to load config path: $path using default: $defaultValue")
    (for (o <- attempt.toOption; value <- o) yield value) getOrElse defaultValue
  }

  def safeGet(path: String, defaultValue: Boolean): Boolean = {
    val attempt = Try(Option(config.getBoolean(path)))
    if(attempt isFailure) logger.warn(s"Failed to load config path: $path using default: $defaultValue")
    (for (o <- attempt.toOption; value <- o) yield value) getOrElse defaultValue
  }

}
