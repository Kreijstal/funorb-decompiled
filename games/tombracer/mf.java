/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    int field_b;
    private kda field_c;
    static wm field_d;
    static int field_a;

    protected final void finalize() throws Throwable {
        ((mf) this).field_c.b(((mf) this).field_b, (byte) 18);
        super.finalize();
    }

    public static void a(boolean param0) {
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2_double = 0.0;
        int var2 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            uoa.b();
            hma.field_a = 11;
            gta.field_g = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var1_int = -125 % ((param0 - -11) / 55);
                var2 = 256;
                L2: while (true) {
                  if (var2 >= gta.field_g.length) {
                    break L0;
                  } else {
                    gta.field_g[var2] = 255;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var2_double = 15.0;
                gta.field_g[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2_double) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "mf.B(" + param0 + 41);
        }
    }

    mf(kda param0, int param1, int param2) {
        try {
            ((mf) this).field_b = param2;
            ((mf) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wm();
        field_a = 50;
    }
}
