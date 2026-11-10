/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface rk {
    public abstract void drawSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getLineHeight(int param0);

    public abstract int getPreferredHeight(byte param0, UiWidget param1);

    public abstract int getTextOriginX(boolean param0, int param1, UiWidget param2);

    public abstract int contentHeight(UiWidget param0, int param1);

    public abstract mp getTextLayout(UiWidget param0, int param1);

    public abstract int getTextOriginY(UiWidget param0, int param1, int param2);

    public abstract int getAvailableTextWidth(UiWidget param0, boolean param1);

    public abstract void drawCaret(UiWidget param0, byte param1, int param2, int param3, int param4);

    public abstract int hitTestCaretIndex(int param0, int param1, int param2, int param3, int param4, UiWidget param5);
}
