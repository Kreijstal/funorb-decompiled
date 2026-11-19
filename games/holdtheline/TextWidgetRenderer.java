/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract void drawSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getTextOriginX(UiWidget param0, int param1, int param2);

    public abstract int getFontHeight(boolean param0);

    public abstract TextLayout getTextLayout(byte param0, UiWidget param1);

    public abstract int getContentWidth(int param0, UiWidget param1);

    public abstract int characterAtPoint(int param0, byte param1, int param2, int param3, UiWidget param4, int param5);

    public abstract void drawCaret(int param0, UiWidget param1, int param2, byte param3, int param4);

    public abstract int getPreferredHeight(UiWidget param0, int param1);

    public abstract int getTextOriginY(int param0, UiWidget param1, int param2);

    public abstract int getPreferredWidth(byte param0, UiWidget param1);
}
