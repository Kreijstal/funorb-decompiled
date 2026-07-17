/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int[] field_e;
    static ka[] field_d;
    static boolean[] field_c;
    static boolean field_b;
    static int field_f;
    static long field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        int var1 = 0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (vj.field_d == null) {
                break L1;
              } else {
                var1_int = 0;
                L2: while (true) {
                  if (vj.field_d.length <= var1_int) {
                    break L1;
                  } else {
                    vj.field_d[var1_int] = null;
                    var1_int++;
                    continue L2;
                  }
                }
              }
            }
            int discarded$2 = vd.c(-60);
            vj.field_d = null;
            cg.field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "vd.A(" + 0 + 41);
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_e = null;
            return cf.field_f;
        }
        return cf.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
        field_d = new ka[3];
        field_b = false;
        field_a = 0L;
    }
}
