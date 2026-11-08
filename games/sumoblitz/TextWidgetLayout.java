/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetLayout {
    public abstract int textOriginX(int parentX, UiWidget widget, int guard);

    public abstract int measuredTextHeight(UiWidget widget, byte guard);

    public abstract void drawSelection(int parentX, int anchor, int guard, int caretIndex, UiWidget widget, int parentY);

    public abstract int characterAtPoint(int parentX, UiWidget widget, int pointerX, int pointerY, int guard, int parentY);

    public abstract int textOriginY(int parentY, UiWidget widget, int guard);

    public abstract int measuredTextWidth(UiWidget widget, byte guard);

    public abstract int contentWidth(int guard, UiWidget widget);

    public abstract TextLayout layoutText(int guard, UiWidget widget);

    public abstract int lineHeight(int guard);

    public abstract void drawCaret(int guard, int parentX, int parentY, int caretIndex, UiWidget widget);
}
