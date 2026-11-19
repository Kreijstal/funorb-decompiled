/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Validator {
    public abstract void invalidate(int param0);

    public abstract String getValidationMessage(byte param0);

    public abstract boolean isEmpty(byte param0);

    public abstract ValidationState getValidationState(int param0);
}
