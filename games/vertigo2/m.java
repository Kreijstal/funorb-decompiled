/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ji {
    static int field_B;
    static int field_A;
    static String[] field_y;
    static r field_z;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = param1;
              var7 = -param1;
              ki.a(-126, -param1 + param4, vl.field_e[param0], param1 + param4, param3);
              if (param2 == -78) {
                break L1;
              } else {
                discarded$1 = m.h(-101);
                break L1;
              }
            }
            var8 = -1;
            L2: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L3: {
                  var8 += 2;
                  var7 = var7 + var8;
                  var5_int++;
                  if (0 > var7) {
                    break L3;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << 1749707809);
                    var9_ref_int__ = vl.field_e[var6 + param0];
                    var10_ref_int__ = vl.field_e[param0 + -var6];
                    var11_int = param4 - -var5_int;
                    var12_int = -var5_int + param4;
                    ki.a(-107, var12_int, var9_ref_int__, var11_int, param3);
                    ki.a(param2 + -7, var12_int, var10_ref_int__, var11_int, param3);
                    break L3;
                  }
                }
                var9 = var6 + param4;
                var10 = param4 + -var6;
                var11 = vl.field_e[param0 + var5_int];
                var12 = vl.field_e[param0 + -var5_int];
                ki.a(-85, var10, var11, var9, param3);
                ki.a(-100, var10, var12, var9, param3);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "m.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(int param0, int param1, int param2) {
        tk.a(-1, param2, param2, (double)param1, (double)param1);
        if (param0 <= 80) {
            m.d(-49, -25, 24);
        }
    }

    public m() {
        super(1, true);
    }

    public static void g(int param0) {
        co discarded$0 = null;
        field_y = null;
        field_z = null;
        if (param0 != 2) {
            byte[] var2 = (byte[]) null;
            discarded$0 = m.a((byte[]) null, 85);
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var10 = this.field_x.a(param0, (byte) -45);
          var3 = var10;
          if (!this.field_x.field_i) {
            return var3;
          } else {
            var4 = this.c(0, 3, param0);
            var5 = var4[0];
            var6 = var4[1];
            var7 = var4[2];
            var8 = 0;
            L0: while (true) {
              if (we.field_M <= var8) {
                return var3;
              } else {
                var10[var8] = (var7[var8] + (var5[var8] + var6[var8])) / 3;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return (int[]) null;
        }
    }

    final static co a(byte[] param0, int param1) {
        co var2 = null;
        RuntimeException var2_ref = null;
        co stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        co stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  field_B = -85;
                  break L1;
                }
              }
              var2 = new co(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, se.field_y);
              la.a((byte) 113);
              stackOut_5_0 = (co) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("m.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean h(int param0) {
        int var1 = 0;
        var1 = 23 % ((-79 - param0) / 37);
        if (sl.b(-24)) {
          if ((8 & rg.field_f) != 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        field_y = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_A = -1;
    }
}
