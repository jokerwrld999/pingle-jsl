package org.pingle

import java.io.File

class folderUtils implements Serializable {
    def steps
    folderUtils(steps) {
        this.steps = steps;
    }

    def createFolder(String folderPath) {
        // Create a File object representing the folder
        File f = new File("C:/Jenkins/Saved/UnrealBuildTool/");

        // Check if the folder already exists
        if (!f.exists()) {
            //steps.bat("mkdir ${folderPath}")
            steps.echo "Folder created successfully.";
        } else {
            steps.echo('Folder already exists.');
        }
    }

    def removeFolder(String path) {
        // Logic to remove a folder
    }

    def cleanFolder(String path) {
        // Logic to clean up a folder
    }
}
