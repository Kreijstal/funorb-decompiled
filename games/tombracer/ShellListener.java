/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ShellListener {
    public abstract void drawOverlay(int param0);

    public abstract boolean isModal(int param0);

    public abstract void updateScreen(boolean param0, boolean param1);

    public abstract boolean handleKey(byte param0, char param1, int param2);
}
