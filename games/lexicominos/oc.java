/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static boolean field_b;
    static int[] field_a;
    static int field_e;
    static int field_c;
    static jb[] field_d;

    final static jb[] a(sh param0, int param1, int param2, int param3) {
        if (param3 == 20) {
          if (!nb.a(param2, param1, (byte) 125, param0)) {
            return null;
          } else {
            return ti.a((byte) 108);
          }
        } else {
          oc.a(-29);
          if (!nb.a(param2, param1, (byte) 125, param0)) {
            return null;
          } else {
            return ti.a((byte) 108);
          }
        }
    }

    public static void a(int param0) {
        int var1 = -2 % ((param0 - 11) / 49);
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_e = 256;
        field_c = 20;
    }
}
