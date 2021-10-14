package com.github.jackorosa.intellijplugins.services

import com.intellij.openapi.project.Project
import com.github.jackorosa.intellijplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
