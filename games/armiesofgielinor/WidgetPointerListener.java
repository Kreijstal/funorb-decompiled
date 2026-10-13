/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetPointerListener extends WidgetActivationListener {
    public abstract void pointerReleased(int obfuscationGuard, int pointerY, InteractiveWidget widget, int originX, int originY, int pointerX);

    public abstract void pointerPressed(InteractiveWidget widget, int originY, int originX, int pointerX, int pointerY, int button, byte obfuscationGuard);
}
