/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract TextLayout getTextLayout(byte param0, lk param1);

    public abstract int getTextAreaWidth(lk param0, int param1);

    public abstract int getPreferredWidth(lk param0, byte param1);

    public abstract void paintCaret(int param0, int param1, int param2, byte param3, lk param4);

    public abstract int getPreferredHeight(int param0, lk param1);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, lk param4, int param5);

    public abstract int getFontLineHeight(int param0);

    public abstract void paintSelection(lk param0, byte param1, int param2, int param3, int param4, int param5);

    public abstract int getTextOriginY(lk param0, int param1, int param2);

    public abstract int getTextOriginX(int param0, byte param1, lk param2);
}
