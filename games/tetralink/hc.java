/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends mc {
    static int field_p;
    static nk field_v;
    static boolean[] field_u;
    static int[] field_s;
    static char[] field_o;
    static int field_q;
    static String field_r;
    static hl field_n;
    int field_t;

    final static de a(int param0, byte param1, ah param2, int param3, ah param4) {
        RuntimeException var5 = null;
        de stackIn_6_0 = null;
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
            if (ia.a(param3, param2, param0, -81)) {
              L1: {
                if (param1 == 74) {
                  break L1;
                } else {
                  field_o = (char[]) null;
                  break L1;
                }
              }
              stackIn_6_0 = t.a(false, param4.a(-3, param3, param0));
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

            stackIn_9_1 = new StringBuilder().append("hc.B(").append(param0).append(',').append(param1).append(',');

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
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean c(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 64) {
            break L0;
          } else {
            field_r = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!qj.c(124)) {
              break L2;
            } else {
              if (0 != (8 & dh.field_e)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public static void a(int param0) {
        field_o = null;
        field_s = null;
        field_r = null;
        int var1 = 17 % ((param0 - -38) / 54);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final static String a(boolean param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = TetraLink.field_J;
        if (param0) {
            hc.a(false);
        }
        String var6 = "(" + mh.field_g + " " + lk.field_sb + " " + md.field_A + ") " + ua.field_c;
        String var1 = var6;
        if (0 < rl.field_d) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < rl.field_d; var2++) {
                var7 = var1 + ' ';
                var3 = kb.field_q.field_u[var2] & 255;
                var4 = var3 >> 1570241892;
                var3 = var3 & 15;
                if (-11 >= (var4 ^ -1)) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    private hc() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param4 == -32263) {
                break L1;
              } else {
                hc.c(-55);
                break L1;
              }
            }
            L2: while (true) {
              param2--;
              if (0 > param2) {
                break L0;
              } else {
                var17 = param1;
                var10 = var17;
                var11 = param5;
                var12 = param7;
                var13 = param6;
                var14 = param3;
                var15 = (var17[var11] & 16711422) >> 960723649;
                var10[var11] = pl.a(var14 >> -1494622383, 255) + (pl.a(33423361, var12) >> 1389264257) + (pl.a(var13 >> 149686889, 65280) + var15);
                param7 = param7 + param0;
                param6 = param6 + param8;
                param3 = param3 + param9;
                param5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("hc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_o = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_s = new int[4];
        field_u = new boolean[64];
        field_r = "You need to play 1 more rated game to unlock this option.";
    }
}
