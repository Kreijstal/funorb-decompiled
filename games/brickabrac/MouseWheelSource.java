/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelSource {
    static int resizeFrameCounter;
    static String field_d;
    static String field_b;
    static UiComponent field_c;

    abstract void detach(java.awt.Component component, int obfuscationGuard);

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 < 72) {
          resizeFrameCounter = 14;
        }
    }

    abstract int pollRotation(int obfuscationGuard);

    final static void a(int param0, byte param1) {
        MovingBody.c((byte) -109);
        if (param1 <= 111) {
          MouseWheelSource.a(-66, (byte) -49);
        }
    }

    abstract void attach(byte obfuscationGuard, java.awt.Component component);

    static {
        resizeFrameCounter = 500;
        field_b = "Please select an option in the '<%0>' row.";
        field_d = "Name is available";
    }
}
