/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends vd {
    private int field_w;
    private int field_v;
    static int field_u;

    final static boolean d(byte param0) {
        int var1 = -7 % ((param0 - 76) / 32);
        return !ae.field_b ? true : false;
    }

    b(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        ((b) this).field_w = param4;
        ((b) this).field_v = param5;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((b) this).field_s) {
          var2 = 68 % ((67 - param0) / 47);
          if (0 != ((b) this).field_w) {
            if (16777215 >= ((b) this).field_v) {
              gf.a(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, ((b) this).field_w, ((b) this).field_v);
              return;
            } else {
              gf.a(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, ((b) this).field_w, 16777215 & ((b) this).field_v, ((b) this).field_v >> 1659829432);
              return;
            }
          } else {
            if (-16777216 <= (((b) this).field_v ^ -1)) {
              gf.d(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, ((b) this).field_v);
              return;
            } else {
              gf.c(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, 16777215 & ((b) this).field_v, ((b) this).field_v >> 439500344);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, ob param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 2232) {
          return;
        } else {
          L0: {
            var3 = param2.length();
            if (-256 > (var3 ^ -1)) {
              var3 = 255;
              break L0;
            } else {
              break L0;
            }
          }
          param1.c(var3, (byte) -60);
          var4 = 0;
          L1: while (true) {
            if (var3 <= var4) {
              return;
            } else {
              param1.c((int) param2.charAt(var4), (byte) -57);
              var4++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ka.a(7321, 50);
    }
}
