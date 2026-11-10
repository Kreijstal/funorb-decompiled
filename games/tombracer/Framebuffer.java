/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Framebuffer {
    public abstract void unbindDrawFramebuffer(byte param0);

    public abstract void bindDrawFramebuffer(byte param0);

    public abstract void bindReadFramebuffer(byte param0);

    public abstract void unbindFramebuffer(int param0);

    public abstract void unbindReadFramebuffer(byte param0);

    public abstract void b(int param0);
}
