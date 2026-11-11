/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface PlayerAnimator extends Renderable {
    public abstract void drawPortrait(int param0, int param1, int param2, int param3, int param4);

    public abstract void drawIcon(int param0, int param1, int param2);

    public abstract void setAnimationState(int param0, int param1, boolean param2);

    public abstract void setCharacter(int param0, int param1);

    public abstract void setRoom(int param0, Room param1);

    public abstract boolean isAnimationFinished(byte param0);

    public abstract void drawShadow(int param0, byte param1, int param2, int param3, int param4);

    public abstract void render(int param0, Camera param1);

    public abstract void tick(int param0);
}
