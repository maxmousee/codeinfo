package com.nfsindustries.codeinfo

import com.nfsindustries.codeinfo.utils.Parser
import com.nfsindustries.codeinfo.utils.getProductionFiles
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodeInfoApplication

//var javaLanguage: ProgrammingLanguage("Java", List.of("java"))


fun main(args: Array<String>) {
	if (args.isNotEmpty()) {
		val projectPath = args[0]
		println("Starting analyses for path: $projectPath")
		runApplication<CodeInfoApplication>(*args)
		val productionCodeFiles = getProductionFiles(projectPath, listOf("java"))
		println("Number of files containing Java Production code: ${productionCodeFiles.size}")
		for (productionFile in productionCodeFiles) {
			val fileTokens = Parser().parseFile(productionFile)
		}
		// parse files
		// do analysis
		// show info
	} else {
		println("Missing project path, nothing to analise...")
	}
}
