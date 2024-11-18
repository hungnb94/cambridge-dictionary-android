package com.leoh.dictionnary

import org.jsoup.Jsoup

class Dictionary {
	fun get(word: String) {
		val document = Jsoup.connect("https://dictionary.cambridge.org/dictionary/english/$word").get()
		val body = document.getElementsByClass("entry-body__el")
		body.forEach {
			println("text: ${it.text()}")
		}
	}
}
