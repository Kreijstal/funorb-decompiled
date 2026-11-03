/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract String getValidationMessage(int param0);

    public abstract ValidationState getValidationState(int param0);

    public abstract boolean isInputEmpty(byte param0);

    public abstract void validationChanged(int param0);
}
