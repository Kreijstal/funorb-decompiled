/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kc {
    static int field_c;
    static pj field_a;
    static Boolean field_b;
    static int field_d;

    abstract void a(int param0, gk param1);

    final static void b(boolean param0) {
        if (null != ha.field_Z) {
          if (ha.field_Z.h()) {
            int discarded$8 = 96;
            int discarded$9 = 100;
            ha.field_Z = li.a(ke.field_h[4]);
            na.a((byte) 60, ha.field_Z);
            return;
          } else {
            return;
          }
        } else {
          int discarded$10 = 96;
          int discarded$11 = 100;
          ha.field_Z = li.a(ke.field_h[4]);
          na.a((byte) 60, ha.field_Z);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = (Object) (Object) wj.field_k;
          synchronized (var1) {
            L0: {
              L1: {
                o.field_b = bh.field_e;
                je.field_c = je.field_c + 1;
                if (0 > vf.field_a) {
                  var5 = 0;
                  var2 = var5;
                  L2: while (true) {
                    if (112 <= var5) {
                      vf.field_a = sl.field_j;
                      break L1;
                    } else {
                      dl.field_c[var5] = false;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  L3: while (true) {
                    if (sl.field_j == vf.field_a) {
                      break L1;
                    } else {
                      var2 = ia.field_g[sl.field_j];
                      sl.field_j = 127 & sl.field_j + 1;
                      if (var2 < 0) {
                        dl.field_c[~var2] = false;
                        continue L3;
                      } else {
                        dl.field_c[var2] = true;
                        continue L3;
                      }
                    }
                  }
                }
              }
              bh.field_e = jk.field_w;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) (Object) var1_ref, "kc.I(" + 93 + 41);
        }
    }

    abstract fk a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
