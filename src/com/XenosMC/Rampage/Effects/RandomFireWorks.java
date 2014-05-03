package com.XenosMC.Rampage.Effects;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

import xfg.XenosFunGuns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFireWorks {



	
    XenosFunGuns plugin;
    public RandomFireWorks(XenosFunGuns xfg) {
            this.plugin = xfg;
    }
	// While in other classes you can now use
	// RandomFirWorks.getManager().<METHODS>();



	// Make the arraylists for the colors and types
	List<Type> types = Arrays.asList(Type.BURST, Type.BALL, Type.BALL_LARGE, Type.CREEPER, Type.STAR);



	// Getting a random firework

	public Type getRandomType() {
		int size = types.size();
		Random ran = new Random();
		Type theType = types.get(ran.nextInt(size));

		return theType;
	}

	// Getting a random COLOR!!!

	public Color getRandomColor() {
		Random r = new Random();
		return Color.fromBGR(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}

	public void launchRandomFirework(Location loc) {
		Firework fw = loc.getWorld().spawn(loc, Firework.class);
		FireworkMeta fm = fw.getFireworkMeta();
		fm.setPower(1);
		// Adding all the effects to the firework meta
		fm.addEffects(FireworkEffect.builder().with(getRandomType())
				.withColor(getRandomColor()).build());
		// set the firework meta to the firework!
		fw.setFireworkMeta(fm);
	}
}
