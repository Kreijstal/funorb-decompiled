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
        int var2;
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
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -123) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = gj.a(param1.b(-4), param1.field_g, -115, param1.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("kc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    kc(Throwable param0, String param1) {
        this.field_g = param0;
        this.field_a = param1;
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            L2: {
              var3 = ia.a(param2, 127);
              if ((param0.indexOf(param2) ^ -1) != 0) {
                break L2;
              } else {
                if (param0.indexOf(var3) != -1) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param0.startsWith(param2)) {
                        break L4;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L4;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("kc.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
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
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = "Find your way back to the lift.";
        field_c = 0;
        field_f = "Create a free Account";
    }
}
