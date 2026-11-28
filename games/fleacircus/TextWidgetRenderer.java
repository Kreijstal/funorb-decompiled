/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract void paintCaret(int param0, int param1, UiComponent param2, int param3, int param4);

    public abstract int getTextOriginX(boolean param0, int param1, UiComponent param2);

    public abstract TextLayout getTextLayout(UiComponent param0, byte param1);

    public abstract int getTextAreaWidth(UiComponent param0, byte param1);

    public abstract int getPreferredHeight(int param0, UiComponent param1);

    public abstract int findTextOffsetAtScreenPosition(int param0, UiComponent param1, byte param2, int param3, int param4, int param5);

    public abstract int getTextOriginY(int param0, UiComponent param1, byte param2);

    public abstract void paintSelection(UiComponent param0, int param1, int param2, int param3, int param4, int param5);

    public abstract int getPreferredWidth(int param0, UiComponent param1);

    public abstract int getFontLineHeight(byte param0);
}
