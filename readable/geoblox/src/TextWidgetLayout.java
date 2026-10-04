/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetLayout {
    public abstract TextLayout getTextLayout(byte methodGuard, UiWidget widget);

    public abstract int getMaximumLineEndXWithPadding(UiWidget widget, byte methodGuard);

    public abstract int getTextOriginX(int parentX, UiWidget widget, byte methodGuard);

    public abstract void drawCaret(int parentX, int caretIndex, int methodGuard, UiWidget widget, int parentY);

    public abstract int getTextOriginY(int parentY, int methodGuard, UiWidget widget);

    public abstract int getLayoutHeightWithPadding(int methodGuard, UiWidget widget);

    public abstract int hitTestCaretIndex(UiWidget widget, int pointerX, int methodGuard, int parentY, int pointerY, int parentX);

    public abstract int getAvailableTextWidth(UiWidget widget, int methodGuard);

    public abstract void drawSelection(int selectionAnchorIndex, int methodGuard, int parentY, int parentX, int caretIndex, UiWidget widget);

    public abstract int getFontHeight(int methodGuard);
}
