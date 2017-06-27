package io.rvindel.calculator

class UserService(repository: UserRepository) {

  def findById(id: Long): String = this.repository.findById(id)
}