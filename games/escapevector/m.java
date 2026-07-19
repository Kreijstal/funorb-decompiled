/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends wg {
    volatile int field_l;
    static int field_k;
    static String field_n;
    volatile int field_o;
    private int field_m;
    static int field_q;
    private int field_p;

    final int a() {
        int var1 = (this.field_l >> -2061900408) * this.field_o >> -584304528;
        if (var1 != 0) {
            return 1;
        }
        return 0;
    }

    final wg b() {
        return null;
    }

    public static void e(int param0) {
        field_n = null;
        if (param0 != -1600199832) {
            m.e(1);
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        if (-3 == (param2 ^ -1)) {
            return param1 * dk.field_h[param0 & 32767] >> 1572164099;
        }
        if (param3 > -6) {
            return 63;
        }
        if (-4 != (param2 ^ -1)) {
            return 0;
        }
        return -param1 + (param1 * (32767 & param0) >> 920049710);
    }

    final static dk a(dk[] param0, int param1, int param2) {
        dk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        dk[] var7 = null;
        dk stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = param0;
            var3 = var7;
            var4 = param2;
            L1: while (true) {
              if (var4 < var7.length) {
                var5 = var7[var4];
                if (param1 == var5.field_c) {
                  stackOut_6_0 = (dk) (var5);
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("m.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final void d(int param0) {
    }

    final wg c() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var18 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = this.field_o;
            var5 = (this.field_l >> -1600199832) * var4_int >> -2070607696;
            if (0 != var5) {
              L1: {
                var6 = (double)ie.field_q / 1000.0;
                var8 = (int)(25460.736 / var6);
                var9 = var5;
                var10 = (int)(196509.696 / var6);
                param2 = param2 + param1;
                var11 = (int)(98.304 / var6);
                if (ie.field_o) {
                  param2 = param2 << 1;
                  param1 = param1 << 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var12 = param1;
              L2: while (true) {
                if (param2 <= var12) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var13 = 16384 - -(var4_int >> -119195775);
                    var14 = var9;
                    var15 = 32768;
                    var16 = 65536 - var13;
                    var13 = var13 + (this.a(this.field_m, var16, 3, -60) >> 1316450241);
                    this.field_m = this.field_m + (var15 * var8 >> -1223166896);
                    var17 = this.a(this.field_p, var14, 2, -68);
                    incrementValue$2 = var12;
                    var12++;
                    param0[incrementValue$2] = param0[incrementValue$2] + var17;
                    if (ie.field_o) {
                      incrementValue$3 = var12;
                      var12++;
                      param0[incrementValue$3] = param0[incrementValue$3] + var17;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_p = this.field_p + (var11 + (var13 * var10 >> 1661764592));
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("m.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    m() {
        this.field_m = 0;
        this.field_p = 0;
    }

    static {
        field_n = "Press M to see the mini-map";
        field_k = 0;
        field_q = 0;
    }
}
