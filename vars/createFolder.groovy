#!/usr/bin/env groovy

import org.pingle.folderUtils

def call(String folderPath) {
    folderUtils.createFolder(folderPath)
}