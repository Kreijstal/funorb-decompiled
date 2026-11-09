/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface InputValidator {
    public abstract String getMessage(int guard);

    public abstract ValidationStatus getStatus(int guard);

    public abstract boolean isEmpty(int guard);

    public abstract void markChanged(byte guard);
}
