/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getTextAreaWidth(lk param0, byte param1);

    public abstract void paintCaret(lk param0, int param1, byte param2, int param3, int param4);

    public abstract int getPreferredHeight(lk param0, int param1);

    public abstract int getTextOriginX(int param0, int param1, lk param2);

    public abstract int findTextOffsetAtScreenPosition(lk param0, int param1, int param2, int param3, int param4, int param5);

    public abstract void paintSelection(int param0, lk param1, int param2, int param3, int param4, byte param5);

    public abstract int getFontLineHeight(int param0);

    public abstract TextLayout getTextLayout(lk param0, int param1);

    public abstract int getPreferredWidth(int param0, lk param1);

    public abstract int getTextOriginY(int param0, lk param1, byte param2);
}
