/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Collidable {
    public abstract boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5);

    public abstract boolean interceptsBeam(int param0, WorldBody param1, int param2, BeamSegment param3);

    public abstract boolean overlapsBox(int param0, WorldBody param1, int param2, int param3, int param4, Collidable param5, int param6, int param7);

    public abstract boolean crush(int param0, WorldBody param1);

    public abstract int getCollisionId(boolean param0);

    public abstract int getWidth(int param0);

    public abstract int applyAreaEffect(Effect param0, int param1, int param2, int param3, int param4, int param5);

    public abstract boolean canBeCrushedBy(WorldBody param0, int param1);

    public abstract int getX(int param0);

    public abstract boolean restsOnFloor(int param0);

    public abstract int applyProjectileEffect(Effect param0, Projectile param1, int param2);

    public abstract int getSurfaceCoverage(boolean param0, int param1, int param2, int param3, int param4, int param5);

    public abstract int getHeight(byte param0);

    public abstract int applyBeamEffect(Effect param0, int param1, BeamSegment param2);

    public abstract int getWeight(int param0);

    public abstract int getY(int param0);

    public abstract boolean isPushable(byte param0, boolean param1);
}
