/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract pt getValidationStatus(boolean param0);

    public abstract void recordInputChange(byte param0);

    public abstract boolean hasMissingInput(int param0);

    public abstract String getValidationMessage(boolean param0);
}
