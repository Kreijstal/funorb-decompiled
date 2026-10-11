/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static bo field_b;
    static String field_d;
    static int[] field_f;
    static String field_a;
    static qd field_h;
    static ja field_e;
    static ja[] field_j;
    static int[] field_i;
    static int[] field_c;
    static di field_g;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -10995) {
            wp.c(117);
          }
          var1 = ma.field_a;
          while (so.c(1)) {
            var1.b((byte) -35, 8);
            fieldTemp$0 = var1.field_j + 1;
            var1.field_j = var1.field_j + 1;
            var2 = fieldTemp$0;
            hd.a(var1, param0 + 10995);
            ma.field_a.e(param0 + 11021, var1.field_j - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "wp.D(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 8192) {
          wp.a(90);
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_e = null;
        field_h = null;
        if (param0 == 26) {
          field_g = null;
          field_d = null;
          field_i = null;
          field_b = null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
        field_j = (ja[]) null;
        field_g = null;
        field_d = null;
        field_i = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        em.field_ab[param1][param3] = param0;
        em.field_ab[param1][1] = param2;
    }

    final static void b(int param0) {
        we var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        we var1Lifetime1;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          rm.field_b.a();
          ga.field_u.a();
          mn.field_p = mn.field_p - 1;
          if (mn.field_p == 0) {
            mn.field_p = 200;
            var1 = (we) (gb.field_e.c(75));
            while (var1 != null) {
              if (!var1.field_h.b(4)) {
                var1.a(true);
              }
              var1 = (we) (gb.field_e.b(6));
            }
            if (wc.field_K != null) {
              var1Lifetime1 = (we) (wc.field_K.c(51));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_h.b(4)) {
                  var1Lifetime1.a(true);
                }
                var1Lifetime1 = (we) (wc.field_K.b(6));
              }
            }
          }
          var1_int = 107 / ((param0 - 76) / 39);
          if (wd.field_L != null) {
            if (wd.field_L.c(-119)) {
              return;
            }
            bb.field_g = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "wp.A(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_b = new bo("email");
        field_d = "SCORE: <%0>";
        field_a = "Confuse their senses.";
        field_i = new int[8192];
        field_f = new int[256];
        for (var0 = 0; var0 < 255; var0++) {
          field_f[var0] = var0 * 65793;
        }
        field_c = new int[5];
    }
}
