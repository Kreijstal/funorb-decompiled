/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mj {
    static nc field_b;
    private String field_a;
    static String[] field_c;

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        Object stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = StarCannon.field_A;
        try {
          var3 = md.a(param1, param2, (byte) -81);
          if (var3 == null) {
            if (param0 >= 31) {
              var4 = 0;
              L0: while (true) {
                if (var4 < param2.length()) {
                  if (!sa.a((byte) -121, param2.charAt(var4))) {
                    stackOut_12_0 = ok.field_qb;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (String) (Object) stackIn_6_0;
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("mj.C(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
            if (!param1) {
                field_b = null;
            }
            wg.a((byte) 100, ((mj) this).field_a, param0, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "mj.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          if (param1) {
            if (tk.field_f[param3] > tk.field_f[param0]) {
              return true;
            } else {
              if (tk.field_f[param3] < tk.field_f[param0]) {
                return false;
              } else {
                if (fg.field_b[param0] < fg.field_b[param3]) {
                  return true;
                } else {
                  if (fg.field_b[param3] < fg.field_b[param0]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            if (fg.field_b[param3] > fg.field_b[param0]) {
              return true;
            } else {
              if (fg.field_b[param0] > fg.field_b[param3]) {
                return false;
              } else {
                if (tk.field_f[param3] > tk.field_f[param0]) {
                  return true;
                } else {
                  if (tk.field_f[param0] > tk.field_f[param3]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L1: {
          var4 = ab.field_G[param0] + gj.field_f[param0] + nf.field_b[param0];
          var5 = ab.field_G[param3] + (gj.field_f[param3] + nf.field_b[param3]);
          if (param2 == -24153) {
            break L1;
          } else {
            boolean discarded$1 = mj.a(93, false, 103, -10);
            break L1;
          }
        }
        if (var5 <= var4) {
          if (var4 <= var5) {
            L2: {
              if (param3 <= param0) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L2;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L2;
              }
            }
            return stackIn_34_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -64) {
              stackOut_3_0 = ((mj) this).field_a.equals((Object) (Object) param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mj.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    mj(String param0) {
        try {
            ((mj) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "mj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == param3) {
            param0 = param0 >> 1;
        }
        if (param3 == 4) {
            param0 = param0 >> 2;
        }
        if (!(param3 != 6)) {
            param0 = param0 >> 2;
        }
        if (param3 == 7) {
            param3 = 8;
            param0 = param0 >> 2;
        }
        int var5 = nb.field_g * param0 / 100;
        if (var5 > 0) {
            if (param2 == 0) {
                jk.field_k.a(gf.field_c[param3], param4, var5);
            } else {
                jk.field_k.a(gf.field_c[param3], param4, var5, param2);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nc();
    }
}
