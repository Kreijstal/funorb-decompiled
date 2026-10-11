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
        th.a(true, true, param0);
    }

    final static void c(int param0) {
        u var1 = (u) (i.field_c.b(-103));
        if (var1 == null) {
          oj.c(-2290);
          return;
        }
        ha var2 = ae.field_N;
        var2.b(false);
        var2.b(false);
        var2.b(false);
        var2.b(false);
        if (param0 == 25214) {
          var1.c(param0 - 25194);
          return;
        }
        field_c = (bd) null;
        var1.c(param0 - 25194);
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
        int var5 = 0;
        int var4 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param3) {
          var4 += 4;
          if (param0) {
            var4 += 2;
          }
          if (param1) {
            var4++;
            var5 = -101 % ((25 - param2) / 39);
            return bl.field_a[var4];
          }
          var5Lifetime3 = -101 % ((25 - param2) / 39);
          return bl.field_a[var4];
        }
        if (param0) {
          var4 += 2;
        }
        if (!param1) {
          var5Lifetime1 = -101 % ((25 - param2) / 39);
          return bl.field_a[var4];
        }
        var4++;
        var5Lifetime2 = -101 % ((25 - param2) / 39);
        return bl.field_a[var4];
    }

    static {
        field_a = "Ship shield";
        field_b = "This password contains repeated characters, and would be easy to guess";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$3214d41809e1(boolean param0, boolean param1, int param2, boolean param3) {
        int var5 = 0;
        int var4 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param3) {
          var4 += 4;
          if (param0) {
            var4 += 2;
          }
          if (param1) {
            var4++;
            var5 = -101 % ((25 - param2) / 39);
            return bl.field_a[var4];
          }
          var5Lifetime3 = -101 % ((25 - param2) / 39);
          return bl.field_a[var4];
        }
        if (param0) {
          var4 += 2;
        }
        if (!param1) {
          var5Lifetime1 = -101 % ((25 - param2) / 39);
          return bl.field_a[var4];
        }
        var4++;
        var5Lifetime2 = -101 % ((25 - param2) / 39);
        return bl.field_a[var4];
    }
}
