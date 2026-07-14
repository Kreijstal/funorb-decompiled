/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static jn field_c;
    static int[] field_d;
    static int[] field_f;
    static int[] field_e;
    static String field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != -13181) {
          boolean discarded$2 = jf.a(74, (byte) -66, -15);
          return ra.a(10, param1, -46, true);
        } else {
          return ra.a(10, param1, -46, true);
        }
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 > -85) {
            return true;
        }
        return 0 != (2048 & param0) ? true : false;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 78) {
          jf.a((byte) 7);
          field_e = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jn();
        field_d = new int[128];
        field_e = new int[8192];
        field_b = "This is a hidden Achievement";
        field_a = "Waiting for instruments";
    }
}
