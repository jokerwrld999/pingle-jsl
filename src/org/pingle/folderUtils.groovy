package org.pingle

import java.io.File

class folderUtils implements Serializable {
    def steps
    folderUtils(steps) {
        this.steps = steps;
    }

    def createFolder(String folderPath) {
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

    def cleanFolder(String folderPath) {
        if (steps.fileExists(folderPath)) {
            steps.bat("del /s /q \"${folderPath}\\*\"")
            steps.echo "Folder cleaned successfully."
        } else {
            steps.echo('Folder does not exist.')
        }
    }
    
    def archiveFolder(String srcPath, String destPath) {
        if (steps.fileExists(srcPath)) {
            steps.bat("powershell.exe -Command \"Compress-Archive -Path '${srcPath}' -DestinationPath '${destPath}/Archived.zip' -Force\"")
            steps.echo "Folder archived successfully."
        } else {
            steps.echo('Folder does not exist.')
        }
    }
}
