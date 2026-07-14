/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_d;
    byte[] field_c;
    int field_a;
    int field_k;
    static String field_l;
    static int[] field_j;
    int field_e;
    int field_i;
    int field_f;
    static String field_h;
    int field_b;
    static String field_m;
    byte[] field_g;

    final static int a(int param0, int param1, int param2) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        int var3 = 1;
        if (param2 != 26186) {
            field_j = null;
        }
        while (param1 > 1) {
            if ((1 & param1) != 0) {
                var3 = var3 * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
        }
        if ((param1 ^ -1) == -2) {
            return param0 * var3;
        }
        return var3;
    }

    final static void a(ti param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (param1 >= 31) {
          L0: {
            if (-1 != ((param0.field_m | param0.field_n) & 3 ^ -1)) {
              var2 = 4 - (param0.field_n & 3);
              var3 = -(3 & param0.field_m) + 4;
              var4 = param0.field_n + var2;
              var5 = new int[(param0.field_n + var2) * (param0.field_m + var3)];
              var6 = 0;
              L1: while (true) {
                if (var6 >= param0.field_m) {
                  param0.field_u = param0.field_u - var2;
                  param0.field_n = param0.field_n + var2;
                  param0.field_l = param0.field_l - var3;
                  param0.field_w = var5;
                  param0.field_m = param0.field_m + var3;
                  break L0;
                } else {
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= param0.field_n) {
                      var6++;
                      continue L1;
                    } else {
                      var5[(var6 + var3) * var4 - -var2 - -var7] = param0.field_w[var7 + var6 * param0.field_n];
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static gd a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        gd var8 = new gd(param4, param2, param3, param1, param0, param5);
        int var9 = -40 % ((param7 - 6) / 59);
        rh.field_r.a((wf) (Object) var8, -107);
        ne.a((byte) 7, var8, param6);
        return var8;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_h = null;
        field_m = null;
        int var1 = 43 % ((47 - param0) / 61);
    }

    final static rj b(int param0) {
        try {
            Throwable var1 = null;
            Object var2 = null;
            rj stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            rj stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == 1) {
                  break L0;
                } else {
                  var2 = null;
                  nh.a((ti) null, (byte) 65);
                  break L0;
                }
              }
              stackOut_2_0 = (rj) Class.forName("sk").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_l = "Discard";
        field_h = "Cancel";
        field_m = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
