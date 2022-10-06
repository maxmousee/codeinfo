package com.nfsindustries.codeinfo.token

import java.io.File

enum class TokenType {
    IDENTIFIER,
    KEYWORD,
    SEPARATOR,
    OPERATOR,
    LITERAL,
    ANNOTATION,
    COMMENT
}

data class Location(val line: Int, val tokenIndex: Int, val sourceFile: File)

data class Token(val tokenType: TokenType, val text: String, val location: Location)