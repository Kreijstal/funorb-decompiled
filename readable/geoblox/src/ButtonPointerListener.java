/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ButtonPointerListener extends ButtonActivationListener {
    public abstract void onButtonPointerPressed(int parentY, int methodGuard, int parentX, int pointerX, ButtonWidget button, int pointerButton, int pointerY);

    public abstract void onButtonPointerReleased(int parentY, int pointerY, byte methodGuard, ButtonWidget button, int parentX, int pointerX);
}
