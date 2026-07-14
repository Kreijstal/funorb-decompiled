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
        vk.a(param3.field_k, param4, param2, true, param3.field_m, param0, param1);
    }

    final static boolean a(byte param0) {
        if (param0 != -106) {
            field_a = null;
        }
        return pl.field_E == wc.field_j ? true : false;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var4 = null;
            pa.a((java.math.BigInteger) null, -113, (java.math.BigInteger) null, (va) null, (va) null);
            break L0;
          }
        }
        L1: {
          L2: {
            param1 = fa.a((byte) 122, "", param1, '_');
            var3 = ag.a(param2, 1);
            if ((param1.indexOf(param2) ^ -1) != 0) {
              break L2;
            } else {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = "Loading instruments";
        field_b = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            field_e = new oi();
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
