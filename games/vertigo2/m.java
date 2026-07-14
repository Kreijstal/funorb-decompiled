/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ji {
    static int field_B;
    static int field_A;
    static String[] field_y;
    static r field_z;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        var5 = 0;
        var6 = param1;
        var7 = -param1;
        ki.a(-126, -param1 + param4, vl.field_e[param0], param1 + param4, param3);
        if (param2 != -78) {
          boolean discarded$1 = m.h(-101);
          var8 = -1;
          L0: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L1: {
                var8 += 2;
                var7 = var7 + var8;
                var5++;
                if (0 > var7) {
                  break L1;
                } else {
                  var6--;
                  var7 = var7 - (var6 << 1749707809);
                  var14 = vl.field_e[var6 + param0];
                  var15 = vl.field_e[param0 + -var6];
                  var11 = param4 - -var5;
                  var12 = -var5 + param4;
                  ki.a(-107, var12, var14, var11, param3);
                  ki.a(param2 + -7, var12, var15, var11, param3);
                  break L1;
                }
              }
              var9 = var6 + param4;
              var10 = param4 + -var6;
              var16 = vl.field_e[param0 + var5];
              var17 = vl.field_e[param0 + -var5];
              ki.a(-85, var10, var16, var9, param3);
              ki.a(-100, var10, var17, var9, param3);
              continue L0;
            }
          }
        } else {
          var8 = -1;
          L2: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L3: {
                var8 += 2;
                var7 = var7 + var8;
                var5++;
                if (0 > var7) {
                  break L3;
                } else {
                  var6--;
                  var7 = var7 - (var6 << 1749707809);
                  var18 = vl.field_e[var6 + param0];
                  var19 = vl.field_e[param0 + -var6];
                  var11 = param4 - -var5;
                  var12 = -var5 + param4;
                  ki.a(-107, var12, var18, var11, param3);
                  ki.a(param2 + -7, var12, var19, var11, param3);
                  break L3;
                }
              }
              var9 = var6 + param4;
              var10 = param4 + -var6;
              var20 = vl.field_e[param0 + var5];
              var21 = vl.field_e[param0 + -var5];
              ki.a(-85, var10, var20, var9, param3);
              ki.a(-100, var10, var21, var9, param3);
              continue L2;
            }
          }
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
        field_y = null;
        field_z = null;
        if (param0 != 2) {
            Object var2 = null;
            co discarded$0 = m.a((byte[]) null, 85);
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

    final static co a(byte[] param0, int param1) {
        co var2 = null;
        if (param0 != null) {
          if (param1 != 0) {
            field_B = -85;
            var2 = new co(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, se.field_y);
            la.a((byte) 113);
            return var2;
          } else {
            var2 = new co(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, se.field_y);
            la.a((byte) 113);
            return var2;
          }
        } else {
          return null;
        }
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
