/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getPreferredHeight(UiWidget param0, int param1);

    public abstract int getTextOriginY(int param0, byte param1, UiWidget param2);

    public abstract void paintSelection(byte param0, UiWidget param1, int param2, int param3, int param4, int param5);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getTextOriginX(int param0, UiWidget param1, int param2);

    public abstract int getPreferredWidth(UiWidget param0, int param1);

    public abstract void paintCaret(int param0, int param1, UiWidget param2, int param3, int param4);

    public abstract int getFontLineHeight(int param0);

    public abstract int getTextAreaWidth(int param0, UiWidget param1);

    public abstract TextLayout getTextLayout(UiWidget param0, int param1);
}
