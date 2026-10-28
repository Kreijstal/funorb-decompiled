/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract boolean isEmpty(int guard);

    public abstract void markChanged(boolean guard);

    public abstract String validationMessage(int guard);

    public abstract ValidationState validationState(int guard);
}
