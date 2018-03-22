
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/Desktop/lab6/conf/routes
// @DATE:Thu Mar 22 16:24:33 GMT 2018


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
