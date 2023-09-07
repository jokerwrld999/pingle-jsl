#!/usr/bin/env groovy

import org.pingle.folderUtils

def call() {
    return new folderUtils(this).createFolder()
}