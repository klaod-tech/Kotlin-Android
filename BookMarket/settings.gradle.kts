pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BookMarket"
include(":app")

include(":CodeExample:Variable", ":CodeExample:DataType", ":CodeExample:Operator", ":CodeExample:IfControl", ":CodeExample:WhenControl", ":CodeExample:LoopControl", ":CodeExample:Function", ":CodeExample:Collection", ":CodeExample:OOP", ":CodeExample:ScopeFunction")
project(":CodeExample").projectDir = file("../CodeExample")
project(":CodeExample:Variable").projectDir = file("../CodeExample/Variable/app")
project(":CodeExample:DataType").projectDir = file("../CodeExample/DataType/app")
project(":CodeExample:Operator").projectDir = file("../CodeExample/Operator/app")
project(":CodeExample:IfControl").projectDir = file("../CodeExample/IfControl/app")
project(":CodeExample:WhenControl").projectDir = file("../CodeExample/WhenControl/app")
project(":CodeExample:LoopControl").projectDir = file("../CodeExample/LoopControl/app")
project(":CodeExample:Function").projectDir = file("../CodeExample/Function/app")
project(":CodeExample:Collection").projectDir = file("../CodeExample/Collection/app")
project(":CodeExample:OOP").projectDir = file("../CodeExample/OOP/app")
project(":CodeExample:ScopeFunction").projectDir = file("../CodeExample/ScopeFunction/app")

include(":TableLayoutProject")
project(":TableLayoutProject").projectDir = file("../TableLayoutProject/app")
