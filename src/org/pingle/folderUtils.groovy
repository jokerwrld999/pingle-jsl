package org.pingle

import java.io.File

class folderUtils {
    static def createFolder(String path) {
        def folderPath = "C:\Jenkins"

        // Create a File object representing the folder
        def folder = new File(folderPath)

        // Check if the folder already exists
        if (!folder.exists()) {
            // // If it doesn't exist, create the folder
            // if (folder.mkdirs()) {
                 echo "Folder created successfully."
            // } else {
            //     error "Failed to create the folder."
            // }
        } else {
            echo "Folder already exists."
        }
    }

    static def removeFolder(String path) {
        // Logic to remove a folder
    }

    static def cleanFolder(String path) {
        // Logic to clean up a folder
    }
}
