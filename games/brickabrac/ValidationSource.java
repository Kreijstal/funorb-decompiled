/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract String getValidationMessage(int obfuscationGuard);

    public abstract ValidationStatus getValidationStatus(byte obfuscationGuard);

    public abstract boolean isIncomplete(byte obfuscationGuard);

    public abstract void markEdited(boolean obfuscationGuard);
}
