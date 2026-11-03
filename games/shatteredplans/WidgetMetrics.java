/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetMetrics {
    public abstract TextLayout getTextLayout(UiWidget param0, boolean param1);

    public abstract int getCharacterIndexAt(int param0, int param1, int param2, UiWidget param3, boolean param4, int param5);

    public abstract int getTextWidth(boolean param0, UiWidget param1);

    public abstract int getInnerWidth(int param0, UiWidget param1);

    public abstract int getLineHeight(boolean param0);

    public abstract void drawSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int getTextX(int param0, UiWidget param1, int param2);

    public abstract int getTextHeight(byte param0, UiWidget param1);

    public abstract void drawCaret(int param0, int param1, int param2, int param3, UiWidget param4);

    public abstract int getTextY(int param0, UiWidget param1, int param2);
}
