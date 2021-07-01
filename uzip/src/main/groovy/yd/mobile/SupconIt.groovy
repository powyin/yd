package yd.mobile;

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project


class SupconIt implements Plugin<Project> {
    static final String PLUGIN_NAME = "yd"
    Project project
    AndroidPackerExtension packerExt

    @Override
    void apply(Project project) {
        this.project = project
        applyExtension();
        project.afterEvaluate {
            if (packerExt != null && packerExt.pluginsList != null && packerExt.pluginsList.size() > 0) {
                project.android.defaultConfig.manifestPlaceholders.put("hc_mobile_plugin_list", packerExt.pluginsList.toListString())
            }
        }
    }

    void applyExtension() {
        // setup plugin and extension
        project.configurations.create(PLUGIN_NAME).extendsFrom(project.configurations.compile)
        this.packerExt = project.extensions.create(PLUGIN_NAME, AndroidPackerExtension, project)
    }
}








