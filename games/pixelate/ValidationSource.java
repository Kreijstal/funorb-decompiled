/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract ValidationState getState(byte param0);

    public abstract boolean isInputEmpty(int param0);

    public abstract void markEdited(int param0);

    public abstract String getMessage(byte param0);
}
