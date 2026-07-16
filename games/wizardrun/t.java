/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static int[] field_a;
    static String field_b;
    static boolean field_c;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        var1 = (Object) (Object) ff.field_H;
        synchronized (var1) {
          L0: {
            L1: {
              h.field_p = h.field_p + 1;
              tg.field_i = ph.field_r;
              if (param0 >= (wk.field_b ^ -1)) {
                L2: while (true) {
                  if (wk.field_b == lk.field_a) {
                    break L1;
                  } else {
                    var2 = wd.field_a[lk.field_a];
                    lk.field_a = 127 & lk.field_a - -1;
                    if (-1 >= (var2 ^ -1)) {
                      hi.field_p[var2] = true;
                      continue L2;
                    } else {
                      hi.field_p[var2 ^ -1] = false;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = 0;
                L3: while (true) {
                  if ((var2 ^ -1) <= -113) {
                    wk.field_b = lk.field_a;
                    break L1;
                  } else {
                    hi.field_p[var2] = false;
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            ph.field_r = qh.field_b;
            break L0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 10) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[128];
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
