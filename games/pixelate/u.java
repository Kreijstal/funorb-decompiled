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
            if (param1 != -879) {
                field_h = 78;
            }
            tj.a(param8, param11, param10, param5, param7, param6, param4, param0, param9, param2, param7, (byte) 122, param3, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "u.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ')');
        }
    }

    final kp a(int param0, int param1) {
        kp var3;
        byte[] var4;
        if (param0 == -21209) {
          var3 = (kp) (this.field_i.a((long)param1, 0));
          if (var3 == null) {
            L0: {
              if ((param1 ^ -1) <= -32769) {
                var4 = this.field_m.a(1, param1 & 32767, true);
                break L0;
              } else {
                var4 = this.field_c.a(1, param1, true);
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
              this.field_i.a((long)param1, var3, (byte) 83);
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
              this.field_i.a((long)param1, var3, (byte) 83);
              return var3;
            }
          } else {
            return var3;
          }
        } else {
          return (kp) null;
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
          field_k = (tf) null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = new le(64);
        try {
          L0: {
            L1: {
              this.field_c = param1;
              this.field_m = param2;
              if (null == this.field_c) {
                break L1;
              } else {
                this.field_c.b(1, (byte) 87);
                break L1;
              }
            }
            if (this.field_m == null) {
              break L0;
            } else {
              this.field_m.b(1, (byte) 35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("u.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        qh.a((byte) -110, 10, bj.field_c[param1], true);
        if (param0) {
            u.a(-24);
        }
    }

    static {
        field_b = -1;
        field_j = false;
        field_e = "Reject";
        field_g = "Open";
        field_h = -1;
        field_n = "to keep fullscreen or";
        field_d = new wm(13, 0, 1, 0);
    }
}
