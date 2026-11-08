/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationProvider {
    public abstract String getDebouncedValidationMessage(int param0);

    public abstract void resetValidationDelay(int param0);

    public abstract IntegerSyntaxSupport getDebouncedValidationState(int param0);

    public abstract boolean isInputEmpty(int param0);
}
