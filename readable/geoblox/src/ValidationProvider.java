/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationProvider {
    public abstract boolean isInputEmpty(int methodGuard);

    public abstract String getDebouncedValidationMessage(int methodGuard);

    public abstract void resetValidationDelay(int methodGuard);

    public abstract ValidationState getDebouncedValidationState(byte methodGuard);
}
