/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract int contentWidth(UiComponent component, int guard);

    public abstract int lineHeight(int guard);

    public abstract int characterIndexAtPosition(int originX, int originY, int pointerY, int pointerX, int guard, UiComponent component);

    public abstract int preferredHeight(int guard, UiComponent component);

    public abstract TextLayout ensureTextLayout(UiComponent component, int guard);

    public abstract int textOriginY(UiComponent component, int originY, int guard);

    public abstract int textOriginX(byte guard, UiComponent component, int originX);

    public abstract int preferredWidth(byte guard, UiComponent component);

    public abstract void drawSelection(int originX, int selectionStart, UiComponent component, int selectionEnd, int guard, int originY);

    public abstract void drawCaret(UiComponent component, int characterIndex, int originX, int originY, boolean guard);
}
