/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract void recordInputChange(byte param0);

    public abstract boolean hasMissingInput(boolean param0);

    public abstract na getValidationStatus(boolean param0);

    public abstract String getValidationMessage(byte param0);
}
