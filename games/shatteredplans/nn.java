/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static byte[][][] field_c;
    static String field_a;

    public static void a(byte param0) {
        int var1 = 50 / ((param0 - 1) / 38);
        field_c = null;
        field_a = null;
    }

    final static int a(ln[] param0, int param1) {
        if (param1 != 0) {
            return -87;
        }
        return ti.a((byte) 83, param0);
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = wp.a((byte) -127, param1, param2);
        var4 = 127 % ((-49 - param0) / 45);
        if (var3 != null) {
          return var3;
        } else {
          var5 = 0;
          L0: while (true) {
            if (param1.length() > var5) {
              if (ce.a(param1.charAt(var5), (byte) 101)) {
                var5++;
                continue L0;
              } else {
                return as.field_i;
              }
            } else {
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "System defensive strength";
    }
}
