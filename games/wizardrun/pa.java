/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static String field_d;
    private static long[] field_b;
    static oi field_e;
    static o field_a;
    static String field_f;
    static int field_c;

    final static void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2, va param3, va param4) {
        try {
            vk.a(param3.field_k, param4, param2, true, param3.field_m, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -106) {
            field_a = (o) null;
        }
        return pl.field_E == wc.field_j ? true : false;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        va var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var4 = (va) null;
                pa.a((java.math.BigInteger) null, -113, (java.math.BigInteger) null, (va) null, (va) null);
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = fa.a((byte) 122, "", param1, '_');
                var3 = ag.a(param2, 1);
                if ((param1.indexOf(param2) ^ -1) != 0) {
                  break L3;
                } else {
                  if ((param1.indexOf(var3) ^ -1) == 0) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("pa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        if (param0 >= -42) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_d = "Loading instruments";
            field_b = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                field_e = new oi();
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    field_b[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (-2L != (var0 & 1L ^ -1L)) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = -3932672073523589310L ^ var0 >>> -411577535;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
