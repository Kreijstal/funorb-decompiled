/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    int field_l;
    static String field_a;
    static te field_h;
    int field_i;
    static String field_f;
    static String field_k;
    int field_g;
    static String field_b;
    int field_j;
    static bb field_d;
    static int[] field_c;
    static long field_e;

    final static void a() {
        fa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        og var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4 = (og) (Object) wk.field_g.c(1504642273);
            L1: while (true) {
              if (var4 == null) {
                var2 = bq.field_a.c(1504642273);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    sd.a(true, 6);
                    var2 = bq.field_a.f(1504642273);
                    continue L2;
                  }
                }
              } else {
                dq.a(6, -18989, var4);
                var4 = (og) (Object) wk.field_g.f(1504642273);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "bo.D(" + 6 + ',' + 7 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_h = null;
        field_f = null;
        field_d = null;
        field_k = null;
        field_b = null;
    }

    final static byte[] a(int param0) {
        byte[] var2 = new byte[8];
        byte[] var1 = var2;
        var2[6] = (byte)(int)mk.a(255L, jo.field_h >> 48);
        var2[2] = (byte)(int)mk.a((long)param0, jo.field_h >> 16);
        var2[3] = (byte)(int)mk.a(jo.field_h >> 24, 255L);
        var2[5] = (byte)(int)mk.a(jo.field_h >> 40, 255L);
        var2[1] = (byte)(int)mk.a(255L, jo.field_h >> 8);
        var2[0] = (byte)(int)mk.a(jo.field_h, 255L);
        var2[4] = (byte)(int)mk.a(255L, jo.field_h >> 32);
        var2[7] = (byte)(int)mk.a(255L, jo.field_h >> 56);
        return var2;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        if (param2 == 1) {
          if (!sh.a(false, param1)) {
            var3 = 27;
            return gb.field_e[param2];
          } else {
            return 29;
          }
        } else {
          var3 = 27;
          return gb.field_e[param2];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = "A Night to Remember";
        field_f = "Back";
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_k = "Retry";
        field_d = new bb();
        field_c = new int[16];
        for (var0 = 0; field_c.length > var0; var0++) {
            field_c[var0] = 256 / field_c.length * 65793 * var0;
        }
    }
}
