package securesocial.controllers

import play.api.mvc.Result
import play.api.Plugin

trait AuthFlowErrorHandler {
  def handle(ex: Throwable): Option[Result]
}

trait AuthFlowErrorHandlerPlugin extends Plugin {
  def handler: AuthFlowErrorHandler
}