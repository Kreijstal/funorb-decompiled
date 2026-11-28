/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract boolean hasMissingInput(byte param0);

    public abstract bm getValidationStatus(int param0);

    public abstract void recordInputChange(boolean param0);

    public abstract String getValidationMessage(int param0);
}
