package tartarugacraft.tutorialmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemFireStaff extends Item{

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) 
		{
			ItemStack item = player.getHeldItem(handIn);
			Vec3d look = player.getLookVec();
			EntityLargeFireball fireball = new EntityLargeFireball(world, player, 1, 1, 1);
			fireball.setPosition(player.posX + look.x * 1.5D, player.posY + look.y * 1.5D + 1.5f, player.posZ + look.z * 1.5D);
			fireball.accelerationX = look.x * 0.1f;
			fireball.accelerationY = look.y * 0.1f;
			fireball.accelerationZ = look.z * 0.1f;
			world.spawnEntity(fireball);
			
			item.damageItem(1, player);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
			
		}
}
