/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationProvider {
    public abstract boolean isEmpty(byte param0);

    public abstract ValidationState getValidationState(int param0);

    public abstract String getValidationMessage(int param0);

    public abstract void restartDebounce(int param0);
}
