/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static String field_b;
    static ak field_a;

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            var1 = (Object) (Object) sj.field_d;
            synchronized (var1) {
              L1: {
                L2: {
                  ab.field_t = ce.field_b;
                  mh.field_b = mh.field_b + 1;
                  if (bg.field_rb >= 0) {
                    L3: while (true) {
                      if (bg.field_rb == be.field_b) {
                        break L2;
                      } else {
                        var2 = oc.field_h[be.field_b];
                        be.field_b = 127 & be.field_b - -1;
                        if (0 <= var2) {
                          ge.field_c[var2] = true;
                          continue L3;
                        } else {
                          ge.field_c[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (112 <= var2) {
                        bg.field_rb = be.field_b;
                        break L2;
                      } else {
                        ge.field_c[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                ce.field_b = sa.field_b;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "i.A(" + -125 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
    }
}
