/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract int getLineInkHeight(byte param0);

    public abstract int hitTestCaretIndex(UiWidget param0, byte param1, int param2, int param3, int param4, int param5);

    public abstract void drawCaret(int param0, int param1, int param2, int param3, UiWidget param4);

    public abstract int getTextOriginX(UiWidget param0, int param1, byte param2);

    public abstract int getAvailableTextWidth(byte param0, UiWidget param1);

    public abstract int textTop(int param0, UiWidget param1, byte param2);

    public abstract int getTextWidth(byte param0, UiWidget param1);

    public abstract int getPreferredWidth(int param0, UiWidget param1);

    public abstract void drawSelection(int param0, UiWidget param1, int param2, int param3, int param4, int param5);

    public abstract TextBlockLayout ensureTextLayout(UiWidget param0, int param1);
}
