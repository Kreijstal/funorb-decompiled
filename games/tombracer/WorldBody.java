/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WorldBody {
    public abstract boolean isFallingIntoPit(int param0);

    public abstract boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5);

    public abstract int getPreviousY(int param0);

    public abstract int getPreviousX(int param0);

    public abstract int getX(int param0);

    public abstract Room getRoom(byte param0);

    public abstract boolean isExpired(int param0);

    public abstract boolean l(int param0);

    public abstract boolean intersectsRect(byte param0, int param1, int param2, int param3, int param4);

    public abstract int getHeight(byte param0);

    public abstract int getY(int param0);

    public abstract int getElevation(byte param0);

    public abstract boolean b(boolean param0);

    public abstract int getWeight(int param0);

    public abstract int getWidth(int param0);

    public abstract int getFacingAngle(int param0);
}
