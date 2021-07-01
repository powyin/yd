package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project


class SupconIt implements Plugin<Project> {
    YdMode extension;

    void apply(Project project) {
        System.out.println("00000000000000000000000000000000000000")
        extension = project.extensions.create("yd", YdMode);
        if (extension != null && extension.pluginList != null && extension.pluginList.size() > 0) {
            project.android.defaultConfig.manifestPlaceholders.put("hc_mobile_plugin_list", extension.pluginList.toListString())
            System.out.println(project.android.buildTypes);
        }
        System.out.println("22222222222222222222222222222222222222")
    }
}








