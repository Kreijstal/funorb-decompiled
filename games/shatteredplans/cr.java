/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    static int field_c;
    static int field_b;
    static String field_d;
    static v field_e;
    static String field_a;

    final static bi[] a(int param0, int param1, int param2, int param3) {
        bi[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bi[] var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = new bi[9];
        var4 = var7;
        var7[0] = gr.a((byte) -57, param3, param1);
        var5 = 1;
        L0: while (true) {
          if (-10 >= (var5 ^ -1)) {
            if (param2 != -10) {
              bi[] discarded$2 = cr.a(-10, 81, 16, 82);
              var4[4] = gr.a((byte) -124, param0, 64);
              return var4;
            } else {
              var4[4] = gr.a((byte) -124, param0, 64);
              return var4;
            }
          } else {
            var7[var5] = var7[0];
            var5++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 41) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = "Names cannot start or end with space or underscore";
    }
}
