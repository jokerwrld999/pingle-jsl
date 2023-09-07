#!/usr/bin/env groovy

import org.pingle.folderUtils

def call(String srcPath, String destPath) {
    return new folderUtils(this).archiveFolder(srcPath, destPath)
}