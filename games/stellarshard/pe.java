/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_b;
    static bd field_c;
    static String field_a;

    final static void b(int param0) {
        n.field_i = nk.a(-20);
        na.field_d = new ei();
        th.a(true, true, 4);
    }

    final static void c(int param0) {
        u var1 = null;
        ha var2 = null;
        var1 = (u) (Object) i.field_c.b(-103);
        if (var1 != null) {
          var2 = ae.field_N;
          int discarded$48 = var2.b(false);
          int discarded$49 = var2.b(false);
          int discarded$50 = var2.b(false);
          int discarded$51 = var2.b(false);
          if (param0 != 25214) {
            field_c = null;
            var1.c(param0 + -25194);
            return;
          } else {
            var1.c(param0 + -25194);
            return;
          }
        } else {
          oj.c(-2290);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = 0;
        if (!param3) {
          L0: {
            if (param0) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1) {
            var4++;
            var5 = -101 % ((25 - param2) / 39);
            return bl.field_a[var4];
          } else {
            var5 = -101 % ((25 - param2) / 39);
            return bl.field_a[var4];
          }
        } else {
          L1: {
            var4 += 4;
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (!param1) {
            var5 = -101 % ((25 - param2) / 39);
            return bl.field_a[var4];
          } else {
            var4++;
            var5 = -101 % ((25 - param2) / 39);
            return bl.field_a[var4];
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Ship shield";
        field_b = "This password contains repeated characters, and would be easy to guess";
    }
}
