rootProject.name = "food_reserve_system"

include("menu")
include("order")
include("user")

project(":menu").projectDir = File("menu")
project(":order").projectDir = File("order")
project(":user").projectDir = File("user")