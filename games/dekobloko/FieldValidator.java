/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface FieldValidator {
    public abstract String getValidationMessage(byte byteArgument1);

    public abstract ValidationStatus getValidationStatus(int integerArgument1);

    public abstract void recordInputChange(byte byteArgument1);

    public abstract boolean hasMissingInput(byte byteArgument1);
}
