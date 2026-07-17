/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends mo {
    static long field_g;
    int field_n;
    static String field_h;
    int[] field_j;
    static String field_i;
    static hd field_k;
    static String field_f;
    int field_m;
    static int field_l;

    final void a(ml param0, byte param1) {
        int discarded$7 = -39;
        if (!(mu.a(param0))) {
            return;
        }
        try {
            ((ua) this).field_j[0] = hq.a(22531, 7, param0, 0);
            ((ua) this).field_j[1] = hq.a(22531, 7, param0, 0);
            ((ua) this).field_m = hq.a(22531, 10, param0, 0);
            int var3_int = -57 % ((25 - param1) / 63);
            ((ua) this).field_n = -1 + param0.l(2, 59);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ua.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(tj param0, int param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param1 <= -116) {
              if (((ua) this).field_m > 0) {
                ((ua) this).field_m = ((ua) this).field_m + 1;
                return;
              } else {
                L1: {
                  if (param0.field_m != -1) {
                    break L1;
                  } else {
                    if (param0.a(true) < 370) {
                      break L1;
                    } else {
                      if (param0.a(true) <= 525) {
                        if (param0.field_p < 0) {
                          ((ua) this).field_m = 1;
                          ((ua) this).field_n = 0;
                          return;
                        } else {
                          if (param0.field_p > 88080384) {
                            ((ua) this).field_m = 1;
                            ((ua) this).field_n = 1;
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("ua.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 != -30) {
          ua.a((byte) 106);
          field_k = null;
          field_f = null;
          return;
        } else {
          field_k = null;
          field_f = null;
          return;
        }
    }

    public final String toString() {
        return "AgentGoalState\tscore=[" + ((ua) this).field_j[0] + "," + ((ua) this).field_j[1] + "]\tgoal_count=" + ((ua) this).field_m + "\tgoal_scorer=" + ((ua) this).field_n;
    }

    final static kg[] a(int param0, int param1, sj param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kg[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (cu.a(param1, param2, param0, 114)) {
              field_h = null;
              int discarded$2 = 83;
              stackOut_3_0 = fb.i();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kg[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ua.D(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(byte param0, mo param1) {
        ua var4 = null;
        ua var3 = null;
        if (param0 >= -52) {
            return;
        }
        try {
            var4 = (ua) (Object) param1;
            var3 = var4;
            ((ua) this).field_m = var3.field_m;
            var4.field_j[0] = var4.field_j[0];
            ((ua) this).field_n = var3.field_n;
            var4.field_j[1] = var4.field_j[1];
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ua.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int c(int param0) {
        int var2 = 0;
        var2 = fj.a(-40, ((ua) this).field_j[param0] ^ var2);
        var2 = fj.a(-40, ((ua) this).field_j[1] ^ var2);
        var2 = fj.a(-40, var2 ^ ((ua) this).field_m);
        var2 = fj.a(-40, var2 ^ ((ua) this).field_n);
        return var2;
    }

    public ua() {
        ((ua) this).field_j = new int[2];
        ((ua) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Passwords can only contain letters and numbers";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = "Player Name: ";
    }
}
