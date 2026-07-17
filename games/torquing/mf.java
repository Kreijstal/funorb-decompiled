/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends am {
    static he field_u;
    private int field_y;
    private int field_v;
    private int field_x;
    static double[] field_z;
    static int field_w;
    static int field_t;
    static String field_s;

    final void a(byte param0) {
        ((mf) this).field_y = -((mf) this).field_v + ((mf) this).field_x;
        if (param0 <= 123) {
            mf.g((byte) -42);
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = Torquing.field_u;
        if (param0 != -29116) {
            return null;
        }
        int[][] var30 = ((mf) this).field_r.a(15142, param1);
        int[][] var25 = var30;
        int[][] var20 = var25;
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (!(!((mf) this).field_r.field_b)) {
            var29 = ((mf) this).c(param0 ^ -12218, param1, 0);
            var31 = var29[0];
            var32 = var29[1];
            var33 = var29[2];
            var8 = var30[0];
            var9 = var30[1];
            var10 = var30[2];
            for (var11 = 0; ci.field_c > var11; var11++) {
                var8[var11] = ((mf) this).field_v - -(var31[var11] * ((mf) this).field_y >> 12);
                var9[var11] = (var32[var11] * ((mf) this).field_y >> 12) + ((mf) this).field_v;
                var10[var11] = ((mf) this).field_v - -(var33[var11] * ((mf) this).field_y >> 12);
            }
        }
        return var13;
    }

    public mf() {
        super(1, false);
        ((mf) this).field_v = 1024;
        ((mf) this).field_x = 3072;
        ((mf) this).field_y = 2048;
    }

    final static void a(boolean param0) {
        if (!(kb.field_h)) {
            throw new IllegalStateException();
        }
        r.field_c = true;
        cb.a(false, -27);
        op.field_i = 0;
    }

    public static void g(byte param0) {
        field_s = null;
        if (param0 != 21) {
            field_u = null;
        }
        field_u = null;
        field_z = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              L1: {
                var4_int = param2;
                if (var4_int == 0) {
                  ((mf) this).field_v = param0.i(7088);
                  break L1;
                } else {
                  if (1 != var4_int) {
                    if (var4_int == 2) {
                      L2: {
                        stackOut_10_0 = this;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (1 != param0.i((byte) -101)) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L2;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L2;
                        }
                      }
                      ((mf) this).field_p = stackIn_13_1 != 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((mf) this).field_x = param0.i(7088);
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("mf.H(");
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
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = Torquing.field_u;
        int[] var7 = ((mf) this).field_l.a(param1, 25657);
        int[] var3 = var7;
        if (param0 <= 86) {
            field_u = null;
        }
        if (((mf) this).field_l.field_b) {
            var4 = ((mf) this).b(0, 0, param1);
            for (var5 = 0; var5 < ci.field_c; var5++) {
                var7[var5] = (((mf) this).field_y * var4[var5] >> 12) + ((mf) this).field_v;
            }
        }
        return var3;
    }

    final static char b(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (var2 < 160) {
                var3 = ef.field_c[var2 + -128];
                if (!(var3 != 0)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new double[13];
        field_u = new he("email");
        field_s = "You are not currently logged in to the<nbsp>game.";
    }
}
