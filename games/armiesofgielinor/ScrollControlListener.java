/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ScrollControlListener extends WidgetListener {
    public abstract void scrollAdjusted(byte obfuscationGuard, ScrollControlWidget control, int verticalPosition, int horizontalPosition);

    public abstract void scrollDragged(int horizontalPosition, int verticalPosition, byte obfuscationGuard, ScrollControlWidget control);
}
