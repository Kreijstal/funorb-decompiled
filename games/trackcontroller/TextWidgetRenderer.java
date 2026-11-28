/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract void paintCaret(int param0, UiWidget param1, int param2, int param3, int param4);

    public abstract int getTextOriginX(int param0, UiWidget param1, int param2);

    public abstract int getFontLineHeight(byte param0);

    public abstract int getTextOriginY(UiWidget param0, int param1, int param2);

    public abstract TextLayout getTextLayout(byte param0, UiWidget param1);

    public abstract int getTextAreaWidth(UiWidget param0, int param1);

    public abstract void paintSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getPreferredHeight(int param0, UiWidget param1);

    public abstract int getPreferredWidth(boolean param0, UiWidget param1);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, int param4, UiWidget param5);
}
