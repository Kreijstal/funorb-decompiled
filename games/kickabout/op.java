/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends qv {
    static int[] field_z;
    static bh field_y;
    private int field_s;
    private ut[] field_r;
    private int field_w;
    static String field_t;
    private int field_x;
    static String field_u;
    static int field_v;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ut var7 = null;
        ut var8 = null;
        L0: {
          jt.field_yb = 80;
          om.field_Bb = 120;
          hq.field_d = -om.field_Bb + 459;
          if (param0 == -363021503) {
            break L0;
          } else {
            op.b(110);
            break L0;
          }
        }
        var1 = 24;
        var2 = 96;
        var3 = 43;
        var4 = 48;
        var5 = 48;
        var6 = 21;
        var7 = new ut(jt.field_yb << 1, om.field_Bb << 1);
        iw.a(97, var7);
        on.b();
        on.c(0, 0, jt.field_yb << 1, om.field_Bb << 1, 2, 16777215);
        on.e(1, 1, -2 + (jt.field_yb << 1), (om.field_Bb << 1) + -2, 16777215);
        on.f(0, om.field_Bb, jt.field_yb << 1, 16777215);
        on.f(0, 1 + om.field_Bb, jt.field_yb << 1, 16777215);
        vl.a(2, var1, true, 16777215).c(-var1 + jt.field_yb, om.field_Bb - var1);
        on.c(jt.field_yb + -(var2 >> 1), 1, var2, var4, 2, 16777215);
        on.c(jt.field_yb - (var5 >> 1), 0, var5, var6, 2, 16777215);
        on.c(jt.field_yb + -(var2 >> 1), -1 + (-var4 + om.field_Bb) + om.field_Bb, var2, var4, 2, 16777215);
        on.c(jt.field_yb - (var5 >> 1), -var6 + (om.field_Bb - -om.field_Bb), var5, var6, 2, 16777215);
        pt.a(jt.field_yb + jt.field_yb, -22914, 0, -var4 + (om.field_Bb + om.field_Bb), var4);
        var8 = vl.a(2, var3, true, 16777215);
        var8.c(-var3 + jt.field_yb, -var3 + var6);
        var8.c(jt.field_yb - var3, -var3 + (om.field_Bb - -om.field_Bb) + -var6);
        ta.e(param0 ^ -363021514);
        ta.e(127);
        pq.field_Q = new ut(2 + jt.field_yb, 2 + om.field_Bb);
        iw.a(param0 + 363021421, pq.field_Q);
        on.a(0, 0, on.field_g, on.field_f, 65793);
        var7.f(1, 1);
        ta.e(125);
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!param3.field_m) {
                if (param3.b(99)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param3 instanceof wi)) {
                break L2;
              } else {
                param1 = param1 & ((wi) (Object) param3).field_y;
                break L2;
              }
            }
            L3: {
              if (!param1) {
                stackOut_12_0 = ((op) this).field_w;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackOut_11_0 = ((op) this).field_x;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = ((op) this).field_s;
                  stackIn_13_0 = stackOut_10_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (!param1) {
                stackOut_15_0 = 7105644;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 16777215;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            var8 = stackIn_16_0;
            gw.a(param3.field_g + (param2 + (-((op) this).field_r[0].field_v + param3.field_i >> 1)), -27981, param4 - -param3.field_t, param3.field_n, var7, ((op) this).field_r);
            int discarded$1 = ((op) this).field_a.a(param3.field_q, param3.field_t + param4, -2 + (param3.field_g + param2), param3.field_n, param3.field_i, var8, -1, 1, 1, ((op) this).field_a.field_G);
            var9 = -73 / ((param0 - 59) / 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("op.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 41);
        }
    }

    public static void b(int param0) {
        field_t = null;
        field_u = null;
        field_y = null;
        if (param0 != -1842526431) {
            field_u = null;
        }
        field_z = null;
    }

    public op() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, byte param1, String param2) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
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
              var3 = wr.a(param2, 2, ',');
              var4 = 0;
              var5 = 0;
              if (param1 > 125) {
                break L1;
              } else {
                var6 = null;
                op.a(72, (byte) -7, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var5 >= 4) {
                break L0;
              } else {
                int incrementValue$10 = var4;
                var4++;
                ws.field_b[param0][var5] = Integer.parseInt(var3[incrementValue$10]);
                int incrementValue$11 = var4;
                var4++;
                ws.field_d[param0][var5] = Integer.parseInt(var3[incrementValue$11]);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("op.D(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private op(int param0, int param1, int param2) {
        ((op) this).field_r = nw.field_a;
        ((op) this).field_a = fj.field_b;
        ((op) this).field_s = param0;
        ((op) this).field_w = param2;
        ((op) this).field_x = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[4];
        field_t = "There are no valid types of game that match your preferences.";
        field_u = "in the Qualifying Round";
        field_v = 2147483647;
        field_z[2] = 36049;
        field_z[3] = -1;
        field_z[0] = 12049;
        field_z[1] = 24049;
    }
}
