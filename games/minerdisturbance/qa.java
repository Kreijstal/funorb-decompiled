/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static vf field_a;
    static int[] field_c;
    static byte[][] field_b;

    final static long a(int param0) {
        if (param0 > -103) {
            return -13L;
        }
        return sf.a((byte) -23) - sk.field_c;
    }

    final static sl a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        sl var8 = null;
        var8 = new sl(param2, param6, param3, param0, param7, param1);
        if (param4 != 56) {
          field_a = null;
          tc.field_v.a((byte) -98, (pi) (Object) var8);
          fg.a((byte) 5, var8, param5);
          return var8;
        } else {
          tc.field_v.a((byte) -98, (pi) (Object) var8);
          fg.a((byte) 5, var8, param5);
          return var8;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 >= -40) {
        }
    }

    final static String a(byte param0, CharSequence param1) {
        if (param0 < 27) {
            return null;
        }
        return fl.a((byte) 93, param1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[50][];
    }
}
