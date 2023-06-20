
//	Will work on this later.
/*println("Start Creative Tab Initiation.")

def creativeTab = content.createCreativeTab("groovy.creative_tab", new ItemStack(Apple))
content.setDefaultCreativeTab(creativeTab)

println("End Creative Tab Initiation.")*/

println("Start Items Registration.")

//	This is the simple way.
//content.createItem("example_item").register();
//	This is for when you want to customize your item.
content.registerItem("example_item", new ExampleItem())

println("End Items Registration.")
