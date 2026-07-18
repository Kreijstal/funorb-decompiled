/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static ak field_l;
    static wm field_d;
    static volatile boolean field_j;
    static tf field_k;
    private fm field_c;
    private fm field_m;
    static volatile int field_b;
    static String field_e;
    private le field_i;
    static String field_g;
    static int field_h;
    static ak field_a;
    static tf field_f;
    static String field_n;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, tf[] param6, jl param7, int param8, tf[] param9, int param10, boolean param11) {
        try {
            tj.a(240, param11, 8, 8, param7, param6, 320, param0, param9, param2, param7, (byte) 122, 2, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "u.B(" + param0 + ',' + -879 + ',' + param2 + ',' + 2 + ',' + 320 + ',' + 8 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + 240 + ',' + (param9 != null ? "{...}" : "null") + ',' + 8 + ',' + param11 + ')');
        }
    }

    final kp a(int param0, int param1) {
        kp var3 = null;
        byte[] var4 = null;
        if (param0 == -21209) {
          var3 = (kp) ((u) this).field_i.a((long)param1, 0);
          if (var3 == null) {
            L0: {
              if (param1 >= 32768) {
                var4 = ((u) this).field_m.a(1, param1 & 32767, true);
                break L0;
              } else {
                var4 = ((u) this).field_c.a(1, param1, true);
                break L0;
              }
            }
            var3 = new kp();
            if (var4 != null) {
              L1: {
                var3.a(param0 ^ 21212, new we(var4));
                if (32768 <= param1) {
                  var3.g(126);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((u) this).field_i.a((long)param1, (Object) (Object) var3, (byte) 83);
              return var3;
            } else {
              L2: {
                if (32768 <= param1) {
                  var3.g(126);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((u) this).field_i.a((long)param1, (Object) (Object) var3, (byte) 83);
              return var3;
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_n = null;
        if (param0 < 24) {
          field_k = null;
          field_d = null;
          field_l = null;
          return;
        } else {
          field_d = null;
          field_l = null;
          return;
        }
    }

    u(int param0, fm param1, fm param2, hj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((u) this).field_i = new le(64);
        try {
          L0: {
            L1: {
              ((u) this).field_c = param1;
              ((u) this).field_m = param2;
              if (null == ((u) this).field_c) {
                break L1;
              } else {
                int discarded$4 = ((u) this).field_c.b(1, (byte) 87);
                break L1;
              }
            }
            if (((u) this).field_m == null) {
              break L0;
            } else {
              int discarded$5 = ((u) this).field_m.b(1, (byte) 35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("u.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int discarded$0 = 1;
        qh.a((byte) -110, 10, bj.field_c[param1]);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_j = false;
        field_e = "Reject";
        field_g = "Open";
        field_h = -1;
        field_n = "to keep fullscreen or";
        field_d = new wm(13, 0, 1, 0);
    }
}
