/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface RoomObjectRenderer {
    public abstract void drawProjectile(Camera param0, boolean param1, Projectile param2);

    public abstract void drawRegion(Camera param0, int param1, RoomRegion param2);

    public abstract void drawPuddle(Puddle param0, int param1, Camera param2);

    public abstract void prepareRoom(int param0, Room param1);

    public abstract void drawParticle(Camera param0, byte param1, Particle param2);
}
