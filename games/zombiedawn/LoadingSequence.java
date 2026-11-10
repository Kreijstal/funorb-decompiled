/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface LoadingSequence {
    public abstract void bindArchives(int param0);

    public abstract boolean pollReady(byte param0);

    public abstract void buildAssets(int param0);

    public abstract boolean pollArchives(boolean param0);
}
