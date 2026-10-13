/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract void validationChanged(int obfuscationGuard);

    public abstract boolean isInputEmpty(int obfuscationGuard);

    public abstract ValidationState getValidationState(boolean obfuscationGuard);

    public abstract String getValidationMessage(byte obfuscationGuard);
}
