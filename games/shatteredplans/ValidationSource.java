/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract String getMessage(byte param0);

    public abstract boolean isEmpty(int param0);

    public abstract ValidationState getState(int param0);

    public abstract void notifyChanged(int param0);
}
