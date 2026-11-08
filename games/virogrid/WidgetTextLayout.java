/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract int getAvailableTextWidth(UiWidget param0, boolean param1);

    public abstract int getTextX(int param0, UiWidget param1, int param2);

    public abstract int getTextY(int param0, UiWidget param1, int param2);

    public abstract TextLayout getTextLayout(UiWidget param0, byte param1);

    public abstract int getPreferredHeight(UiWidget param0, int param1);

    public abstract int getPreferredWidth(UiWidget param0, boolean param1);

    public abstract int getLineHeight(int param0);

    public abstract void drawCaret(int param0, int param1, boolean param2, UiWidget param3, int param4);

    public abstract void drawSelection(byte param0, int param1, int param2, UiWidget param3, int param4, int param5);

    public abstract int hitTestCaretIndex(int param0, int param1, int param2, UiWidget param3, boolean param4, int param5);
}
