/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Renderable {
    public abstract int getRenderZ(byte param0);

    public abstract int getRenderY(byte param0);

    public abstract void render(int param0, Camera param1);

    public abstract int getRenderX(byte param0);

    public abstract boolean isRenderExpired(byte param0);

    public abstract void updateAnimation(int param0);
}
