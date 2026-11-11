/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Camera {
    public abstract void update(byte param0);

    public abstract void clampToBounds(boolean param0);

    public abstract void nudge(int param0, int param1, int param2, int param3);

    public abstract void setBounds(int param0, byte param1, int param2, int param3, int param4);
}
