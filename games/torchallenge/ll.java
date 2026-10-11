/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static boolean field_i;
    static int[][][] field_e;
    static ti[] field_h;
    static int field_a;
    static String field_c;
    static String field_f;
    static int field_b;
    static int field_d;
    static volatile int field_g;
    static boolean[][][] field_j;
    static int[][] field_k;

    final static int b(int param0) {
        if (param0 != -10365) {
          field_h = (ti[]) null;
          return sj.field_L;
        }
        return sj.field_L;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, int param11) {
        int var12;
        int var13;
        int var14;
        int var15;
        ka var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        var23 = TorChallenge.field_F ? 1 : 0;
        var12 = kj.field_C[0].field_q;
        var13 = -1;
        var14 = param11 - param2;
        var15 = 0;
        var16 = si.field_F;
        if (param1 == 0) {
          var16 = si.field_F;
        }
        if (1 == param1) {
          var16 = kj.field_C[0];
        }
        if (param1 == 2) {
          var16 = kj.field_C[1];
        }
        if (!param5) {
          if (!param4 &&
            param6) {
            var13 = 1;
          }
          if (param4 &&
            param6) {
            var13 = 2;
          }
          if (param4 &&
            !param6) {
            var13 = 3;
          }
          var17 = var13 * var12 >> 2;
          var18 = var14 << 2;
          var19 = var18 * var17 / var12;
          var20 = -var19 + param2;
          var21 = param2;
          if (var15 != 0) {
            var21 = var21 - var14;
          }
          var22 = param11;
          if (var20 + var18 < var21) {
            return;
          }
          if (var22 < var20) {
            return;
          }
          if (param0 > param7 + var16.field_v) {
            return;
          }
          if (param7 > param9) {
            return;
          }
          if (!param10) {
            return;
          }
          if (var13 < 0) {
            return;
          }
          if (var13 >= 4) {
            return;
          }
          if (param1 == 2 &&
            !je.field_i) {
            cj.field_c.d();
            je.field_g.e(0, 0, param8);
            od.a(cj.field_c, 33, 30, 68, 90);
            var16.g(0, 0);
            la.field_f.a(119);
            je.field_i = true;
          }
          qg.a(vd.field_e);
          qg.a(var21, param0, var22, param9);
          if (2 != param1) {
            var16.d(var20, param7, var18, var16.field_v);
          } else {
            cj.field_c.d(var20, param7, var18, cj.field_c.field_v);
          }
          if (1 == param1 ||
            param1 == 2) {
            if (1 == var13) {
              if (var14 >= c.field_b.field_u >> 1) {
                c.field_b.g(param11 - (c.field_b.field_q >> 1), param7);
              } else {
                c.field_b.d(-(var14 * (c.field_b.field_q >> 1) / (c.field_b.field_u >> 1)) + param11, param7, var14 * c.field_b.field_q / (c.field_b.field_u >> 1), c.field_b.field_v);
              }
            }
            if (2 == var13) {
              if (c.field_b.field_u >> 1 <= var14) {
                c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
              } else {
                c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
              }
            }
          }
          qg.b(vd.field_e);
          return;
        }
        if (!param6) {
          var13 = 0;
        }
        if (param4) {
          if (param6) {
            var13 = 2;
          }
          if (param4 &&
            !param6) {
            var13 = 3;
          }
          var17Lifetime1 = var13 * var12 >> 2;
          var18Lifetime1 = var14 << 2;
          var19Lifetime1 = var18Lifetime1 * var17Lifetime1 / var12;
          var20Lifetime1 = -var19Lifetime1 + param2;
          var21Lifetime1 = param2;
          if (var15 != 0) {
            var21Lifetime1 = var21Lifetime1 - var14;
          }
          var22Lifetime1 = param11;
          if (var20Lifetime1 + var18Lifetime1 < var21Lifetime1) {
            return;
          }
          if (var22Lifetime1 < var20Lifetime1) {
            return;
          }
          if (param0 > param7 + var16.field_v) {
            return;
          }
          if (param7 > param9) {
            return;
          }
          if (!param10) {
            return;
          }
          if (var13 < 0) {
            return;
          }
          if (var13 >= 4) {
            return;
          }
          if (param1 == 2 &&
            !je.field_i) {
            cj.field_c.d();
            je.field_g.e(0, 0, param8);
            od.a(cj.field_c, 33, 30, 68, 90);
            var16.g(0, 0);
            la.field_f.a(119);
            je.field_i = true;
          }
          qg.a(vd.field_e);
          qg.a(var21Lifetime1, param0, var22Lifetime1, param9);
          if (2 != param1) {
            var16.d(var20Lifetime1, param7, var18Lifetime1, var16.field_v);
          } else {
            cj.field_c.d(var20Lifetime1, param7, var18Lifetime1, cj.field_c.field_v);
          }
          if (1 == param1 ||
            param1 == 2) {
            if (1 == var13) {
              if (var14 >= c.field_b.field_u >> 1) {
                c.field_b.g(param11 - (c.field_b.field_q >> 1), param7);
              } else {
                c.field_b.d(-(var14 * (c.field_b.field_q >> 1) / (c.field_b.field_u >> 1)) + param11, param7, var14 * c.field_b.field_q / (c.field_b.field_u >> 1), c.field_b.field_v);
              }
            }
            if (2 == var13) {
              if (c.field_b.field_u >> 1 <= var14) {
                c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
              } else {
                c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
              }
            }
          }
          qg.b(vd.field_e);
          return;
        }
        if (param6) {
          var13 = 1;
        }
        if (param4 &&
          param6) {
          var13 = 2;
        }
        if (param4 &&
          !param6) {
          var13 = 3;
        }
        var17Lifetime2 = var13 * var12 >> 2;
        var18Lifetime2 = var14 << 2;
        var19Lifetime2 = var18Lifetime2 * var17Lifetime2 / var12;
        var20Lifetime2 = -var19Lifetime2 + param2;
        var21Lifetime2 = param2;
        if (var15 != 0) {
          var21Lifetime2 = var21Lifetime2 - var14;
        }
        var22Lifetime2 = param11;
        if (var20Lifetime2 + var18Lifetime2 < var21Lifetime2) {
          return;
        }
        if (var22Lifetime2 < var20Lifetime2) {
          return;
        }
        if (param0 > param7 + var16.field_v) {
          return;
        }
        if (param7 > param9) {
          return;
        }
        if (!param10) {
          return;
        }
        if (var13 < 0) {
          return;
        }
        if (var13 >= 4) {
          return;
        }
        if (param1 == 2 &&
          !je.field_i) {
          cj.field_c.d();
          je.field_g.e(0, 0, param8);
          od.a(cj.field_c, 33, 30, 68, 90);
          var16.g(0, 0);
          la.field_f.a(119);
          je.field_i = true;
        }
        qg.a(vd.field_e);
        qg.a(var21Lifetime2, param0, var22Lifetime2, param9);
        if (2 != param1) {
          var16.d(var20Lifetime2, param7, var18Lifetime2, var16.field_v);
        } else {
          cj.field_c.d(var20Lifetime2, param7, var18Lifetime2, cj.field_c.field_v);
        }
        if (1 == param1 ||
          param1 == 2) {
          if (1 == var13) {
            if (var14 < c.field_b.field_u >> 1) {
              c.field_b.d(-(var14 * (c.field_b.field_q >> 1) / (c.field_b.field_u >> 1)) + param11, param7, var14 * c.field_b.field_q / (c.field_b.field_u >> 1), c.field_b.field_v);
            } else {
              c.field_b.g(param11 - (c.field_b.field_q >> 1), param7);
            }
          }
          if (2 == var13) {
            if (c.field_b.field_u >> 1 <= var14) {
              c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
            } else {
              c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
            }
          }
        }
        qg.b(vd.field_e);
        return;
    }

    final static int a(boolean param0, int param1) {
        param1--;
        if (param0) {
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        field_e = (int[][][]) null;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param1) {
          qg.a(0, 0, qg.field_g, qg.field_f, 0, 192);
          if (param0 != 0) {
            ll.a(80, true, false);
            c.a(param1, false);
            return;
          }
          c.a(param1, false);
          return;
        }
        qg.b();
        if (param0 != 0) {
          ll.a(80, true, false);
          c.a(param1, false);
          return;
        }
        c.a(param1, false);
    }

    public static void a(int param0) {
        field_j = (boolean[][][]) null;
        field_e = (int[][][]) null;
        field_h = null;
        if (param0 == 256) {
          field_k = (int[][]) null;
          field_f = null;
          field_c = null;
          return;
        }
        field_h = (ti[]) null;
        field_k = (int[][]) null;
        field_f = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = 64;
        field_e = new int[][][]{new int[][]{new int[]{256, 256, 256}, new int[]{256, 224, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{224, 256, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}, new int[][]{new int[]{224, 224, 224}, new int[]{224, 256, 224}, new int[]{224, 224, 224}, new int[]{256, 256, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}, new int[][]{new int[]{224, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}, new int[][]{new int[]{356, 256, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}, new int[][]{new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{224, 224, 224}, new int[]{256, 256, 256}, new int[]{224, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}}, new int[][]{new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{256, 256, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}, new int[][]{new int[]{224, 224, 224}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}, new int[][]{new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 256}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}, new int[]{224, 224, 224}}};
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = -1;
        field_g = 0;
        field_j = new boolean[][][]{new boolean[][]{new boolean[]{false, false, true}, new boolean[]{false, true}, new boolean[]{false, true}, new boolean[]{false, false, false, false, false, true}, new boolean[]{false, true}, new boolean[]{false}, new boolean[]{true, true, true, false, true, true}}, new boolean[][]{new boolean[]{false, true}, new boolean[]{false, false, false, true}, new boolean[]{false, false, false, false, false, true}, new boolean[]{false, false, false, false, true, true}, new boolean[]{false, false, false, false, true}, new boolean[]{false, false, false, false, true}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, true}, new boolean[]{false, true}, new boolean[]{false, false, false, true}, new boolean[]{false, false, false, false, false, true}, new boolean[]{false, false, true}, new boolean[]{false}, new boolean[]{true, true, true, false, false, true}}};
        field_k = new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1, 2, 3}, new int[]{5, 5, 5}, new int[]{0, 1, 1}, new int[]{2, 2, 2}, new int[]{10, 10, 10}, new int[]{0, 0, 0}, new int[]{0}, new int[]{0}};
    }
}
