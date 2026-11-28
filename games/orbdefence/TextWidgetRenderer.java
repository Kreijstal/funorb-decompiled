/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getPreferredWidth(pj param0, boolean param1);

    public abstract int getTextOriginY(pj param0, int param1, int param2);

    public abstract void paintCaret(int param0, pj param1, int param2, byte param3, int param4);

    public abstract void paintSelection(int param0, int param1, pj param2, int param3, int param4, int param5);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, pj param4, int param5);

    public abstract int getFontLineHeight(byte param0);

    public abstract int getTextOriginX(pj param0, int param1, byte param2);

    public abstract TextLayout getTextLayout(pj param0, boolean param1);

    public abstract int getPreferredHeight(pj param0, boolean param1);

    public abstract int getTextAreaWidth(pj param0, int param1);
}
