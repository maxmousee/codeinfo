package com.nfsindustries.codeinfo.graph

import com.nfsindustries.codeinfo.token.Token

data class Unit(val name: String, val tokenList: List<Token>) {

    fun getStartLine() : Int {
        return tokenList.first().location.line
    }

    fun getEndLine() : Int {
        return tokenList.last().location.line
    }

    fun getNumberOfLines() : Int {
        return getEndLine() - getStartLine()
    }
}