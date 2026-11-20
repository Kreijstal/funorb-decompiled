/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface InputValidator {
    public abstract boolean isEmpty(byte param0);

    public abstract void markChanged(int param0);

    public abstract String getValidationMessage(byte param0);

    public abstract ValidationState getValidationState(byte param0);
}
