package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project


class SupconIt implements Plugin<Project> {
    // YdMode extension;

    void apply(Project project) {
        System.out.println("00000000000000000000000000000000000000")
      //  project.configurations.create('ydPlugins').extendsFrom(project.configurations.compile)
        EnvPlugin extension = project.getExtensions().create("ydPlugins", EnvPlugin.class);
      //  extension = project.getExtensions().create("ydPlugins", YdMode.class);
        System.out.println(extension == null)
        System.out.println(extension.pluginList == null)
        System.out.println(extension.pluginList.size())
        if (extension != null && extension.pluginList != null && extension.pluginList.size() > 0) {
            project.android.defaultConfig.manifestPlaceholders.put("hc_mobile_plugin_list", extension.pluginList.toListString())
            System.out.println("22222222222222222222222222222222222222 " + extension.pluginList.toListString());
        }
        System.out.println("22222222222222222222222222222222222222")
    }
}








