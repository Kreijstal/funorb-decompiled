/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends coa {
    static dfa field_t;
    static int[] field_w;
    static char[] field_x;
    static String field_u;
    static String field_v;

    final static mi a(in param0, boolean param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        param0.field_b = param0.field_b - 1;
        var2 = param0.field_b - 1;
        var3 = new StringBuilder();
        var4 = param0.b(21098);
        StringBuilder discarded$7 = var3.append(var4);
        var5 = param1 ? 1 : 0;
        L0: while (true) {
          if (!param0.a(0)) {
            var6 = param0.b(21098);
            if (var5 != 0) {
              StringBuilder discarded$8 = var3.append(var6);
              var5 = 0;
              continue L0;
            } else {
              L1: {
                if (var6 == 92) {
                  var5 = 1;
                  break L1;
                } else {
                  StringBuilder discarded$9 = var3.append(var6);
                  break L1;
                }
              }
              if (var6 != var4) {
                continue L0;
              } else {
                L2: {
                  if (34 != var4) {
                    stackOut_13_0 = nl.field_d;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  } else {
                    stackOut_12_0 = ma.field_e;
                    stackIn_14_0 = stackOut_12_0;
                    break L2;
                  }
                }
                var6 = stackIn_14_0;
                return new mi(var6, var2, var3.toString());
              }
            }
          } else {
            L3: {
              if (34 != var4) {
                stackOut_4_0 = nl.field_d;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = ma.field_e;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            var6 = stackIn_5_0;
            return new mi(var6, var2, var3.toString());
          }
        }
    }

    public hb() {
    }

    public static void b(boolean param0) {
        field_w = null;
        field_v = null;
        field_u = null;
        field_t = null;
        if (!param0) {
          field_u = null;
          field_x = null;
          return;
        } else {
          field_x = null;
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var15 = ((hb) this).field_h.a(param0, (byte) -2);
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var3 = var11;
        if (((hb) this).field_h.field_f) {
          if (((hb) this).a(false)) {
            var15 = var14;
            var4 = var15[0];
            var5 = var15[1];
            var6 = var15[2];
            var7 = ((hb) this).field_r * (param0 % ((hb) this).field_r);
            var8 = 0;
            L0: while (true) {
              if (ns.field_g <= var8) {
                if (param1 != -1) {
                  boolean discarded$3 = hb.d(113);
                  return var3;
                } else {
                  return var3;
                }
              } else {
                var9 = ((hb) this).field_p[var8 % ((hb) this).field_m + var7];
                var6[var8] = sea.c(4080, var9 << -617884060);
                var5[var8] = sea.c(var9, 65280) >> 1974776580;
                var4[var8] = sea.c(4080, var9 >> 1426423564);
                var8++;
                continue L0;
              }
            }
          } else {
            if (param1 == -1) {
              return var3;
            } else {
              boolean discarded$4 = hb.d(113);
              return var3;
            }
          }
        } else {
          if (param1 == -1) {
            return var3;
          } else {
            boolean discarded$5 = hb.d(113);
            return var3;
          }
        }
    }

    final static boolean d(int param0) {
        lqa var1 = null;
        int var2 = 0;
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        } else {
          var2 = 74 % ((-14 - param0) / 45);
          return var1.field_d;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Connection timed out. Please try using a different server.";
        field_x = new char[]{(char)91, (char)93, (char)35};
        field_v = "No Medal";
    }
}
