package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.BodyParser;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;

class CreateItem {
    public String name;
    public Double price;
}  

public class Items extends Controller {

    static Shop shop = new ShopImpl();

    public Result list() {
        return ok(Json.toJson(shop.list()));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result create() {
        JsonNode json = request().body().asJson();
        CreateItem createItem;
        try {
            createItem = Json.fromJson(json, CreateItem.class);
        } catch(RuntimeException e) {
            return badRequest();
        }  
        Item item = shop.create(createItem.name, createItem.price);
        if (item != null) {
            return ok(Json.toJson(item));
        } else {  
              return internalServerError();
        }  
    }

    public Result details(Long id) {
        Item item = shop.get(id);
        if (item != null) {
            return ok(Json.toJson(item));
        } else {
            return notFound();  
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result update(Long id) {
        JsonNode json = request().body().asJson();
        CreateItem createItem;
        try {
            createItem = Json.fromJson(json, CreateItem.class);
        } catch(RuntimeException e) {
            return badRequest();
        }
        Item item = shop.update(id, createItem.name, createItem.price);
        if (item != null) {
            return ok(Json.toJson(item));
        } else {
              return internalServerError();
        }      
    }

    public Result delete(Long id) {
        if (shop.delete(id)) {
            return ok();
        } else {
              return badRequest();
        }      
    }
}
