/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract boolean hasMissingInput(byte param0);

    public abstract String getValidationMessage(byte param0);

    public abstract void recordInputChange(int param0);

    public abstract jg getValidationStatus(int param0);
}
