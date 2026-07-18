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
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        mi stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        mi stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            int fieldTemp$9 = param0.field_b - 1;
            param0.field_b = param0.field_b - 1;
            var2_int = fieldTemp$9;
            var3 = new StringBuilder();
            var4 = param0.b(21098);
            StringBuilder discarded$10 = var3.append((char) var4);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (param0.a(0)) {
                  break L2;
                } else {
                  var6 = param0.b(21098);
                  if (var5 != 0) {
                    StringBuilder discarded$11 = var3.append((char) var6);
                    var5 = 0;
                    continue L1;
                  } else {
                    L3: {
                      if (var6 == 92) {
                        var5 = 1;
                        break L3;
                      } else {
                        StringBuilder discarded$12 = var3.append((char) var6);
                        break L3;
                      }
                    }
                    if (var6 != var4) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (34 != var4) {
                  stackOut_12_0 = nl.field_d;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                } else {
                  stackOut_11_0 = ma.field_e;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              var6 = stackIn_13_0;
              stackOut_13_0 = new mi(var6, var2_int, var3.toString());
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("hb.B(");
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + false + ')');
        }
        return stackIn_14_0;
    }

    public hb() {
    }

    public static void b(boolean param0) {
        field_w = null;
        field_v = null;
        field_u = null;
        field_t = null;
        field_x = null;
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
                var6[var8] = sea.c(4080, var9 << 4);
                var5[var8] = sea.c(var9, 65280) >> 4;
                var4[var8] = sea.c(4080, var9 >> 12);
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
        field_x = new char[]{'[', ']', '#'};
        field_v = "No Medal";
    }
}
