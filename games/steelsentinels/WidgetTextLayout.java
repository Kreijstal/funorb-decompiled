/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract int characterIndexAtPosition(int param0, int param1, UiComponent param2, byte param3, int param4, int param5);

    public abstract int lineHeight(int param0);

    public abstract int preferredHeight(byte param0, UiComponent param1);

    public abstract void drawCaret(UiComponent param0, int param1, int param2, int param3, byte param4);

    public abstract int textOriginY(byte param0, UiComponent param1, int param2);

    public abstract int preferredWidth(byte param0, UiComponent param1);

    public abstract int textOriginX(int param0, int param1, UiComponent param2);

    public abstract TextLayout ensureTextLayout(int param0, UiComponent param1);

    public abstract int contentWidth(int param0, UiComponent param1);

    public abstract void drawSelection(int param0, int param1, boolean param2, int param3, UiComponent param4, int param5);
}
