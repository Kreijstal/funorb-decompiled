/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract cg getValidationStatus(int param0);

    public abstract boolean hasMissingInput(byte param0);

    public abstract void recordInputChange(int param0);

    public abstract String getValidationMessage(int param0);
}
