import com.mchange.v2.c3p0.ComboPooledDataSource
import dev.kaskaz.golftour.controllers.{ApiRoutes, CoursesController}
import javax.servlet.ServletContext
import slick.jdbc.H2Profile.api._
import org.scalatra._
import org.slf4j.LoggerFactory

class ScalatraBootstrap extends LifeCycle  {

  protected implicit def executor = scala.concurrent.ExecutionContext.Implicits.global

  val logger = LoggerFactory.getLogger(getClass)

  val cpds = new ComboPooledDataSource
  logger.info("Created c3p0 connection pool")

  override def init(context: ServletContext) {
    val db = Database.forDataSource(cpds, None)
    context.mount(new CoursesController, ApiRoutes.COURSES_BASE)
  }

  override def destroy(context: ServletContext) {
    super.destroy(context)
    cpds close
  }

}
