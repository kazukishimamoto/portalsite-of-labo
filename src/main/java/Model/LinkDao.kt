package Model

import java.util.concurrent.atomic.AtomicInteger

class LinkDao {
    val links = hashMapOf(
            0 to Link(0, "いらっしゃい", "https://sites.google.com/view/fukumi-lab/fukumis-home", 1, "学会リンクなどが載ってます．"),
//            1 to Link(1, "実験予定表", "https://docs.google.com/spreadsheets/d/1BsVyCpxU71IeF6bYF8b2qUadaqdDpfjBMaOGGyY6xMw/edit#gid=0", 2, "予定表．"),
            1 to Link(1, "実験予定表", "#", 2, "予定表．"),
            2 to Link(2, "Github", "https://github.com/", 5, "バージョン管理ツール"),
            3 to Link(3, "福見班テスト", "#", 1, "fukumi-test"),
            4 to Link(4, "桃代班テスト", "#", 2, "momoyo-test"),
            5 to Link(5, "伸一テスト", "#", 3, "shin-ichi-test"),
            6 to Link(6, "国際学会情報", "#", 4, "kokusai-test"),
            7 to Link(7, "その他テスト", "#", 5, "sonota-test")
    )

    val lastId: AtomicInteger = AtomicInteger(links.size - 1)

    fun findById(id: Int): Link? {
        return links[id]
    }

    fun findByAllTag(tag: Int): Link? {
        return links.values.find { it.tag == tag }
    }

    fun save(name: String, url: String, tag: Int, description: String) {
        val id = lastId.incrementAndGet()
        links.put(id, Link(id = id, name = name, url = url, tag = tag, description = description))
    }

//    fun findByEmail(email: String): Link? {
//        return links.values.find { it.email == email }
//    }

    fun update(id: Int, name: String, url: String, tag: Int, description: String) {
        links.put(id, Link(id = id, name = name, url = url, tag = tag, description = description))
    }

    fun delete(id: Int) {
        links.remove(id)
    }
}
