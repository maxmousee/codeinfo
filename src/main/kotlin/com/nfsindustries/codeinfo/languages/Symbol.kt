package com.nfsindustries.codeinfo.languages

import com.nfsindustries.codeinfo.token.TokenType

//TODO check text type
data class Symbol(val tokenType: TokenType, val text: String)

val brackets = listOf("(", ")", "{", "}", "[", "]")

val separators = listOf(",", ";")

//val brackets = bracketList.windowed(2, 2).map { Pair(it[0], it[1]) }