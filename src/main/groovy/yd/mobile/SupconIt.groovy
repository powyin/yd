import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project

@CompileStatic
class SupconIt implements Plugin<Project> {

    void apply(Project project) {


        project.exec(new Closure() {
            @Override
            Object call() {
                return super.call()
            }
        })

        // project.apply from: "./plu.gradle"
        android.defaultConfig.manifestPlaceholders.put("rc_file_path", "@xml/provider_paths")

    }
}








