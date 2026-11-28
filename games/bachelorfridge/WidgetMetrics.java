/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetMetrics {
    public abstract int findTextOffsetAtScreenPosition(UiWidget param0, int param1, int param2, int param3, int param4, byte param5);

    public abstract int getPreferredWidth(int param0, UiWidget param1);

    public abstract void paintSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getTextAreaWidth(UiWidget param0, boolean param1);

    public abstract int getFontLineHeight(int param0);

    public abstract void paintCaret(byte param0, int param1, UiWidget param2, int param3, int param4);

    public abstract int getPreferredHeight(UiWidget param0, boolean param1);

    public abstract int getTextOriginX(int param0, int param1, UiWidget param2);

    public abstract TextLayout getTextLayout(UiWidget param0, boolean param1);

    public abstract int getTextOriginY(UiWidget param0, int param1, byte param2);
}
