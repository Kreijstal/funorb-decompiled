/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetPointerListener extends WidgetActionListener {
    public abstract void onPointerPress(int parentX, int button, FocusableWidget widget, int pointerY, int pointerX, int parentY, int obfuscationGuard);

    public abstract void onPointerRelease(byte obfuscationGuard, int parentY, int pointerY, FocusableWidget widget, int parentX, int pointerX);
}
