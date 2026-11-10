/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface SelectivelyLitRenderable extends Renderable {
    public abstract boolean ignoresLight(boolean param0, LightSource param1);

    public abstract boolean isUnlit(boolean param0);
}
