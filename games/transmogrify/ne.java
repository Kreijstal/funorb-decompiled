/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static String[] field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = Transmogrify.field_A ? 1 : 0;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime3;
        int var1Lifetime4;
        int var1Lifetime1Lifetime1;
        int var1Lifetime1Lifetime2;
        int var1Lifetime1Lifetime3;
        int var1Lifetime1Lifetime4;
        int var1Lifetime1Lifetime5;
        bi.field_J = bi.field_J + 1;
        bg.field_m = bg.field_m - 1;
        if (bi.field_J != 10) {
          var1 = 60 % ((-44 - param0) / 35);
          return;
        }
        gk.field_e = hi.field_a;
        bi.field_J = 0;
        hi.field_a = hi.field_a + 1;
        if (hi.field_a != 1) {
          if (hi.field_a == 4) {
            hi.field_a = 0;
            var1Lifetime1 = 60 % ((-44 - param0) / 35);
            return;
          }
          if (9 == hi.field_a) {
            hi.field_a = 0;
            var1Lifetime1Lifetime1 = 60 % ((-44 - param0) / 35);
            return;
          }
          if (hi.field_a == 17) {
            hi.field_a = 0;
            var1Lifetime1Lifetime2 = 60 % ((-44 - param0) / 35);
            return;
          }
          if (hi.field_a == 28) {
            hi.field_a = 0;
            var1Lifetime1Lifetime3 = 60 % ((-44 - param0) / 35);
            return;
          }
          if (rd.field_c.length == hi.field_a) {
            hi.field_a = 30;
            var1Lifetime1Lifetime4 = 60 % ((-44 - param0) / 35);
            return;
          }
          var1Lifetime1Lifetime5 = 60 % ((-44 - param0) / 35);
          return;
        }
        if (bg.field_m > 0) {
          hi.field_a = 0;
          var1Lifetime2 = 60 % ((-44 - param0) / 35);
          return;
        }
        if (n.field_a >= 10) {
          hi.field_a = 0;
          var1Lifetime3 = 60 % ((-44 - param0) / 35);
          return;
        }
        hi.field_a = 9;
        bg.field_m = 2250;
        var1Lifetime4 = 60 % ((-44 - param0) / 35);
    }

    final static void a(byte param0, gd param1, int param2) {
        int var4 = 0;
        hj var5 = ff.field_D;
        var5.a(false, param2);
        if (param0 != 7) {
          return;
        }
        try {
          var5.field_h = var5.field_h + 1;
          var4 = var5.field_h;
          var5.f(6389, 1);
          var5.f(6389, param1.field_h);
          var5.f(param0 + 6382, param1.field_o);
          var5.a(-106, param1.field_j);
          var5.a(-104, param1.field_i);
          var5.a(-128, param1.field_p);
          var5.a(param0 - 108, param1.field_g);
          var5.d(var4, -1323322296);
          var5.a((byte) -42, var5.field_h - var4);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ne.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 38 / ((param0 + 6) / 43);
        field_c = null;
        field_a = null;
    }

    static {
        field_c = "Loading languages";
    }
}
