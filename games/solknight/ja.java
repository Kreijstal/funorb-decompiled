/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static o field_a;

    final static void b(int param0) {
        ud var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        ud var1Lifetime1;
        var2 = SolKnight.field_L ? 1 : 0;
        try {
          kj.field_P.b();
          ql.field_r.b();
          vg.field_M = vg.field_M - 1;
          if (param0 != 200) {
            ja.a((byte) -48);
          }
          if (vg.field_M == 0) {
            vg.field_M = 200;
            var1 = (ud) (uc.field_j.a((byte) 51));
            while (var1 != null) {
              if (!var1.field_m.a(false)) {
                var1.c(param0 ^ 194);
              }
              var1 = (ud) (uc.field_j.b(-105));
            }
            if (null != la.field_j) {
              var1Lifetime1 = (ud) (la.field_j.a((byte) 51));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_m.a(false)) {
                  var1Lifetime1.c(10);
                }
                var1Lifetime1 = (ud) (la.field_j.b(-46));
              }
            }
          }
          if (null != ua.field_I) {
            stackIn_20_0 = ua.field_I.d(144);
            if (!stackIn_20_0) {
              dj.field_j = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "ja.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        if (param2 != -41) {
          return;
        }
        ql.field_v = param0;
        ch.field_b = param1;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -43) {
          ja.b(70);
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          var5 = md.field_t;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "ja.D(" + param0 + ')');
        }
    }

    static {
    }
}
