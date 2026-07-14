/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    private static String[] field_a;
    static int field_c;
    static String field_b;

    final static ut[] a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return null;
        }
        return cq.a(1, param2, param0, 124);
    }

    final static boolean a(CharSequence param0, boolean param1) {
        if (!param1) {
            Object var3 = null;
            ih.a(28, (nu) null, 23);
        }
        return gv.a(false, param0, 0);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 66049) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, nu param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var9 = Kickabout.field_G;
        jo.field_F = param1;
        k.field_g = param2;
        if (param0 == -3) {
          L0: {
            var14 = new int[2];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var3 = var10;
            stackOut_2_0 = (int[]) var10;
            stackOut_2_1 = 0;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (k.field_g == 1) {
              stackOut_4_0 = (int[]) (Object) stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = 148;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (int[]) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 1900;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          stackIn_5_0[stackIn_5_1] = stackIn_5_2;
          nb.field_j = new ut[2];
          var10[1] = -var14[0] + 2048;
          var4 = 0;
          L1: while (true) {
            if (-3 >= (var4 ^ -1)) {
              return;
            } else {
              var5 = jo.field_F.field_H[var4];
              var6 = jo.field_F.field_d[var4];
              var7 = jo.field_F.field_Q[var4];
              var8 = df.a(var5, ev.field_B[var7], true, ev.field_B[var6]).b(100, 4369, 20, -56, -20);
              nb.field_j[var4] = new ut(200, 200);
              iw.a(param0 + -124, nb.field_j[var4]);
              t.c();
              t.b(on.field_g >> 438700929, 410);
              var8.a(0, var14[var4], 0, 0, 0, 0, 0, 350);
              ta.e(127);
              eo.a(nb.field_j[var4], 65793);
              eo.a(nb.field_j[var4], 66049);
              eo.a(nb.field_j[var4], 65793);
              var4++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static boolean[][][] a(int param0, String param1) {
        boolean[][][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[][][] var8 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var8 = new boolean[2][13][10];
        var2 = var8;
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param1.length()) {
            L1: {
              if (param0 == 21656) {
                break L1;
              } else {
                field_c = 22;
                break L1;
              }
            }
            return var2;
          } else {
            var5 = Integer.parseInt(param1.substring(var4, var4 + 1), 16);
            var6 = 0;
            L2: while (true) {
              if (4 <= var6) {
                var4++;
                continue L0;
              } else {
                L3: {
                  if ((var5 & 1 << var6) == 0) {
                    var8 = var2;
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                var8 = var2;
                var7 = stackIn_7_0;
                var8[var3 / 130][var3 % 130 / 10][var3 % 130 % 10] = var7 != 0;
                var3++;
                var6++;
                continue L2;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
        field_a = new String[4];
        field_c = -1;
        field_a[2] = "bigticktime";
        field_a[0] = "info";
        field_a[3] = "mainlooptime";
        field_a[1] = "quickticktime";
    }
}
