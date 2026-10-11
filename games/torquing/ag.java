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
        if (param1 <= 0) {
          param0 = (~var3 & param0) << 4 | (var3 & param0) >>> 4;
          var3 = var3 >>> 2 ^ var3;
          param0 = (param0 & var3) >>> 2 | (~var3 & param0) << 2;
          var3 = var3 ^ var3 >>> 1;
          param0 = (~var3 & param0) << 1 | (var3 & param0) >>> 1;
          return param0;
        }
        field_a = (k) null;
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
          var4 = (wc) (so.field_t.b(0));
          while (var4 != null) {
            bp.a(var4, 1, param1);
            var4 = (wc) (so.field_t.f(-24059));
          }
          var5 = (bm) (gl.field_d.b(0));
          while (var5 != null) {
            mc.a((byte) 85, param1, var5);
            var5 = (bm) (gl.field_d.f(-24059));
          }
          if (param0 == -45) {
            return;
          }
          field_c = (gd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "ag.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 18945) {
          return;
        }
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
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
          var3 = (int)((var6 * var6 >> 18) - 32768L);
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          if (!(var3 < field_b.length)) {
            var3 = field_b.length - 1;
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
