/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static da field_b;
    static String[] field_d;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        if (param0 != 113) {
            Object var2 = null;
            o discarded$0 = eb.a(false, (o) null, 11);
        }
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static o a(boolean param0, o param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        o var11 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        param1.d();
        var11 = new o(param1.field_p, param1.field_t / 3);
        var4 = 0;
        var5 = 0;
        var6 = param1.field_v;
        var7 = var11.field_v;
        var8 = 0;
        L0: while (true) {
          if (var11.field_t <= var8) {
            var8 = -54 % ((param2 - -21) / 57);
            var11.f();
            return var11;
          } else {
            var9 = 0;
            L1: while (true) {
              if (var9 >= var11.field_p) {
                var5 = var5 - var11.field_p;
                var9 = 0;
                L2: while (true) {
                  if (var11.field_p <= var9) {
                    var5 = var5 - var11.field_p;
                    var9 = 0;
                    L3: while (true) {
                      if (var11.field_p <= var9) {
                        var8++;
                        continue L0;
                      } else {
                        var5++;
                        var4++;
                        var7[var5] = var7[var5] + rf.b(20, var6[var4], param0, 0);
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    var5++;
                    var4++;
                    var7[var5] = var7[var5] + rf.b(20, var6[var4], param0, 1);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                var5++;
                var4++;
                var7[var5] = var7[var5] + rf.b(20, var6[var4], param0, 2);
                var9++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player Name: ";
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_c = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
