/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int field_a;
    static int field_f;
    static java.lang.reflect.Method field_e;
    static String field_c;
    static bd[] field_d;
    static bd field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(0 != param1)) {
            return 0;
        }
        if (!(0 >= param1)) {
            var2 = 1;
            if (65535 < param1) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (!(param1 <= 255)) {
                param1 = param1 >> 8;
                var2 += 8;
            }
            if (!(param1 <= 15)) {
                var2 += 4;
                param1 = param1 >> 4;
            }
            if (param1 > 3) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (!(param1 <= 1)) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (param1 < -65536) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (!(param1 >= -256)) {
            param1 = param1 >> 8;
            var2 += 8;
        }
        if (!(param1 >= -16)) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (!(param1 >= -4)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (param1 < -2) {
            param1 = param1 >> 1;
            var2++;
        }
        return var2;
    }

    final static boolean a(char param0) {
        if (!Character.isISOControl(param0)) {
          if (rf.a(true, param0)) {
            return true;
          } else {
            if (45 != param0) {
              if (param0 != 160) {
                if (param0 != 32) {
                  if (param0 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static void a(java.applet.Applet param0) {
        try {
            qj.a("", param0, (byte) 51);
            o.a((byte) -61, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "aa.A(" + (param0 != null ? "{...}" : "null") + 44 + 2429 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Reach the lift and proceed to the next level.";
    }
}
