package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    println("${doc.title()}\n")

    val article = doc.select(".sc-2aegk7-2")

    // Перебираем каждую цитату
    for (citation: Element in article) {
        // Выводим только текст цитаты
        println("${citation.text()})\n\t")
    }
}
