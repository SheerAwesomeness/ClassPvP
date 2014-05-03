package com.XenosMC.Rampage.Effects;

import java.util.List;

import net.minecraft.server.v1_7_R3.AxisAlignedBB;
import net.minecraft.server.v1_7_R3.Entity;
import net.minecraft.server.v1_7_R3.EntityLightning;
import net.minecraft.server.v1_7_R3.NBTTagCompound;
import net.minecraft.server.v1_7_R3.World;

public class CustomEntityLightning extends EntityLightning{


    private int lifeTicks;
    public long a;
    private int c;

    public CustomEntityLightning(World world, double d0, double d1, double d2) {
        super(world, d2, d2, d2);
        this.setPositionRotation(d0, d1, d2, 0.0F, 0.0F);
        this.lifeTicks = 2;
        this.a = this.random.nextLong();
        this.c = this.random.nextInt(3) + 1;
    }

    @SuppressWarnings("rawtypes")
    public void h() {
        super.h();

        --this.lifeTicks;
        if (this.lifeTicks < 0) {
            if (this.c == 0) {
                this.die();
            } else if (this.lifeTicks < -this.random.nextInt(10)) {
                --this.c;
                this.lifeTicks = 1;
                this.a = this.random.nextLong();
            }
        }

        if (this.lifeTicks >= 0) {
            if (this.world.isStatic) {
                this.world.q = 2;
            } else {
                double d0 = 3.0D;
                List list = this.world.getEntities(this, AxisAlignedBB.a(this.locX - d0, this.locY - d0, this.locZ - d0, this.locX + d0, this.locY + 6.0D + d0, this.locZ + d0));

                for (int l = 0; l < list.size(); ++l) {
                    Entity entity = (Entity) list.get(l);

                    entity.a(this, G);
                }
            }
        }
    }

    protected void c() {}

    protected void a(NBTTagCompound nbttagcompound) {}

    protected void b(NBTTagCompound nbttagcompound) {}
}
