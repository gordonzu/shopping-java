
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gordonzu/src/java/web_apps/play/shopping/conf/routes
// @DATE:Sun Sep 24 18:31:34 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
