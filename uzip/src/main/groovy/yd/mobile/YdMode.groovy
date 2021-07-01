package yd.mobile;
import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project


class YdMode {



    /**
     *  manifest meta-data key list
     */
    List<String> pluginList

    /**
     * support build number auto increment
     *
     * store in file: packer.properties
     */
    boolean buildNumberAuto
    /**
     *  auto build number build type list
     */
    List<String> buildNumberTypeMatcher




}








