/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends wl {
    int field_i;
    int field_k;
    static o[] field_j;

    final static ne a(byte param0) {
        int var1 = -30;
        return new ne(dg.a(-21), wj.g((byte) -115));
    }

    public static void b(boolean param0) {
        field_j = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            cj.c();
            rl.field_b = 11;
            qk.field_f = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (qk.field_f.length <= var5) {
                    break L0;
                  } else {
                    qk.field_f[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                qk.field_f[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "vf.A(" + 256 + ')');
        }
    }

    private vf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
