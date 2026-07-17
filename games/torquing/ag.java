/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    private static int[] field_b;
    static gd field_c;
    static k field_a;
    static String field_d;

    final static long a(long param0, int param1) {
        param0 = param0 << 32 | param0 >>> 32;
        long var3 = -281470681808896L;
        param0 = (param0 & var3) >>> 16 | (param0 & ~var3) << 16;
        var3 = var3 ^ var3 >>> 8;
        param0 = (param0 & var3) >>> 8 | (~var3 & param0) << 8;
        var3 = var3 >>> 4 ^ var3;
        param0 = (~var3 & param0) << 4 | (var3 & param0) >>> 4;
        var3 = var3 >>> 2 ^ var3;
        param0 = (param0 & var3) >>> 2 | (~var3 & param0) << 2;
        var3 = var3 ^ var3 >>> 1;
        param0 = (~var3 & param0) << 1 | (var3 & param0) >>> 1;
        return param0;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        wc var4 = null;
        bm var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var4 = (wc) (Object) so.field_t.b(0);
            L1: while (true) {
              if (var4 == null) {
                var5 = (bm) (Object) gl.field_d.b(0);
                L2: while (true) {
                  if (var5 == null) {
                    if (param0 == -45) {
                      break L0;
                    } else {
                      field_c = null;
                      return;
                    }
                  } else {
                    mc.a((byte) 85, 3, var5);
                    var5 = (bm) (Object) gl.field_d.f(-24059);
                    continue L2;
                  }
                }
              } else {
                bp.a(var4, 1, 3);
                var4 = (wc) (Object) so.field_t.f(-24059);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "ag.B(" + param0 + 44 + 3 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 1));
            var4 = (long)(-1 + (var0 << 1));
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            var2 = (int)((var4 * var4 >> 18) - 32768L);
            if (!(var3 < field_b.length)) {
                var3 = field_b.length + -1;
            }
            for (var1 = 0 > var2 ? 0 : var2; var3 >= var1; var1++) {
                field_b[var1] = var0;
            }
        }
        field_c = new gd();
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_a = new k(12, 0, 1, 0);
    }
}
