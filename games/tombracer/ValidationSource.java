/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract void markEdited(int param0);

    public abstract ValidationState getState(int param0);

    public abstract boolean isEmpty(boolean param0);

    public abstract String getMessage(int param0);
}
