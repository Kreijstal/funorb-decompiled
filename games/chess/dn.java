/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static boolean field_b;
    static String field_d;
    static rk[] field_g;
    static int[] field_h;
    static String field_a;
    static jd field_f;
    static ci field_c;
    static int[] field_e;

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        sh.a(-65);
    }

    final static di a(ci param0, int[] param1, ci param2, ci param3, int param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        di[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        dj var11 = null;
        int var12 = 0;
        Object var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var12 = Chess.field_G;
          var5 = param1.length;
          var6 = new String[var5];
          var15 = new char[var5];
          var14 = var15;
          var7 = var14;
          var8 = new di[var5];
          if (param4 == 13911) {
            break L0;
          } else {
            var13 = null;
            pm discarded$2 = dn.a(21, -29, (byte) 51, (um) null, (um) null);
            break L0;
          }
        }
        var9 = 49;
        try {
          L1: {
            var10_int = 0;
            L2: while (true) {
              if (var10_int >= var5) {
                break L1;
              } else {
                var11 = oa.field_b.a((byte) 79, param1[var10_int]);
                var6[var10_int] = var11.e((byte) -107);
                var9 = (char)(var9 + 1);
                var7[var10_int] = (char)var9;
                var8[var10_int] = null;
                var10_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = (Exception) (Object) decompiledCaughtException;
          return null;
        }
        return new di(0L, param0, param2, param3, var8, param1, var6, var15);
    }

    final static void a(int param0, byte param1) {
        try {
            try {
                Object discarded$0 = u.a(bh.i(81), true, new Object[1], "resizing");
            } catch (Throwable throwable) {
            }
            int var2 = -73 % ((-52 - param1) / 35);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
        field_f = null;
        if (param0 <= 64) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    final static pm a(int param0, int param1, byte param2, um param3, um param4) {
        if (param2 <= 118) {
            field_f = null;
        }
        if (!tj.a(param1, param0, param3, (byte) 83)) {
            return null;
        }
        return g.a(param4.a(param1, param0, 5847), 127);
    }

    final static void a(byte param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, -85);
        var2.c(1, (byte) -73);
        var2.c(3, (byte) 124);
        if (param0 <= 10) {
            dn.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = "<%0> is offering a rematch.";
        field_h = new int[]{14, 28};
        field_a = "Friends";
        field_f = new jd("");
        field_e = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_e[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 == (var0 & 1)) {
                  var0 = -306674912 ^ var0 >>> 322901441;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
