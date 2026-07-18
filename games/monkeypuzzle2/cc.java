/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cc {
    static le[][] field_a;
    static long field_b;

    abstract void a(int param0, java.awt.Component param1);

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ig.b();
            r.field_a = new int[260];
            uc.field_b = 11;
            var1_int = 0;
            L1: while (true) {
              if (256 <= var1_int) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= r.field_a.length) {
                    break L0;
                  } else {
                    r.field_a[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                r.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "cc.F(" + true + ')');
        }
    }

    abstract int a(boolean param0);

    final static void a(int param0, boolean param1, boolean param2) {
        if (param1) {
            ge.c(0, 0, ge.field_h, ge.field_g, 0, 192);
        } else {
            ge.d();
            ge.d();
            ge.d();
        }
        vj.a(1, param1);
    }

    public static void a() {
        field_a = null;
    }

    abstract void a(java.awt.Component param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new le[3][];
    }
}
