package io.rvindel.calculator

trait UserRepository {

  def findById(id: Long): String
}