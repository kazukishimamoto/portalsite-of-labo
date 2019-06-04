package Test

import ModelTest.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user_information")
class UserController(
        private val userRepository: UserRepository
) {
    @GetMapping("")
    fun index(model: Model): String {
        val users = userRepository.findAll()
        model.addAttribute("user_information", users)
        return "user_information/index2"
    }

    @GetMapping("{id}")
    fun show(
            @PathVariable id: Int,
            model: Model
    ): String {
        val user = userRepository.findById(id) ?: throw RecordNotFoundException()
        model.addAttribute("user_information", user)
        return "user_information/show"
    }
}