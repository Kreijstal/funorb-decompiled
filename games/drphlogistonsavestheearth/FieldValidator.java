/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract vh getValidationStatus(int param0);

    public abstract String getValidationMessage(int param0);

    public abstract boolean hasMissingInput(boolean param0);

    public abstract void recordInputChange(byte param0);
}
