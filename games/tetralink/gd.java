/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends hl {
    static String field_ec;
    hl field_Vb;
    boolean field_Tb;
    int field_Sb;
    int field_Qb;
    hl field_Ob;
    int field_Ub;
    boolean field_cc;
    int field_Xb;
    boolean field_Kb;
    int field_dc;
    long field_bc;
    hl field_Wb;
    long field_Nb;
    hl field_Lb;
    hl field_ac;
    static int field_Mb;
    int field_Pb;
    String field_Rb;
    static int[] field_Zb;
    String field_Yb;

    public static void h(int param0) {
        if (param0 != 11042) {
            return;
        }
        field_Zb = null;
        field_ec = null;
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param0 <= 26) {
          ((gd) this).field_Rb = null;
          ((gd) this).field_Yb = param2;
          ((gd) this).field_Rb = param1;
          var5 = (CharSequence) (Object) ((gd) this).field_Rb;
          String discarded$4 = cc.a(var5, (byte) 104);
          return;
        } else {
          ((gd) this).field_Yb = param2;
          ((gd) this).field_Rb = param1;
          var6 = (CharSequence) (Object) ((gd) this).field_Rb;
          String discarded$5 = cc.a(var6, (byte) 104);
          return;
        }
    }

    final boolean a(byte param0, gd param1) {
        if ((!((gd) this).field_Kb ? 1 : 0) != (!param1.field_Kb ? 1 : 0)) {
            return ((gd) this).field_Kb;
        }
        if (!((!((gd) this).field_cc ? 1 : 0) != (param1.field_cc ? 1 : 0))) {
            return ((gd) this).field_cc;
        }
        int var3 = -22 % ((-21 - param0) / 55);
        return param1.field_bc > ((gd) this).field_bc ? true : false;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            ((gd) this).field_Xb = -80;
            if (((gd) this).a(2)) {
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
            if (((gd) this).a(2)) {
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

    final static oh[] e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = TetraLink.field_J;
        oh[] var1 = new oh[vj.field_n];
        for (var2 = 0; vj.field_n > var2; var2++) {
            var3 = sn.field_e[var2] * je.field_h[var2];
            var4 = ga.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ti.field_c[pl.a((int) var4[var6], 255)];
            }
            var1[var2] = new oh(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var5);
        }
        var2 = 29 % ((param0 - -30) / 37);
        an.b(-104);
        return var1;
    }

    final static void a(String param0, int param1, String param2, int param3, rb param4, int[] param5, long param6, hl param7, int param8) {
        bi.field_d = param4;
        if (param1 != 255) {
          gd.h(-71);
          hd.field_s = new pf(param7, param6, param0, param2, param8, param3, param5);
          return;
        } else {
          hd.field_s = new pf(param7, param6, param0, param2, param8, param3, param5);
          return;
        }
    }

    gd(String param0, String param1, long param2) {
        super(0L, (hl) null);
        ((gd) this).field_Yb = param1;
        ((gd) this).field_Rb = param0;
        ((gd) this).field_Nb = param2;
        CharSequence var6 = (CharSequence) (Object) ((gd) this).field_Rb;
        String discarded$0 = cc.a(var6, (byte) 115);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        var3 = 0;
        var4 = pj.field_e;
        L0: while (true) {
          if (pj.field_h.length <= var3) {
            if (param2 != 8395) {
              return 79;
            } else {
              return -1;
            }
          } else {
            var5 = ml.field_mb[var3];
            if (-1 >= (var5 ^ -1)) {
              var6 = fi.a(true, pj.field_h[var3], (byte) -89);
              var7 = vg.field_Lb + -(var6 >> -747334655);
              var4 = var4 + mn.field_c;
              if (!tb.a(param1, -io.field_a + var7, var4, param0, var6 + (io.field_a << -1185439071), bj.field_d - -(da.field_e << 1410631617), -113)) {
                var4 = var4 + ((da.field_e << 654664193) + mn.field_c - -bj.field_d);
                var3++;
                var3++;
                continue L0;
              } else {
                return var5;
              }
            } else {
              var4 = var4 + la.field_e;
              var3++;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        jj.field_b = param3;
        if (param1) {
            return;
        }
        rn.field_b = param4;
        la.field_e = param2;
        bj.field_d = param0;
    }

    final static void d(int param0, int param1) {
        ik.field_e = param0 >> -1579914652 & 3;
        me.field_b = param0 >> 676202210 & 3;
        if (!(2 >= ik.field_e)) {
            ik.field_e = 2;
        }
        if (!((me.field_b ^ -1) >= -3)) {
            me.field_b = 2;
        }
        mc.field_f = param1 & param0;
        if (!(mc.field_f <= 2)) {
            mc.field_f = 2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ec = "Your request to join has been declined.";
        field_Mb = 50;
    }
}
