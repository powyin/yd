package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project


class SupconIt implements Plugin<Project> {
    // YdMode extension;
    static final String PLUGIN_NAME = "yd"
    Project project
    Properties props
    AndroidPackerExtension packerExt

    @Override
    void apply(Project project) {

        this.project = project

        System.out.println("00000000000000000000000000000000000000")
//      //  project.configurations.create('ydPlugins').extendsFrom(project.configurations.compile)
//        EnvPlugin extension = project.getExtensions().create(ydPlugins, EnvPlugin);
//      //  extension = project.getExtensions().create("ydPlugins", YdMode.class);
//        System.out.println(extension == null)
//        System.out.println(extension.pluginList == null)
//        System.out.println(extension.pluginList.size())
//        if (extension != null && extension.pluginList != null && extension.pluginList.size() > 0) {
//            project.android.defaultConfig.manifestPlaceholders.put("hc_mobile_plugin_list", extension.pluginList.toListString())
//            System.out.println("22222222222222222222222222222222222222 " + extension.pluginList.toListString());
//        }

        applyExtension();

        project.afterEvaluate {
            def buildTypes = project.android.buildTypes
            System.out.println(buildTypes)

            if (packerExt != null && packerExt.pluginsList != null && packerExt.pluginsList.size() > 0) {
                project.android.defaultConfig.manifestPlaceholders.put("hc_mobile_plugin_list", packerExt.pluginsList.toListString())
            }

            System.out.println(":::::::::::::::::::::::::::::::" + packerExt.pluginsList.toListString())
            System.out.println(":::::::::::::::::::::::::::::::" + packerExt.ydId)

        }


        System.out.println("22222222222222222222222222222222222222")
    }


    void applyExtension() {
        // setup plugin and extension
        project.configurations.create(PLUGIN_NAME).extendsFrom(project.configurations.compile)
        this.packerExt = project.extensions.create(PLUGIN_NAME, AndroidPackerExtension, project)

        System.out.println(":::::::::::::::::::::::::::::::" + packerExt.pluginsList)
        System.out.println(":::::::::::::::::::::::::::::::" + packerExt.ydId)
    }
}








