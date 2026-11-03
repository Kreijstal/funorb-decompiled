/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetTextLayout {
    public abstract void drawSelection(int param0, UiComponent param1, int param2, int param3, int param4, int param5);

    public abstract int textOriginY(byte param0, UiComponent param1, int param2);

    public abstract int hitTestCaretIndex(int param0, int param1, int param2, int param3, int param4, UiComponent param5);

    public abstract TextLayout getTextLayout(int param0, UiComponent param1);

    public abstract int getPreferredWidth(int param0, UiComponent param1);

    public abstract int getAvailableTextHeight(boolean param0, UiComponent param1);

    public abstract int getTextOriginY(int param0, UiComponent param1, byte param2);

    public abstract int a(int param0);

    public abstract int getPreferredWidth(UiComponent param0, int param1);

    public abstract void a(int param0, int param1, byte param2, UiComponent param3, int param4);
}
