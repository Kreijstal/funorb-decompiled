/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static String field_e;
    static oh field_c;
    static int[][] field_g;
    static String field_f;
    static String[] field_i;
    static float field_d;
    static int[] field_b;
    static int field_a;
    static int field_h;

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = -7 % ((50 - param0) / 33);
        if (this != (Object) (Object) vb.field_l) {
          if ((Object) (Object) sa.field_f != this) {
            if (this == (Object) (Object) li.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static int a(hb param0, hb param1, byte param2) {
        if (param2 > -28) {
            return -41;
        }
        Object var4 = null;
        return od.a((byte) 98, (String) null, param1, 0, 0, false, param0);
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_i = null;
        if (param0 != 0) {
            field_f = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Turn time (seconds)"};
        field_f = "Your turn";
        field_e = "Name is available";
        field_a = 0;
    }
}
