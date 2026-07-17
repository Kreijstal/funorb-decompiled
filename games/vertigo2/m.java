/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ji {
    static int field_B;
    static int field_A;
    static String[] field_y;
    static r field_z;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
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
            var5_int = 0;
            var6 = param1;
            var7 = -param1;
            ki.a(-126, -param1 + param4, vl.field_e[param0], param1 + param4, param3);
            var8 = -1;
            L1: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L2: {
                  var8 += 2;
                  var7 = var7 + var8;
                  var5_int++;
                  if (0 > var7) {
                    break L2;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << 1);
                    var9_ref_int__ = vl.field_e[var6 + param0];
                    var10_ref_int__ = vl.field_e[param0 + -var6];
                    var11_int = param4 - -var5_int;
                    var12_int = -var5_int + param4;
                    ki.a(-107, var12_int, var9_ref_int__, var11_int, param3);
                    ki.a(-85, var12_int, var10_ref_int__, var11_int, param3);
                    break L2;
                  }
                }
                var9 = var6 + param4;
                var10 = param4 + -var6;
                var11 = vl.field_e[param0 + var5_int];
                var12 = vl.field_e[param0 + -var5_int];
                ki.a(-85, var10, var11, var9, param3);
                ki.a(-100, var10, var12, var9, param3);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "m.A(" + param0 + 44 + param1 + 44 + -78 + 44 + param3 + 44 + param4 + 41);
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

    public static void g() {
        field_y = null;
        field_z = null;
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
          var10 = ((m) this).field_x.a(param0, (byte) -45);
          var3 = var10;
          if (!((m) this).field_x.field_i) {
            return var3;
          } else {
            var4 = ((m) this).c(0, 3, param0);
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
          return null;
        }
    }

    final static co a(byte[] param0) {
        co var2 = null;
        RuntimeException var2_ref = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        co stackOut_3_0 = null;
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
            if (param0 != null) {
              field_B = -85;
              var2 = new co(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, se.field_y);
              la.a((byte) 113);
              stackOut_3_0 = (co) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("m.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
        return stackIn_4_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_A = -1;
    }
}
