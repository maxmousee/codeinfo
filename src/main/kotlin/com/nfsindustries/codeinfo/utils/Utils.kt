package com.nfsindustries.codeinfo.utils

import java.io.File

fun getProductionFiles(projectRootPath: String, fileExtensions: List<String>): List<File> {
    return File(projectRootPath).walk()
        .filter { file -> file.isFile }
        .filter { file -> fileExtensions.contains(file.extension) }
        .filter { file -> !file.absolutePath.contains("/test/") }
        .toList()
}

// TODO
fun getTestFiles(projectRootPath: String, fileExtensions: List<String>): List<File> {
    return emptyList()
}

