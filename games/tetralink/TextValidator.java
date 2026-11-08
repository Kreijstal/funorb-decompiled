/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextValidator {
    public abstract ValidationState getValidationState(int param0);

    public abstract String getValidationMessage(byte param0);

    public abstract boolean isEmpty(int param0);

    public abstract void restartDebounce(int param0);
}
