import Model.LinkDao
import Model.UserDao
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import spark.Spark.*
import spark.ModelAndView
import spark.Request
import spark.Spark
import spark.template.thymeleaf.ThymeleafTemplateEngine
import java.util.HashMap

fun main(args: Array<String>) {
    Spark.staticFileLocation("/public");

    val userDao = UserDao()
    val linkDao = LinkDao()

    // Top
    path("index") {
        val model = HashMap<String, Any?>()
        get("") { req, res ->

            model.put("links", linkDao.links)
            ThymeleafTemplateEngine().render(
                    ModelAndView(model, "index")
            )
        }

        get("/:tag") { req, res ->
            linkDao.findByAllTag(req.params("tag").toInt())
        }
    }

    // Creating a Spark/Kotlin CRUD micro service
    path("/users") {

        get("") { req, res ->
            jacksonObjectMapper().writeValueAsString(userDao.users)
        }

        get("/:id") { req, res ->
            print(req.params("id"))
            userDao.findById(req.params("id").toInt())
        }

        get("/email/:email") { req, res ->
            userDao.findByEmail(req.params("email"))
        }

        post("/create") { req, res ->
            userDao.save(name = req.qp("name"), email = req.qp("email"))
            res.status(201)
            "ok"
        }

        patch("/update/:id") { req, res ->
            userDao.update(
                    id = req.params("id").toInt(),
                    name = req.qp("name"),
                    email = req.qp("email")
            )
            "ok"
        }

        delete("/delete/:id") { req, res ->
            userDao.delete(req.params("id").toInt())
            "ok"
        }

    }

}

// add "qp()" alias for "queryParams()" on Request object
fun Request.qp(key: String): String = this.queryParams(key)
