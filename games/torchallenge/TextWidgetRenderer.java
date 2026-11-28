/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getTextAreaWidth(UiComponent param0, byte param1);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, UiComponent param2, byte param3, int param4, int param5);

    public abstract int getFontLineHeight(int param0);

    public abstract int getTextOriginX(int param0, UiComponent param1, boolean param2);

    public abstract TextLayout getTextLayout(int param0, UiComponent param1);

    public abstract void paintCaret(int param0, int param1, UiComponent param2, int param3, byte param4);

    public abstract int getPreferredWidth(UiComponent param0, byte param1);

    public abstract int getTextOriginY(UiComponent param0, int param1, int param2);

    public abstract void paintSelection(byte param0, int param1, int param2, int param3, int param4, UiComponent param5);

    public abstract int getPreferredHeight(UiComponent param0, byte param1);
}
