/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getPreferredHeight(int param0, vg param1);

    public abstract void paintCaret(int param0, int param1, vg param2, int param3, byte param4);

    public abstract int getTextOriginX(vg param0, int param1, int param2);

    public abstract int getTextOriginY(vg param0, int param1, byte param2);

    public abstract void paintSelection(int param0, int param1, int param2, vg param3, int param4, int param5);

    public abstract int findTextOffsetAtScreenPosition(vg param0, int param1, int param2, int param3, int param4, int param5);

    public abstract TextLayout getTextLayout(vg param0, boolean param1);

    public abstract int getFontLineHeight(byte param0);

    public abstract int getPreferredWidth(byte param0, vg param1);

    public abstract int getTextAreaWidth(vg param0, int param1);
}
