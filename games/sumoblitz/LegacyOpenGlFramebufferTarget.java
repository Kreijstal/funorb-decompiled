/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface LegacyOpenGlFramebufferTarget {
    public abstract void bindReadFramebuffer(int guard);

    public abstract void unbindFramebuffer(int guard);

    public abstract void bindDrawFramebuffer(int guard);

    public abstract void unbindDrawFramebuffer(boolean guard);

    public abstract void bindFramebuffer(int guard);

    public abstract void unbindReadFramebuffer(int guard);
}
