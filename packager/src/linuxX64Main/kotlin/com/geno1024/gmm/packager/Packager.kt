package com.geno1024.gmm.packager

import com.geno1024.utils.argparser.ArgParser

object Packager
{
    fun help()
    {
        println("Usage: ")
    }

    fun version()
    {
        println("GMM Packager v0.1 build 0")
    }

    fun main(args: Array<String>)
    {
        val options = ArgParser.parse(args)
        when
        {
            options.containsKey("-h") or options.containsKey("--help") -> help()
            options.containsKey("-v") or options.containsKey("--version") -> version()
        }
    }
}

fun main(args: Array<String>) = Packager.main(args)
