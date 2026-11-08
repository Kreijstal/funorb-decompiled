/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract int getAvailableTextWidth(UiWidget param0, int param1);

    public abstract void drawCaret(UiWidget param0, int param1, int param2, int param3, int param4);

    public abstract int getTextOriginX(UiWidget param0, int param1, boolean param2);

    public abstract TextLayout getTextLayout(UiWidget param0, boolean param1);

    public abstract int hitTestCaretIndex(int param0, int param1, int param2, int param3, UiWidget param4, byte param5);

    public abstract int textOriginY(int param0, int param1, UiWidget param2);

    public abstract int getPreferredHeight(UiWidget param0, byte param1);

    public abstract int getPreferredTextHeight(UiWidget param0, int param1);

    public abstract void drawSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getLineInkHeight(boolean param0);
}
