// !DUMP_CFG

val x4: (String) -> Unit = run {
    return@run (lambda@{ foo ->
        bar(foo)
    })
}

fun bar(s: String) {}
fun <R> run(block: () -> R): R = block()
