package com.geno1024.utils.argparser

object ArgParser
{
    // https://stackoverflow.com/a/54027443/9035237
    fun parse(args: Array<String>) = args.fold(Pair(emptyMap<String, List<String>>(), "")) { (map, lastKey), elem ->
        if (elem.startsWith("-"))
            Pair(map + (elem to emptyList()), elem)
        else
            Pair(map + (lastKey to map.getOrElse(lastKey) { emptyList() } + elem), lastKey)
    }.first
}
