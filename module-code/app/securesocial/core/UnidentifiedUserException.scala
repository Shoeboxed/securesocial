package securesocial.core

case class UnidentifiedUserException(user: Identity) extends RuntimeException