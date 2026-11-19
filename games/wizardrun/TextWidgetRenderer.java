/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getContentWidth(UiWidget param0, int param1);

    public abstract void drawSelection(int param0, boolean param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getPreferredHeight(byte param0, UiWidget param1);

    public abstract int getTextOriginX(UiWidget param0, int param1, int param2);

    public abstract void drawCaret(int param0, int param1, UiWidget param2, int param3, int param4);

    public abstract int getTextOriginY(boolean param0, int param1, UiWidget param2);

    public abstract int getLineHeight(byte param0);

    public abstract TextLayout getTextLayout(UiWidget param0, byte param1);

    public abstract int getTextIndexAt(int param0, int param1, int param2, UiWidget param3, int param4, int param5);

    public abstract int getPreferredWidth(byte param0, UiWidget param1);
}
