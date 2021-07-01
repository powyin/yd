package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidPackerExtension {

    File archiveOutput


    String archiveNameFormat

    List<String> manifestMatcher


    boolean buildNumberAuto

    List<String> buildNumberTypeMatcher


    AndroidPackerExtension(Project project) {
        archiveOutput = new File(project.rootProject.buildDir, "archives")
    }


}
