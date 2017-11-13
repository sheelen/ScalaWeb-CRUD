package controllers

import javax.inject.Inject
import play.api.mvc._

class CarAdvertsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok("It works!")
  }

  def getAdverts = Action {
    Ok("getAllAdverts")
  }

  //fetch one record from carAdvert
  def fetch(id: Integer)= Action {
    Ok("get one advert")
  }
  //add new carAdvert
  def create()= Action {
    Ok("create new")
  }

  //modify existing carAdvert
  def modify(id: Integer)=Action {
    Ok("modify")
  }

  //delete existing carAdvert
  def remove(id: Integer)=Action {
    Ok("delete")
  }

}
