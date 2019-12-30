import com.example.app._
import dev.kaskaz.golftour.controllers.{ApiRoutes, CoursesController}
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new CoursesController, ApiRoutes.COURSES_BASE)
  }
}
