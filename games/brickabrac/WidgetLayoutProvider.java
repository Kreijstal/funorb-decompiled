/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetLayoutProvider {
    public abstract int a(Widget param0, byte param1, int param2);

    public abstract int a(int param0, byte param1, Widget param2);

    public abstract int getPreferredWidth(Widget widget, int obfuscationGuard);

    public abstract int a(Widget param0, int param1, boolean param2, int param3, int param4, int param5);

    public abstract ep c(Widget param0, int param1);

    public abstract int a(int param0, Widget param1);

    public abstract int a(byte param0);

    public abstract void a(int param0, int param1, int param2, int param3, int param4, Widget param5);

    public abstract void a(Widget param0, int param1, int param2, int param3, byte param4);

    public abstract int getPreferredHeight(Widget widget, int obfuscationGuard);
}
