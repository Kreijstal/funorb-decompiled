/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface io {
    public abstract int characterIndexAtPosition(int param0, int param1, int param2, UiWidget param3, int param4, int param5);

    public abstract void drawSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5);

    public abstract int contentWidth(byte param0, UiWidget param1);

    public abstract int preferredHeight(int param0, UiWidget param1);

    public abstract int textLeft(int param0, UiWidget param1, int param2);

    public abstract TextLayout ensureTextLayout(int param0, UiWidget param1);

    public abstract int preferredWidth(UiWidget param0, int param1);

    public abstract int lineHeight(int param0);

    public abstract int textTop(int param0, UiWidget param1, byte param2);

    public abstract void drawCaret(int param0, int param1, int param2, int param3, UiWidget param4);
}
