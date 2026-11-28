/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract void paintSelection(mf param0, int param1, int param2, int param3, int param4, int param5);

    public abstract int getFontLineHeight(byte param0);

    public abstract void paintCaret(int param0, int param1, int param2, byte param3, mf param4);

    public abstract int getTextOriginY(int param0, int param1, mf param2);

    public abstract int getTextOriginX(mf param0, int param1, int param2);

    public abstract TextLayout getTextLayout(mf param0, int param1);

    public abstract int getTextAreaWidth(mf param0, int param1);

    public abstract int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, mf param4, int param5);

    public abstract int getPreferredWidth(byte param0, mf param1);

    public abstract int getPreferredHeight(boolean param0, mf param1);
}
