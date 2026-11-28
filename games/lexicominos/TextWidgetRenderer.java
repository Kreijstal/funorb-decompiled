/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract int findTextOffsetAtScreenPosition(w param0, int param1, int param2, int param3, int param4, int param5);

    public abstract void paintSelection(int param0, int param1, w param2, byte param3, int param4, int param5);

    public abstract int getTextAreaWidth(w param0, int param1);

    public abstract int getFontLineHeight(int param0);

    public abstract void paintCaret(int param0, int param1, int param2, w param3, boolean param4);

    public abstract int getTextOriginX(w param0, int param1, int param2);

    public abstract int getPreferredHeight(int param0, w param1);

    public abstract TextLayout getTextLayout(w param0, byte param1);

    public abstract int getTextOriginY(w param0, int param1, int param2);

    public abstract int getPreferredWidth(int param0, w param1);
}
