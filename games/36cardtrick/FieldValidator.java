/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract String getValidationMessage(int param0);

    public abstract void recordInputChange(int param0);

    public abstract sg getValidationStatus(boolean param0);

    public abstract boolean hasMissingInput(byte param0);
}
