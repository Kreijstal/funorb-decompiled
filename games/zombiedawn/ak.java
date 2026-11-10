/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ak {
    public abstract void drawSelection(int param0, int param1, int param2, UiWidget param3, int param4, int param5);

    public abstract int getPreferredTextWidth(byte param0, UiWidget param1);

    public abstract int getPreferredTextHeight(boolean param0, UiWidget param1);

    public abstract int hitTestCaretIndex(UiWidget param0, int param1, int param2, int param3, int param4, int param5);

    public abstract void drawCaret(int param0, int param1, int param2, int param3, UiWidget param4);

    public abstract vg getTextLayout(int param0, UiWidget param1);

    public abstract int getLineInkHeight(int param0);

    public abstract int getTextOriginY(UiWidget param0, int param1, int param2);

    public abstract int getAvailableTextWidth(byte param0, UiWidget param1);

    public abstract int getTextOriginX(UiWidget param0, int param1, int param2);
}
