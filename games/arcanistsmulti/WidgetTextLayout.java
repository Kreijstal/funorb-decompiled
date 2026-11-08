/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract TextLayout getTextLayout(UiComponent param0, int param1);

    public abstract int getTextX(UiComponent param0, byte param1, int param2);

    public abstract int getTextY(int param0, int param1, UiComponent param2);

    public abstract int getAvailableWidth(UiComponent param0, byte param1);

    public abstract int getPreferredHeight(UiComponent param0, int param1);

    public abstract int getPreferredWidth(byte param0, UiComponent param1);

    public abstract void drawCaret(int param0, int param1, int param2, int param3, UiComponent param4);

    public abstract int lineHeight(int param0);

    public abstract int hitTestCharacter(int param0, UiComponent param1, int param2, int param3, int param4, int param5);

    public abstract void drawSelection(int param0, UiComponent param1, int param2, int param3, int param4, int param5);
}
