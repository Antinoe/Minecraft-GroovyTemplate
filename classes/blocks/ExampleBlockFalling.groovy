import net.minecraft.block.BlockFalling
import net.minecraft.block.material.Material
import net.minecraft.block.SoundType
import net.minecraft.creativetab.CreativeTabs

class ExampleBlockFalling extends BlockFalling {
	def ExampleBlockFalling(CreativeTabs tab) {
		super(Material.SAND)
		setSoundType(SoundType.SAND)
		if (tab != null) {
            setCreativeTab(tab)
        }
        setHardness(0.4F)
        setResistance(0.4F)
        setHarvestLevel("shovel", 0)
	}
}