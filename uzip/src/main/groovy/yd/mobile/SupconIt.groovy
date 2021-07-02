package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException


class SupconIt implements Plugin<Project> {
    static final String PLUGIN_NAME = "yd"
    Project project
    AndroidPackerExtension packerExt

    @Override
    void apply(Project project) {
        if(!project.plugins.hasPlugin("com.android.application")){
            throw new ProjectConfigurationException("the android plugin must be applied", null)
        }
        this.project = project
        applyExtension();
        project.afterEvaluate {
            if (packerExt != null && packerExt.pluginsList != null && packerExt.pluginsList.size() > 0) {
                project.android.defaultConfig.manifestPlaceholders.put("hc_mobile_plugin_list", packerExt.pluginsList.toListString())
                System.out.println(packerExt.pluginsList.toListString())
            }
            project.android.buildTypes.each {
                it.resValue("string", "hc_mobile_plugin_list", packerExt.pluginsList.toListString())
            }
            if (!project.android.defaultConfig.manifestPlaceholders.containsKey("hc_origin_def")) {
                project.android.defaultConfig.manifestPlaceholders.put("hc_origin_def", "portrait")
            }
        }
    }

    void applyExtension() {
        project.configurations.create(PLUGIN_NAME).extendsFrom(project.configurations.compile)
        this.packerExt = project.extensions.create(PLUGIN_NAME, AndroidPackerExtension, project)
    }
}








