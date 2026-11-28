/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract void recordInputChange(byte param0);

    public abstract im getValidationStatus(int param0);

    public abstract String getValidationMessage(byte param0);

    public abstract boolean hasMissingInput(byte param0);
}
