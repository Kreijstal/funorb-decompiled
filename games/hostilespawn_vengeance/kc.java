/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends RuntimeException {
    static String field_e;
    static String field_b;
    static bd field_d;
    String field_a;
    static int field_c;
    Throwable field_g;
    static String field_f;

    final static boolean a(int param0, byte param1) {
        int var2 = 0;
        if ((ln.field_a.field_c[param0] ^ -1) == -3) {
          ln.field_a.field_e[param0] = true;
          if (0 != ln.field_a.field_f[param0]) {
            return true;
          } else {
            ln.field_a.field_f[param0] = 2;
            return true;
          }
        } else {
          if (!pl.field_k) {
            if (ln.field_a.field_r[param0]) {
              if (!wb.field_Z) {
                return true;
              } else {
                pl.field_k = ln.field_a.field_r[param0];
                var2 = -127 / ((param1 - -72) / 38);
                ln.field_a.field_e[param0] = true;
                ln.field_a.field_f[param0] = 2;
                return false;
              }
            } else {
              pl.field_k = ln.field_a.field_r[param0];
              var2 = -127 / ((param1 - -72) / 38);
              ln.field_a.field_e[param0] = true;
              ln.field_a.field_f[param0] = 2;
              return false;
            }
          } else {
            pl.field_k = ln.field_a.field_r[param0];
            var2 = -127 / ((param1 - -72) / 38);
            ln.field_a.field_e[param0] = true;
            ln.field_a.field_f[param0] = 2;
            return false;
          }
        }
    }

    final static boolean a(byte param0, oc param1) {
        if (param0 > -123) {
          field_f = null;
          return gj.a(param1.b(-4), param1.field_g, -115, param1.field_e);
        } else {
          return gj.a(param1.b(-4), param1.field_g, -115, param1.field_e);
        }
    }

    kc(Throwable param0, String param1) {
        ((kc) this).field_g = param0;
        ((kc) this).field_a = param1;
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        if (param1) {
          var5 = ia.a(param2, 127);
          if ((param0.indexOf(param2) ^ -1) == 0) {
            if (param0.indexOf(var5) == -1) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var5)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var5)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
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
          } else {
            return true;
          }
        } else {
          field_f = null;
          var4 = ia.a(param2, 127);
          var3 = var4;
          if ((param0.indexOf(param2) ^ -1) == 0) {
            if (param0.indexOf(var4) == -1) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var4)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var4)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
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
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -70) {
            return;
        }
        field_e = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = "Find your way back to the lift.";
        field_c = 0;
        field_f = "Create a free Account";
    }
}
