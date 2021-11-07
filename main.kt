class Block(val color: String) {
    object BlockProperties {
        var length = 4
        var width = 6
        fun blocksInBox(l1: Int, w1: Int): Int{
            return (w1 / width) * (l1 / length)
        }
    }
}
