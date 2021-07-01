package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidPackerExtension {

    String archiveOutput
    String ydId;
    List<String> pluginsList

    AndroidPackerExtension(Project project) {
        archiveOutput = new File(project.rootProject.buildDir, "archives")
    }

}
