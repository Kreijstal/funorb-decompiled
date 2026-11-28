/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract void paintSelection(int param0, UiWidget param1, int param2, int param3, int param4, boolean param5);

    public abstract TextLayout getTextLayout(int param0, UiWidget param1);

    public abstract void paintCaret(int param0, int param1, int param2, int param3, UiWidget param4);

    public abstract int getTextAreaWidth(UiWidget param0, boolean param1);

    public abstract int getPreferredWidth(int param0, UiWidget param1);

    public abstract int findTextOffsetAtScreenPosition(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5);

    public abstract int getFontLineHeight(int param0);

    public abstract int getTextOriginX(int param0, UiWidget param1, int param2);

    public abstract int getTextOriginY(int param0, UiWidget param1, int param2);

    public abstract int getPreferredHeight(int param0, UiWidget param1);
}
