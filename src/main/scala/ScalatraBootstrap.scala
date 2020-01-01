import dev.kaskaz.golftour.controllers.{ApiRoutes, CoursesController}
import javax.servlet.ServletContext
import org.scalatra._

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new CoursesController, ApiRoutes.COURSES_BASE)
  }
}
