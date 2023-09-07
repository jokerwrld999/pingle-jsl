package org.pingle

import java.io.File

class folderUtils implements Serializable {
    def steps
    folderUtils(steps) {
        this.steps = steps;
    }

    def createFolder(String folderPath) {
        // Check if the folder already exists
        if (!steps.fileExists(folderPath)) {
            steps.bat("mkdir ${folderPath}")
            steps.echo "Folder created successfully.";
        } else {
            steps.echo('Folder already exists.');
        }
    }

    def removeFolder(String folderPath) {
        if (steps.fileExists(folderPath)) {
            steps.bat("rmdir /s /q ${folderPath}")
            steps.echo "Folder removed successfully.";
        } else {
            steps.echo('Folder already removed.');
        }
    }

    def cleanFolder(String path) {
        // Logic to clean up a folder
    }
}
