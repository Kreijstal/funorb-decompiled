/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends ji {
    static nj field_z;
    private int field_A;
    static int[][] field_D;
    static int[] field_F;
    private int field_G;
    private int field_K;
    static String field_y;
    static String[] field_H;
    static String field_I;
    static int[] field_B;

    public te() {
        this(0);
    }

    private final void d(int param0, int param1) {
        if (param0 != -17016) {
          field_y = (String) null;
          this.field_K = 4080 & param1 >> 300287300;
          this.field_G = (16711680 & param1) >> -688124244;
          this.field_A = (255 & param1) << -1977088540;
          return;
        } else {
          this.field_K = 4080 & param1 >> 300287300;
          this.field_G = (16711680 & param1) >> -688124244;
          this.field_A = (255 & param1) << -1977088540;
          return;
        }
    }

    private te(int param0) {
        super(0, false);
        this.d(-17016, param0);
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                field_z = (nj) null;
                break L1;
              }
            }
            L2: {
              var4_int = param1;
              if (0 != var4_int) {
                break L2;
              } else {
                this.d(-17016, param2.m(0));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("te.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[][] var9 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        var9 = this.field_v.a(param1, param0 + 3778);
        var3 = var9;
        if (param0 == -3780) {
          if (!this.field_v.field_c) {
            return var9;
          } else {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            var7 = 0;
            L0: while (true) {
              if (we.field_M <= var7) {
                return var9;
              } else {
                var4[var7] = this.field_G;
                var5[var7] = this.field_K;
                var6[var7] = this.field_A;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          field_I = (String) null;
          if (this.field_v.field_c) {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            var7 = 0;
            L1: while (true) {
              if (we.field_M > var7) {
                var4[var7] = this.field_G;
                var5[var7] = this.field_K;
                var6[var7] = this.field_A;
                var7++;
                continue L1;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        }
    }

    public static void g(int param0) {
        field_F = null;
        field_B = null;
        field_z = null;
        if (param0 != -30443) {
          field_z = (nj) null;
          field_I = null;
          field_D = (int[][]) null;
          field_y = null;
          field_H = null;
          return;
        } else {
          field_I = null;
          field_D = (int[][]) null;
          field_y = null;
          field_H = null;
          return;
        }
    }

    static {
        field_F = new int[8192];
        field_y = "Accept <%0> into this game";
        field_H = new String[]{"Low", "Medium", "High"};
        field_z = new nj();
        field_I = "Accept draw";
        field_B = new int[]{250, 300, 500, 250, 400, 500, 1050, 900, 1500, 1500, 600, 1250, 800, 2000, 3500, 3500, 2700, 4500, 2250, 2500, 2750, 2400, 2000, 4250, 3400, 3000, 1600, 3750, 8000, 2500, 2500, 4600, 4250, 2250, 3750, 4350, 4500, 3000, 3000, 3500, 3250, 4500, 2750, 3500, 2000, 3000, 3750, 6500, 2750, 4000};
    }
}
