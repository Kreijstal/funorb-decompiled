/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface RenderListener {
    public abstract void onClear(int param0);

    public abstract void afterScene(int param0, iq param1);

    public abstract void beforeLayer(int param0, RenderLayer param1, iq param2, int param3);

    public abstract void afterLayer(RenderLayer param0, int param1, iq param2, boolean param3);

    public abstract void beforeScene(iq param0, int param1);

    public abstract void beforeRenderable(int param0, Renderable param1, iq param2);

    public abstract void afterRenderable(boolean param0, Renderable param1, iq param2);
}
