/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static LegacyBitmapFont field_a;
    static String field_c;
    static ToolkitSprite field_b;
    private static String field_z;

    abstract void detach(java.awt.Component component, byte guard);

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        int var1 = -53 / ((14 - param0) / 51);
    }

    abstract int pollDelta(int guard);

    abstract void attach(boolean guard, java.awt.Component component);

    static {
        field_z = "ns.C(";
    }
}
