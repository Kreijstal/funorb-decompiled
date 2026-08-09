/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements fe {
    static int[] field_b;
    static String field_c;
    static boolean field_d;
    static nf[] field_a;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -80) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, vc param3, int param4) {
        synchronized (param3) {
            param3.b(eg.field_i * param0 * fa.field_S >> -196386869, param4);
            param3.a(param2 * dk.field_k / param1, 0, 128);
        }
    }

    final static ce a(int param0, int param1, mi param2, int param3, mi param4) {
        RuntimeException var5 = null;
        mi var6 = null;
        ce stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 20748) {
                break L1;
              } else {
                var6 = (mi) null;
                cj.a(-84, -90, (mi) null, -34, (mi) null);
                break L1;
              }
            }
            if (mc.a(param0, param1, param4, (byte) 119)) {
              stackIn_6_0 = jg.a(2563, param2.a((byte) -2, param1, param0));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("cj.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        nf var8 = null;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                cj.a((byte) -62);
                break L1;
              }
            }
            L2: {
              var6_int = param3.field_q + param1;
              var7 = param4 - -param3.field_m;
              ea.a(true, var7, var6_int, param3.field_z, param3.field_F);
              var8 = gg.field_q[1];
              if (!(param3 instanceof rg)) {
                break L2;
              } else {
                if (((rg) ((Object) param3)).field_O) {
                  var8.c((-var8.field_t + param3.field_F >> 976711969) + (1 + var6_int), (param3.field_z + -var8.field_x >> -1811449247) + 1 + var7, 256);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param3.e((byte) -1)) {
              tj.a(-4 + param3.field_z, 1, var6_int - -2, var7 - -2, param3.field_F + -4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("cj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
    }

    static {
        field_b = new int[8192];
        mn discarded$0 = new mn();
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
