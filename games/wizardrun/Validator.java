/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Validator {
    public abstract ValidationState getState(boolean param0);

    public abstract boolean isEmpty(int param0);

    public abstract String getMessage(int param0);

    public abstract void invalidate(byte param0);
}
