/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends fj {
    static int field_u;
    static ha field_q;
    private gn field_t;
    private int field_s;
    static cd field_r;
    static String field_p;

    final void a(byte param0, int[] param1) {
        ((df) this).field_t = new gn(param1);
        if (param0 >= -110) {
            Object var4 = null;
            ((df) this).b(42, -84, (byte[]) null, 89);
        }
    }

    public static void k(int param0) {
        if (param0 != 3) {
            return;
        }
        field_r = null;
        field_p = null;
        field_q = null;
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((df) this).field_n;
        ((df) this).field_n = ((df) this).field_n + 1;
        ((df) this).field_j[fieldTemp$0] = (byte)(((df) this).field_t.b((byte) -103) + param1);
        int var3 = -58 / ((param0 - 23) / 48);
    }

    final int a(boolean param0) {
        if (!param0) {
          return -70;
        } else {
          int fieldTemp$2 = ((df) this).field_n;
          ((df) this).field_n = ((df) this).field_n + 1;
          return 255 & ((df) this).field_j[fieldTemp$2] - ((df) this).field_t.b((byte) -103);
        }
    }

    df(byte[] param0) {
        super(param0);
    }

    final static void a(float param0, int param1, String param2) {
        aj.field_E = param0;
        ob.field_b = param2;
        int var3 = -112 % ((-29 - param1) / 32);
    }

    final void j(byte param0) {
        ((df) this).field_s = ((df) this).field_n * 8;
        if (param0 > -1) {
            field_p = null;
        }
    }

    final int e(int param0, int param1) {
        int var7 = Torquing.field_u;
        int var3 = ((df) this).field_s >> 1185944515;
        int var4 = -(7 & ((df) this).field_s) + 8;
        int var5 = 0;
        ((df) this).field_s = ((df) this).field_s + param0;
        while (var4 < param0) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((la.field_h[var4] & ((df) this).field_j[incrementValue$0]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        int var6 = -111 % ((param1 - -4) / 53);
        if (param0 != var4) {
            var5 = var5 + (((df) this).field_j[var3] >> -param0 + var4 & la.field_h[param0]);
        } else {
            var5 = var5 + (((df) this).field_j[var3] & la.field_h[var4]);
        }
        return var5;
    }

    df(int param0) {
        super(param0);
    }

    final static boolean a(df param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 > -23) {
          L0: {
            field_u = -22;
            if (1 != param0.e(1, 99)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (1 != param0.e(1, 99)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void b(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Torquing.field_u;
        if (param1 != 8) {
          ((df) this).field_t = null;
          var5 = 0;
          L0: while (true) {
            if (param3 <= var5) {
              return;
            } else {
              int fieldTemp$2 = ((df) this).field_n;
              ((df) this).field_n = ((df) this).field_n + 1;
              param2[var5 - -param0] = (byte)(((df) this).field_j[fieldTemp$2] + -((df) this).field_t.b((byte) -103));
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (param3 <= var5) {
              return;
            } else {
              int fieldTemp$3 = ((df) this).field_n;
              ((df) this).field_n = ((df) this).field_n + 1;
              param2[var5 - -param0] = (byte)(((df) this).field_j[fieldTemp$3] + -((df) this).field_t.b((byte) -103));
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        L0: {
          var35 = Torquing.field_u;
          if (param2 == 26905) {
            break L0;
          } else {
            df.a(0, -73, 61, -97, -92, -87, 106, -79, 59, 91);
            break L0;
          }
        }
        L1: {
          if (param3 != param4) {
            break L1;
          } else {
            if (param5 != param8) {
              break L1;
            } else {
              if (param6 != param9) {
                break L1;
              } else {
                if (param1 != param0) {
                  break L1;
                } else {
                  oh.a(param3, param5, param1, (byte) -128, param9, param7);
                  return;
                }
              }
            }
          }
        }
        var10 = param3;
        var11 = param5;
        var12 = 3 * param3;
        var13 = 3 * param5;
        var14 = 3 * param4;
        var15 = 3 * param8;
        var16 = 3 * param6;
        var17 = 3 * param0;
        var18 = param9 + (-var16 - (-var14 - -param3));
        var19 = -var17 + (param1 + var15 + -param5);
        var20 = var12 + (-var14 + var16 + -var14);
        var21 = var13 + (var17 + -var15) + -var15;
        var22 = -var12 + var14;
        var23 = -var13 + var15;
        var24 = 128;
        L2: while (true) {
          if (4096 >= var24) {
            var25 = var24 * var24 >> 1273181388;
            var26 = var24 * var25 >> 2007909612;
            var27 = var18 * var26;
            var28 = var19 * var26;
            var29 = var20 * var25;
            var30 = var21 * var25;
            var31 = var22 * var24;
            var32 = var24 * var23;
            var33 = param3 - -(var27 + (var29 + var31) >> -749075572);
            var34 = (var30 + var28 - -var32 >> 299422732) + param5;
            oh.a(var10, var11, var34, (byte) -128, var33, param7);
            var11 = var34;
            var10 = var33;
            var24 += 128;
            continue L2;
          } else {
            return;
          }
        }
    }

    final void j(int param0) {
        if (param0 > -126) {
          field_r = null;
          ((df) this).field_n = (7 + ((df) this).field_s) / 8;
          return;
        } else {
          ((df) this).field_n = (7 + ((df) this).field_s) / 8;
          return;
        }
    }

    final static void a(int param0, double[] param1) {
        double var2 = 0.0;
        double var4 = 0.0;
        var2 = ap.a(param1, 10, param1, 10);
        if (param0 != 3) {
          return;
        } else {
          L0: {
            if (var2 <= 685.3891945200804) {
              break L0;
            } else {
              var4 = 26.17993877991468 / Math.sqrt(var2);
              param1[10] = param1[10] * var4;
              param1[12] = param1[12] * var4;
              param1[11] = param1[11] * var4;
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 64;
        field_r = new cd();
        field_p = "Type your age in years";
    }
}
