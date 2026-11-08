/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ValidationSource {
    public abstract void markChanged(int param0);

    public abstract boolean isEmpty(boolean param0);

    public abstract String validationMessage(boolean param0);

    public abstract TransitionTimerHelpers validationState(byte param0);
}
