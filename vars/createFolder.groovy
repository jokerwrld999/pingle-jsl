#!/usr/bin/env groovy

import org.pingle.folderUtils

def call(String folderPath) {
    return new folderUtils(this).createFolder(folderPath)
}