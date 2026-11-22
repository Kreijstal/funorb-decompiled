/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static boolean field_a;
    static String field_c;
    static byte[][] field_e;
    static String field_f;
    static boolean field_b;
    static float field_d;
    static String[] field_g;

    abstract void attach(java.awt.Component param0, int param1);

    final static void a(boolean param0) {
        ef.field_a = 0;
        if (!param0) {
          field_b = true;
        }
    }

    abstract void detach(int param0, java.awt.Component param1);

    public static void clearStaticReferences(byte param0) {
        if (param0 <= 103) {
          return;
        }
        field_e = (byte[][]) null;
        field_c = null;
        field_g = null;
        field_f = null;
    }

    abstract int pollRotation(byte param0);

    static {
        field_c = "Login: ";
        field_f = "DANGER!";
        field_e = new byte[1000][];
        field_b = false;
    }
}
