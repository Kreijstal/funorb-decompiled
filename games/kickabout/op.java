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
          hq.field_d = -om.field_Bb + 480 - 21;
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
        var7 = new ut(jt.field_yb << 1622748641, om.field_Bb << 806543905);
        iw.a(97, var7);
        on.b();
        on.c(0, 0, jt.field_yb << -363021503, om.field_Bb << 2039135137, 2, 16777215);
        on.e(1, 1, -2 + (jt.field_yb << -1602780127), (om.field_Bb << 1445285825) + -2, 16777215);
        on.f(0, om.field_Bb, jt.field_yb << -1842526431, 16777215);
        on.f(0, 1 + om.field_Bb, jt.field_yb << -1117646271, 16777215);
        vl.a(2, var1, true, 16777215).c(-var1 + jt.field_yb, om.field_Bb - var1);
        on.c(jt.field_yb + -(var2 >> -786656447), 1, var2, var4, 2, 16777215);
        on.c(jt.field_yb - (var5 >> -203283935), 0, var5, var6, 2, 16777215);
        on.c(jt.field_yb + -(var2 >> 670095745), -1 + (-var4 + om.field_Bb) + om.field_Bb, var2, var4, 2, 16777215);
        on.c(jt.field_yb - (var5 >> -409088991), -var6 + (om.field_Bb - -om.field_Bb), var5, var6, 2, 16777215);
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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (!param3.field_m) {
            if (param3.b(99)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_6_0;
          if (!(param3 instanceof wi)) {
            break L1;
          } else {
            param1 = param1 & ((wi) (Object) param3).field_y;
            break L1;
          }
        }
        L2: {
          if (!param1) {
            stackOut_12_0 = ((op) this).field_w;
            stackIn_13_0 = stackOut_12_0;
            break L2;
          } else {
            if (var6 != 0) {
              stackOut_11_0 = ((op) this).field_x;
              stackIn_13_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = ((op) this).field_s;
              stackIn_13_0 = stackOut_10_0;
              break L2;
            }
          }
        }
        L3: {
          var7 = stackIn_13_0;
          if (!param1) {
            stackOut_15_0 = 7105644;
            stackIn_16_0 = stackOut_15_0;
            break L3;
          } else {
            stackOut_14_0 = 16777215;
            stackIn_16_0 = stackOut_14_0;
            break L3;
          }
        }
        var8 = stackIn_16_0;
        gw.a(param3.field_g + (param2 + (-((op) this).field_r[0].field_v + param3.field_i >> 1709925185)), -27981, param4 - -param3.field_t, param3.field_n, var7, ((op) this).field_r);
        int discarded$1 = ((op) this).field_a.a(param3.field_q, param3.field_t + param4, -2 + (param3.field_g + param2), param3.field_n, param3.field_i, var8, -1, 1, 1, ((op) this).field_a.field_G);
        var9 = -73 / ((param0 - 59) / 53);
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
        String[] var3 = wr.a(param2, 2, ',');
        int var4 = 0;
        int var5 = 0;
        if (param1 <= 125) {
            Object var6 = null;
            op.a(72, (byte) -7, (String) null);
        }
        while (var5 < 4) {
            int incrementValue$0 = var4;
            var4++;
            ws.field_b[param0][var5] = Integer.parseInt(var3[incrementValue$0]);
            int incrementValue$1 = var4;
            var4++;
            ws.field_d[param0][var5] = Integer.parseInt(var3[incrementValue$1]);
            var5++;
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
