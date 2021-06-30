package yd.mobile;



import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.logging.LogLevel;
import org.gradle.internal.impldep.com.esotericsoftware.minlog.Log;
import org.gradle.process.ExecSpec;




public class CCSupconIt implements Plugin<Project> {


    @Override
    public void apply(Project project) {

        EnvPlugin dot = project.getExtensions().create("ydPlugins", EnvPlugin.class);


        Plugin android = project.getPlugins().findPlugin("com.android.application");





        System.out.println("--------------------"+android);


        //   manifestreplace

//        project.exec(new Action<ExecSpec>() {
//            @Override
//            public void execute(ExecSpec execSpec) {
//                execSpec.
//            }
//        })





        System.out.println(dot.officePlugin == null);
//        for (String item : dot.officePlugin){
//            System.out.println("-------------------"+item);
//        }





//        project.beforeEvaluate(new Action<Project>() {
//            @Override
//            public void execute(Project project) {
//
//            }
//        });


        // Log.debug("CCCCCCCCXXXXXXXXXXXXXCCCCCCCCCCCCCCCCCCC");
       // Log.debug(target ,"iame here")


       //  project.get

        System.out.println("CCCCCCCCXXXXXXXXXXXXXCCCCCCCCCCCCCCCCCCC");


    }
}




