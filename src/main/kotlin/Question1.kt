data class Order(val orderId: String, val productNames: List<String>, val quantity: Map<String, Int>)

fun suggestPackagingOptimization(orders: List<Order>): Map<String, String> {
    val optimizationResults = mutableMapOf<String, String>()

    for (order in orders) {
        val orderId = order.orderId
        val productNames = order.productNames
        val quantity = order.quantity

        // AI logic for packaging optimization (dummy logic for illustration)
        val packagingStrategy = optimizePackaging(productNames, quantity)

        optimizationResults[orderId] = packagingStrategy
    }

    return optimizationResults
}

fun optimizePackaging(productNames: List<String>, quantity: Map<String, Int>): String {
    // Dummy logic for illustration, you can replace this with your actual AI-based logic
    // This logic just suggests 'Standard' if there are less than 5 products, otherwise 'Custom'
    return if (productNames.size < 5) {
        "Standard Packaging"
    } else {
        "Custom Packaging"
    }
}

fun main() {
    val orders = listOf(
        Order("1", listOf("ProductA", "ProductB"), mapOf("ProductA" to 3, "ProductB" to 2)),
        Order("2", listOf("ProductC", "ProductD", "ProductE"), mapOf("ProductC" to 1, "ProductD" to 4, "ProductE" to 2))
        // Add more orders as needed
    )

    val packagingSuggestions = suggestPackagingOptimization(orders)

    println("Packaging Suggestions:")
    for ((orderId, suggestion) in packagingSuggestions) {
        println("Order ID $orderId: $suggestion")
    }
}
