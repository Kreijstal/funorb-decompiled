/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends sk {
    static oj field_i;
    private String field_d;
    static String field_g;
    private String field_h;
    static String field_j;
    static boolean field_f;
    static sd[] field_e;

    final static void c(int param0) {
        if (ni.field_d != -tc.field_p) {
          if (-tc.field_p + 250 == ni.field_d) {
            ni.field_d = ni.field_d + 1;
            if (param0 != 250) {
              field_f = true;
              return;
            } else {
              return;
            }
          } else {
            ni.field_d = ni.field_d + 1;
            if (param0 != 250) {
              field_f = true;
              return;
            } else {
              return;
            }
          }
        } else {
          ni.field_d = ni.field_d + 1;
          if (param0 != 250) {
            field_f = true;
            return;
          } else {
            return;
          }
        }
    }

    final static void a(fk param0, int param1) {
        if (param1 <= 1) {
            return;
        }
        try {
            ib.field_c.b(-45, (gg) (Object) param0);
            int discarded$0 = 1;
            th.a(5, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hf.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 5 + 41);
        }
    }

    final void a(int param0, ka param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(102, ((hf) this).field_h);
              param1.a(false, ((hf) this).field_d);
              if (param0 == 95) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hf.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static java.applet.Applet a(byte param0) {
        if (ac.field_c != null) {
            return ac.field_c;
        }
        if (param0 > -2) {
            field_i = null;
            return (java.applet.Applet) (Object) bc.field_j;
        }
        return (java.applet.Applet) (Object) bc.field_j;
    }

    public static void b() {
        field_j = null;
        field_e = null;
        field_i = null;
        field_g = null;
    }

    final ua a(int param0) {
        if (param0 != 160) {
            hf.c(76);
            return hc.field_s;
        }
        return hc.field_s;
    }

    hf(String param0, String param1) {
        try {
            ((hf) this).field_h = param0;
            ((hf) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        if (param1) {
          if (se.field_B[param0] <= se.field_B[param2]) {
            if (se.field_B[param2] <= se.field_B[param0]) {
              if (vh.field_h[param0] <= vh.field_h[param2]) {
                if (vh.field_h[param2] <= vh.field_h[param0]) {
                  var4 = qf.field_g[param2] - -wb.field_e[param2] - -vc.field_f[param2];
                  var5 = vc.field_f[param0] + qf.field_g[param0] - -wb.field_e[param0];
                  if (var5 <= var4) {
                    if (var5 < var4) {
                      return false;
                    } else {
                      L0: {
                        if (param0 <= param2) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L0;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L0;
                        }
                      }
                      return stackIn_33_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (vh.field_h[param0] > vh.field_h[param2]) {
            return true;
          } else {
            if (vh.field_h[param0] < vh.field_h[param2]) {
              return false;
            } else {
              if (se.field_B[param0] <= se.field_B[param2]) {
                if (se.field_B[param2] <= se.field_B[param0]) {
                  var4 = qf.field_g[param2] - -wb.field_e[param2] - -vc.field_f[param2];
                  var5 = vc.field_f[param0] + qf.field_g[param0] - -wb.field_e[param0];
                  if (var5 <= var4) {
                    if (var5 >= var4) {
                      if (param0 <= param2) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Game ending in ";
        field_j = null;
        field_i = new oj();
        field_e = new sd[1000];
    }
}
