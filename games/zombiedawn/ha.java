/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    static String field_c;
    static fc field_d;
    static int field_a;
    static boolean field_e;
    static int field_b;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
    }

    final static void a() {
        fp.field_H = dj.field_e.field_H.field_u + 300;
        ac.field_t = -300;
    }

    final static void b() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var1 = (Object) (Object) ea.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  nl.field_s = nl.field_s + 1;
                  he.field_e = wb.field_y;
                  if (ih.field_F < 0) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (var5 >= 112) {
                        ih.field_F = uc.field_d;
                        break L2;
                      } else {
                        bo.field_p[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (ih.field_F == uc.field_d) {
                        break L2;
                      } else {
                        var2 = nd.field_c[uc.field_d];
                        uc.field_d = 127 & 1 + uc.field_d;
                        if (var2 >= 0) {
                          bo.field_p[var2] = true;
                          continue L4;
                        } else {
                          bo.field_p[~var2] = false;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                wb.field_y = je.field_c;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "ha.B(" + 27914 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_c = "Select Level";
        field_b = 0;
    }
}
