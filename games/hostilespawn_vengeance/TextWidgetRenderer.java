/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getPreferredWidth(boolean param0, ag param1);

    public abstract int getTextOriginY(int param0, ag param1, int param2);

    public abstract int getTextOriginX(int param0, int param1, ag param2);

    public abstract void paintCaret(int param0, ag param1, int param2, int param3, int param4);

    public abstract int getTextAreaWidth(ag param0, byte param1);

    public abstract int getFontLineHeight(boolean param0);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, ag param3, int param4, int param5);

    public abstract int getPreferredHeight(ag param0, byte param1);

    public abstract TextLayout getTextLayout(ag param0, int param1);

    public abstract void paintSelection(int param0, byte param1, int param2, ag param3, int param4, int param5);
}
