#!/usr/bin/env groovy

import org.pingle.folderUtils

def call(Map config = [:]) {
    return new folderUtils(this).archiveFolder("${config.srcPath}","${config.destPath}")
}