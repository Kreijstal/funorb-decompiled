/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getPreferredWidth(byte param0, fj param1);

    public abstract int getFontLineHeight(int param0);

    public abstract void paintSelection(int param0, fj param1, int param2, int param3, int param4, int param5);

    public abstract int findTextOffsetAtScreenPosition(byte param0, int param1, int param2, int param3, int param4, fj param5);

    public abstract int getTextOriginY(int param0, int param1, fj param2);

    public abstract void paintCaret(int param0, fj param1, int param2, int param3, int param4);

    public abstract int getTextAreaWidth(fj param0, int param1);

    public abstract int getTextOriginX(fj param0, int param1, int param2);

    public abstract int getPreferredHeight(int param0, fj param1);

    public abstract TextLayout getTextLayout(fj param0, byte param1);
}
