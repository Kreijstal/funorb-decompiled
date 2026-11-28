/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getPreferredHeight(int param0, UiWidget param1);

    public abstract void paintCaret(int param0, int param1, UiWidget param2, int param3, byte param4);

    public abstract int getTextOriginX(UiWidget param0, int param1, int param2);

    public abstract int getTextOriginY(UiWidget param0, int param1, byte param2);

    public abstract void paintSelection(int param0, int param1, int param2, UiWidget param3, int param4, int param5);

    public abstract int findTextOffsetAtScreenPosition(UiWidget param0, int param1, int param2, int param3, int param4, int param5);

    public abstract TextLayout getTextLayout(UiWidget param0, boolean param1);

    public abstract int getFontLineHeight(byte param0);

    public abstract int getPreferredWidth(byte param0, UiWidget param1);

    public abstract int getTextAreaWidth(UiWidget param0, int param1);
}
