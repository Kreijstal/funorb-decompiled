/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends ci {
    private int field_r;
    static String field_o;
    private int field_n;
    private int field_p;
    static String field_q;
    private int[] field_m;

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        super.b(param0, param1, param2);
        if (((gia) this).field_n >= 0) {
            if (null != qw.field_j) {
                var4 = !qw.field_j.a((byte) -122, ((gia) this).field_n).field_g ? 128 : 64;
                ((gia) this).field_m = qw.field_j.a(14907, ((gia) this).field_n, false, var4, 1.0f, var4);
                ((gia) this).field_p = var4;
                ((gia) this).field_r = var4;
            }
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_q = null;
        if (param0 != -26382) {
            gia.c(102);
        }
    }

    final int c(byte param0) {
        if (param0 != -117) {
            ((gia) this).field_m = null;
        }
        return ((gia) this).field_n;
    }

    final void b(int param0) {
        if (param0 > -32) {
            return;
        }
        super.b(-116);
        ((gia) this).field_m = null;
    }

    public gia() {
        super(0, false);
        ((gia) this).field_n = -1;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                if (0 == param2) {
                  ((gia) this).field_n = param1.d(122);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("gia.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          L0: {
            var16 = ((gia) this).field_h.a(param0, (byte) 124);
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var3 = var12;
            if (!((gia) this).field_h.field_f) {
              break L0;
            } else {
              L1: {
                if (qda.field_i == ((gia) this).field_p) {
                  stackOut_5_0 = param0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((gia) this).field_p * param0 / qda.field_i;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var4 = stackIn_6_0 * ((gia) this).field_r;
              var5 = var16[0];
              var6 = var16[1];
              var7 = var16[2];
              if (((gia) this).field_r != ns.field_g) {
                var8 = 0;
                L2: while (true) {
                  if (ns.field_g <= var8) {
                    break L0;
                  } else {
                    var9 = var8 * ((gia) this).field_r / ns.field_g;
                    var10 = ((gia) this).field_m[var4 - -var9];
                    var7[var8] = sea.c(var10, 255) << 4;
                    var6[var8] = sea.c(var10, 65280) >> 4;
                    var5[var8] = sea.c(16711680, var10) >> 12;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ns.field_g) {
                    break L0;
                  } else {
                    int incrementValue$1 = var4;
                    var4++;
                    var9 = ((gia) this).field_m[incrementValue$1];
                    var7[var8] = sea.c(4080, var9 << 4);
                    var6[var8] = sea.c(4080, var9 >> 4);
                    var5[var8] = sea.c(4080, var9 >> 12);
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has lost connection.";
    }
}
