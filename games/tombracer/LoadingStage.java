/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface LoadingStage {
    public abstract boolean isReadyToStart(int param0);

    public abstract void finishLoading(byte param0);

    public abstract boolean loadStep(int param0);

    public abstract void openArchives(byte param0);
}
