/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract boolean hasMissingInput(int param0);

    public abstract od getValidationStatus(byte param0);

    public abstract void recordInputChange(int param0);

    public abstract String getValidationMessage(boolean param0);
}
