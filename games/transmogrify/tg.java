/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_c;
    static int field_d;
    static int field_a;
    static volatile long field_b;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_d = -21;
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var3 = rb.a((byte) -84, param2, param1);
        var4 = -98 / ((45 - param0) / 35);
        if (var3 != null) {
          return var3;
        } else {
          var5 = 0;
          L0: while (true) {
            if (var5 < param2.length()) {
              if (!bc.a(param2.charAt(var5), -161)) {
                return ff.field_C;
              } else {
                var5++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6) {
        fd.field_h[param0] = param2;
        fd.field_e[param0] = param5;
        fd.field_c[param0] = param4;
        fd.field_a[param0] = param6;
        fd.field_b[param0] = param1;
        if (param3 <= 37) {
            field_d = 117;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_d = 0;
        field_b = 0L;
    }
}
