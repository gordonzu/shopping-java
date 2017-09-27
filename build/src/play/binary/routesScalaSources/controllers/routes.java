
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gordonzu/src/java/web_apps/play/shopping/conf/routes
// @DATE:Sun Sep 24 18:31:34 EDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseItems Items = new controllers.ReverseItems(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseItems Items = new controllers.javascript.ReverseItems(RoutesPrefix.byNamePrefix());
  }

}
