/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static String field_b;
    static ak field_a;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Main.field_T;
        var1 = (Object) (Object) sj.field_d;
        synchronized (var1) {
          L0: {
            L1: {
              ab.field_t = ce.field_b;
              mh.field_b = mh.field_b + 1;
              if (-1 >= (bg.field_rb ^ -1)) {
                L2: while (true) {
                  if (bg.field_rb == be.field_b) {
                    break L1;
                  } else {
                    var2 = oc.field_h[be.field_b];
                    be.field_b = 127 & be.field_b - -1;
                    if (0 <= var2) {
                      ge.field_c[var2] = true;
                      continue L2;
                    } else {
                      ge.field_c[var2 ^ -1] = false;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = 0;
                L3: while (true) {
                  if (112 <= var2) {
                    bg.field_rb = be.field_b;
                    break L1;
                  } else {
                    ge.field_c[var2] = false;
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            ce.field_b = sa.field_b;
            break L0;
          }
        }
        if (param0 >= -123) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= 40) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
    }
}
