/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetPointerListener extends WidgetActionListener {
    public abstract void onPointerPressed(int pointerX, int button, int parentX, InteractiveWidget source, int pointerY, int parentY, boolean guard);

    public abstract void onPointerReleased(int parentY, int parentX, int pointerY, int pointerX, InteractiveWidget source, int guard);
}
