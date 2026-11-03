/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface OverlayLayer {
    public abstract void paint(int param0);

    public abstract void update(int param0, boolean param1);

    public abstract boolean capturesInput(byte param0);

    public abstract boolean handleKeyTyped(int param0, int param1, char param2);
}
