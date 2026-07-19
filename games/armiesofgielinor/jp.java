/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    private int field_f;
    String field_b;
    static boolean field_a;
    private int field_h;
    private we[] field_c;
    float field_d;
    static int[] field_g;
    private int field_e;

    final boolean a(int param0) {
        int var3 = 0;
        we var4 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 2189) {
            break L0;
          } else {
            this.field_b = (String) null;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_f > this.field_e) {
            var4 = this.field_c[this.field_e];
            stackOut_4_0 = var4.field_c.a((byte) 82);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var3 == 0) {
              if (stackIn_6_0) {
                L2: {
                  if (var4.field_d < 0) {
                    break L2;
                  } else {
                    if (!var4.field_c.a(11894, var4.field_d)) {
                      this.a(var4.field_c.b(var4.field_d, (byte) 73), var4, (byte) -89);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var4.field_b == null) {
                    break L3;
                  } else {
                    if (var4.field_c.a(28979, var4.field_b)) {
                      break L3;
                    } else {
                      this.a(var4.field_c.a(var4.field_b, (byte) -126), var4, (byte) -75);
                      return false;
                    }
                  }
                }
                L4: {
                  if (var4.field_d >= 0) {
                    break L4;
                  } else {
                    if (null != var4.field_b) {
                      break L4;
                    } else {
                      if (var4.field_j == null) {
                        break L4;
                      } else {
                        if (var4.field_c.d(-27927)) {
                          break L4;
                        } else {
                          this.a(var4.field_c.a(0), var4, (byte) -88);
                          return false;
                        }
                      }
                    }
                  }
                }
                this.field_e = this.field_e + 1;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return true;
                }
              } else {
                this.a(0, var4, (byte) -126);
                return false;
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, int param2, wk[] param3, int param4, int param5) {
        try {
            if (param5 != -8991) {
                field_g = (int[]) null;
            }
            param3[0].g(param0, param1, param4);
            param3[1].b(param3[1].field_y + param0, param1, -(param3[2].field_y << -1362163231) + param2, param3[2].field_v, param4);
            param3[2].g(-param3[2].field_y + (param2 + param0), param1, param4);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "jp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(vh param0, int param1) {
        int var2_int = 0;
        try {
            la.field_d = param0.e((byte) -104) << 721562789;
            var2_int = param0.k(0);
            rt.field_D = (var2_int & 7) << 1026024594;
            la.field_d = la.field_d + (var2_int >> -137564637);
            rt.field_D = rt.field_D + (param0.e((byte) -104) << 1261039714);
            var2_int = param0.k(0);
            nk.field_m = 2064384 & var2_int << 638124015;
            rt.field_D = rt.field_D + (var2_int >> 1838881158);
            nk.field_m = nk.field_m + (param0.k(0) << 733537511);
            int var3 = 16 % ((param1 - -45) / 34);
            var2_int = param0.k(0);
            ov.field_e = (1 & var2_int) << 126026960;
            nk.field_m = nk.field_m + (var2_int >> -67324479);
            ov.field_e = ov.field_e + param0.e((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "jp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, we param1, byte param2) {
        boolean discarded$1 = false;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(this.field_e - -1) + (float)param0 / 100.0f;
              if (param0 == 0) {
                this.field_b = param1.field_e;
                break L1;
              } else {
                this.field_b = param1.field_j + " - " + param0 + "%";
                if (!ArmiesOfGielinor.field_M) {
                  break L1;
                } else {
                  this.field_b = param1.field_e;
                  break L1;
                }
              }
            }
            L2: {
              if (param2 <= -64) {
                break L2;
              } else {
                discarded$1 = this.a(8);
                break L2;
              }
            }
            this.field_d = (float)this.field_h * var4_float / (float)(1 + this.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("jp.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (qn.field_l >= param2 + param0) {
            return param0;
        }
        if (!((param0 + param1 - param2 ^ -1) > param3)) {
            return -param2 + (param1 + param0);
        }
        return -param2 + qn.field_l;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 < -74) {
            return;
        }
        jp.a((byte) 0);
    }

    private jp() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new int[128];
    }
}
