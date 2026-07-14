/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static hla field_b;
    static jea field_a;
    static nh[] field_d;
    private static String[] field_c;

    final static byte[] a(byte param0, String param1) {
        int var2 = -81 / ((48 - param0) / 56);
        return df.field_H.a("", (byte) 123, param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = null;
          field_b = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[2];
        field_c[1] = "Lava";
        field_c[0] = "Normal";
    }
}
