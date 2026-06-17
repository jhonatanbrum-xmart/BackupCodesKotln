fun exercise7() {
    var mutableListCreatedForMe = mutableSetOf<String>()
    mutableListCreatedForMe.add("Mutable")
    mutableListCreatedForMe.add("List")
    mutableListCreatedForMe.add("Created for me")
    mutableListCreatedForMe.remove("Created for me")
    println(mutableListCreatedForMe)
}