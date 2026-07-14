/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ma {
    static int field_u;
    private dj field_r;
    static ef field_w;
    static ka field_n;
    static lj field_p;
    static int[][] field_m;
    static sl field_q;
    static mi field_o;
    static String[] field_s;
    static String field_v;
    static byte[][] field_t;

    gf(dj param0, dj param1) {
        super(param0);
        ((gf) this).field_r = param1;
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (param1.equals((Object) (Object) "C")) {
            return Character.TYPE;
        }
        if (param0 != 0) {
            return null;
        }
        return Class.forName(param1);
    }

    final rj a(byte param0, String param1) {
        wd var3 = null;
        if (param0 != 24) {
            gf.d((byte) -38);
        }
        if (((gf) this).field_r instanceof uh) {
            var3 = ((uh) (Object) ((gf) this).field_r).a(-113);
            if (var3 != null) {
                if (var3.b(97) != tf.field_w) {
                    return lk.field_c;
                }
            }
        }
        return param1.equals((Object) (Object) ((gf) this).field_r.field_v) ? tf.field_w : lk.field_c;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        if (param1 == 78) {
          var3 = 0;
          L0: while (true) {
            if (var3 <= -6) {
              return var2;
            } else {
              if (-1 < (param0 & 1 << var3)) {
                var2++;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 68;
        }
    }

    public static void d(byte param0) {
        field_m = null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_n = null;
        field_q = null;
        field_w = null;
        field_t = null;
        int var1 = 107 / ((param0 - -58) / 34);
        field_v = null;
    }

    final String a(String param0, byte param1) {
        wd var3 = null;
        if (param1 != -24) {
            field_t = null;
        }
        if (!(!(((gf) this).field_r instanceof uh))) {
            var3 = ((uh) (Object) ((gf) this).field_r).a(-122);
            if (!(var3 == null)) {
                if (var3.b(110) == tf.field_w) {
                    if (!(param0.equals((Object) (Object) ((gf) this).field_r.field_v))) {
                        return ki.field_c;
                    }
                }
                return var3.a((byte) -10);
            }
        }
        if (param0.equals((Object) (Object) ((gf) this).field_r.field_v)) {
            return null;
        }
        return ki.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = null;
        field_m = new int[][]{new int[1], new int[1], new int[1], new int[3], new int[1]};
        field_q = new sl();
    }
}
