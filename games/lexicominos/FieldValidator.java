/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract void recordInputChange(boolean param0);

    public abstract boolean hasMissingInput(int param0);

    public abstract String getValidationMessage(byte param0);

    public abstract sc getValidationStatus(byte param0);
}
