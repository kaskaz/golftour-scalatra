import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

object ServerLauncher {
  def main(args: Array[String]): Unit = {
    val port = if(System.getProperty("http.port") != null) System.getProperty("http.port").toInt else 8080
    val server = new Server(port)
    val context = new WebAppContext()
    context.setContextPath("/")
    context.setResourceBase("src/main/webapp")
    context.setInitParameter(ScalatraListener.LifeCycleKey, "ScalatraBootstrap")

    server.setHandler(context)
    server.start()
    server.join()
  }
}
