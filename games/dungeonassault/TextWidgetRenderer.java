/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int getTextOriginY(byte param0, int param1, lm param2);

    public abstract TextLayout getTextLayout(int param0, lm param1);

    public abstract void paintCaret(lm param0, int param1, int param2, int param3, int param4);

    public abstract int getPreferredHeight(lm param0, int param1);

    public abstract void paintSelection(int param0, int param1, int param2, lm param3, int param4, int param5);

    public abstract int getTextAreaWidth(int param0, lm param1);

    public abstract int getPreferredWidth(int param0, lm param1);

    public abstract int getFontLineHeight(int param0);

    public abstract int getTextOriginX(lm param0, byte param1, int param2);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, lm param4, int param5);
}
