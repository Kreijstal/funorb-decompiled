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
        int fieldTemp$5 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        mi stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            fieldTemp$5 = param0.field_b - 1;
            param0.field_b = param0.field_b - 1;
            var2_int = fieldTemp$5;
            var3 = new StringBuilder();
            var4 = param0.b(21098);
            discarded$6 = var3.append((char) var4);
            var5 = param1 ? 1 : 0;
            L1: while (true) {
              L2: {
                if (param0.a(0)) {
                  break L2;
                } else {
                  var6 = param0.b(21098);
                  if (var5 != 0) {
                    discarded$7 = var3.append((char) var6);
                    var5 = 0;
                    continue L1;
                  } else {
                    L3: {
                      if (var6 == 92) {
                        var5 = 1;
                        break L3;
                      } else {
                        discarded$8 = var3.append((char) var6);
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
                  stackIn_13_0 = nl.field_d;
                  break L4;
                } else {
                  stackIn_13_0 = ma.field_e;
                  break L4;
                }
              }
              var6 = stackIn_13_0;
              stackIn_14_0 = new mi(var6, var2_int, var3.toString());
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("hb.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
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
        if (!param0) {
          field_u = (String) null;
          field_x = null;
          return;
        } else {
          field_x = null;
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int[][] var11;
        int[][] var12;
        int[][] var13;
        var10 = TombRacer.field_G ? 1 : 0;
        var13 = this.field_h.a(param0, (byte) -2);
        var12 = var13;
        var11 = var12;
        var3 = var11;
        if (this.field_h.field_f) {
          if (this.a(false)) {
            var13 = var12;
            var4 = var13[0];
            var5 = var13[1];
            var6 = var13[2];
            var7 = this.field_r * (param0 % this.field_r);
            var8 = 0;
            L0: while (true) {
              if (ns.field_g <= var8) {
                if (param1 != -1) {
                  hb.d(113);
                  return var3;
                } else {
                  return var3;
                }
              } else {
                var9 = this.field_p[var8 % this.field_m + var7];
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
              hb.d(113);
              return var3;
            }
          }
        } else {
          if (param1 == -1) {
            return var3;
          } else {
            hb.d(113);
            return var3;
          }
        }
    }

    final static boolean d(int param0) {
        lqa var1;
        int var2;
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        } else {
          var2 = 74 % ((-14 - param0) / 45);
          return var1.field_d;
        }
    }

    static {
        field_u = "Connection timed out. Please try using a different server.";
        field_x = new char[]{(char)91, (char)93, (char)35};
        field_v = "No Medal";
    }
}
