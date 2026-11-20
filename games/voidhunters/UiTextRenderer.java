/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface UiTextRenderer {
    public abstract int getCaretIndexAtPoint(int param0, int param1, int param2, int param3, UiComponent param4, int param5);

    public abstract TextLayout getTextLayout(UiComponent param0, int param1);

    public abstract int getTextOriginY(int param0, int param1, UiComponent param2);

    public abstract int getPreferredHeight(UiComponent param0, byte param1);

    public abstract int getPreferredWidth(int param0, UiComponent param1);

    public abstract int getContentWidth(UiComponent param0, byte param1);

    public abstract void drawSelection(int param0, int param1, int param2, int param3, UiComponent param4, int param5);

    public abstract void drawCaret(UiComponent param0, int param1, byte param2, int param3, int param4);

    public abstract int getLineHeight(int param0);

    public abstract int getTextOriginX(int param0, int param1, UiComponent param2);
}
