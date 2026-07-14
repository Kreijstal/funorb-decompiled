/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    private me field_i;
    private me field_s;
    private int field_f;
    private me field_k;
    private ij field_y;
    static String field_u;
    private me field_d;
    private me field_l;
    private int field_j;
    private int field_e;
    int field_t;
    private boolean[] field_q;
    int field_o;
    private ik field_b;
    private cn field_n;
    int field_m;
    int field_p;
    private me field_x;
    static String field_a;
    private boolean field_r;
    private int field_h;
    int field_c;
    static String field_g;
    private String field_v;
    private int field_w;

    private final void a(byte param0) {
        me var3 = null;
        int var4 = EscapeVector.field_A;
        hg var2_ref = ((gj) this).field_n.a(false);
        while (var2_ref != null) {
            var3 = (me) (Object) var2_ref;
            this.a(-23672, var3);
            var2_ref = ((gj) this).field_n.b((byte) 70);
        }
        int var2 = -40 % ((15 - param0) / 47);
    }

    private final int[] c(byte param0) {
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var10 = ((gj) this).field_y.field_o[((gj) this).field_p];
        int[] var2 = var10;
        int var3 = jb.a(92, ((gj) this).field_y.field_n);
        if (param0 <= 19) {
            Object var9 = null;
            int[] discarded$0 = this.a(false, (int[]) null, 43);
        }
        int var4 = je.a(false, var3);
        int[] var12 = new int[((gj) this).field_h];
        int[] var11 = var12;
        int[] var5 = var11;
        for (var6 = 0; var10.length > var6; var6++) {
            var7 = this.a(var10[var6], var4, false);
            var12[var6] = var7;
        }
        if (!(!((gj) this).field_r)) {
            var6 = this.a(((gj) this).field_b.field_q[0], var4, false);
            var5[-1 + ((gj) this).field_h] = var6;
        }
        return var5;
    }

    final void c(int param0) {
        if (param0 != 2) {
            String discarded$0 = this.a(-16, -82);
        }
        this.e(-111);
        this.d((byte) -85);
    }

    private final int[] b(byte param0) {
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var10 = ((gj) this).field_y.field_o[((gj) this).field_p];
        int[] var2 = var10;
        int var3 = jb.a(105, ((gj) this).field_y.field_n);
        if (param0 <= 120) {
            Object var9 = null;
            int[] discarded$0 = this.a(true, (int[]) null, -69);
        }
        int var4 = je.a(false, var3);
        int[] var12 = new int[((gj) this).field_h];
        int[] var11 = var12;
        int[] var5 = var11;
        for (var6 = 0; var6 < var10.length; var6++) {
            var7 = this.a(-1, var10[var6], var4);
            var12[var6] = var7;
        }
        if (((gj) this).field_r) {
            var6 = this.a(-1, ((gj) this).field_b.field_q[0], var4);
            var5[-1 + ((gj) this).field_h] = var6;
        }
        return var5;
    }

    private final int[] b(int param0, int param1) {
        int var5 = EscapeVector.field_A;
        int[] var3 = new int[param1];
        int var4 = 0;
        if (param0 != -27531) {
            Object var6 = null;
            String[] discarded$0 = this.a((String[]) null, -110);
        }
        while (var4 < var3.length) {
            var3[var4] = -1;
            var4++;
        }
        return var3;
    }

    final static void a(byte param0, mf param1, mf param2) {
        if (param0 < 55) {
            field_u = null;
        }
    }

    private final void d(byte param0) {
        int var2 = 640;
        int var3 = var2 / 2;
        int var4 = ((gj) this).field_f - -((gj) this).field_c + -2;
        ih var5 = fh.field_g;
        int var7 = -42 % ((45 - param0) / 61);
        int var6 = un.a(var5, 31512);
        var4 = var4 - var6;
        int var8 = uc.a(-1, var5);
        var4 = var4 + var8;
        if (!(((gj) this).field_v == null)) {
            var5.c(((gj) this).field_v, var3, var4, ((gj) this).field_j, -1);
        }
    }

    private final void a(int param0, me param1) {
        if (!(param1 != null)) {
            return;
        }
        ih var3 = fh.field_g;
        int var4 = 10551200;
        int var5 = 16777215;
        param1.a(var3, var5, (byte) -107, var4);
        if (param0 != -23672) {
            int[] discarded$0 = this.b(58, -116);
        }
    }

    private final void b(String[] param0, int param1) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (param1 < -105) {
            break L0;
          } else {
            ((gj) this).field_l = null;
            break L0;
          }
        }
        ((gj) this).field_q = new boolean[((gj) this).field_h];
        if (param0 == null) {
          return;
        } else {
          var3 = 0;
          var4 = param0;
          var5 = 0;
          L1: while (true) {
            if (var5 >= var4.length) {
              return;
            } else {
              var6 = var4[var5];
              if (var6 != null) {
                if (((gj) this).field_q.length <= var3) {
                  return;
                } else {
                  ((gj) this).field_q[var3] = true;
                  var3++;
                  var5++;
                  continue L1;
                }
              } else {
                var3++;
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    private final void e(int param0) {
        me var4 = null;
        int var5 = EscapeVector.field_A;
        int var2 = -64 / ((param0 - -50) / 50);
        hg var3 = ((gj) this).field_n.a(false);
        while (var3 != null) {
            var4 = (me) (Object) var3;
            if (((gj) this).field_q != null) {
                var4.a(((gj) this).field_e, ((gj) this).field_q, (byte) 48);
            } else {
                var4.a(-6131, ((gj) this).field_e);
            }
            var3 = ((gj) this).field_n.b((byte) 70);
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_a = null;
        if (param0 != 3355) {
            return;
        }
        field_g = null;
    }

    private final int d(int param0) {
        int var2 = ((gj) this).field_k.f((byte) 87);
        ih var3 = fh.field_g;
        if (param0 > -33) {
            int discarded$0 = this.a(-73);
        }
        int var4 = un.a(var3, 31512);
        var2 = var2 + (2 + var4);
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = param1 / 50 % 50;
        if (param0 < (var4 ^ -1)) {
            var4 = 0;
        }
        if (var4 >= param2) {
            var4 = param2 - 1;
        }
        return 1 + var4;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param1 > -1) {
            return false;
        }
        if (!(q.field_E.length > param1)) {
            return false;
        }
        if (-1 > param0) {
            return false;
        }
        if (param2 < 23) {
            return true;
        }
        if (!(param0 < q.field_E[param1].length)) {
            return false;
        }
        return q.field_E[param1][param0];
    }

    private final void e(byte param0) {
        me var5 = null;
        int var6 = EscapeVector.field_A;
        int var2 = ((gj) this).field_t;
        int var3 = ((gj) this).field_f;
        if (param0 != 52) {
            return;
        }
        hg var4 = ((gj) this).field_n.a(false);
        while (var4 != null) {
            var5 = (me) (Object) var4;
            var5.a(var2, var3, 0);
            var2 = var2 + var5.e((byte) -127);
            var4 = ((gj) this).field_n.b((byte) 70);
        }
    }

    private final String a(int param0, int param1) {
        if (!((param1 ^ -1) != -2)) {
            return ng.field_lb;
        }
        if (param0 != -17651) {
            ((gj) this).field_b = null;
        }
        if (param1 == 0) {
            return wc.field_b;
        }
        if (!((param1 ^ -1) != -3)) {
            return ng.field_lb;
        }
        if (!((param1 ^ -1) != -4)) {
            return ng.field_lb;
        }
        return ng.field_lb;
    }

    final void a(int param0, String param1, int param2) {
        ((gj) this).field_v = param1;
        ((gj) this).field_j = param2;
        if (param0 != 3) {
            int[] discarded$0 = this.c((byte) -24);
        }
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        if (param0 > 123) {
          L0: {
            var2 = ((gj) this).field_y.field_n;
            var3 = this.a(var2, false);
            if (0 > var3) {
              break L0;
            } else {
              if (vn.field_a.length > var3) {
                var4 = vn.field_a[var3];
                var5 = var4;
                var6 = 0;
                L1: while (true) {
                  if (var5.length <= var6) {
                    return -1;
                  } else {
                    var7 = var5[var6];
                    ((gj) this).field_y.field_n = var7;
                    var8 = ld.a(((gj) this).field_b, ((gj) this).field_p, 0, ((gj) this).field_y);
                    if (0 > var8) {
                      var6++;
                      continue L1;
                    } else {
                      ((gj) this).field_y.field_n = var2;
                      return var8;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return -15;
        }
    }

    private final String[] a(int[] param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (!param1) {
            ((gj) this).field_k = null;
        }
        String[] var7 = new String[((gj) this).field_h];
        String[] var3 = var7;
        for (var4 = 0; var4 < param0.length; var4++) {
            var5 = jb.a(107, param0[var4]);
            var7[var4] = this.a(-17651, var5);
        }
        if (!(!((gj) this).field_r)) {
            var4 = jb.a(115, ((gj) this).field_b.field_j);
            var3[((gj) this).field_h + -1] = this.a(-17651, var4);
        }
        return var3;
    }

    private final String[] a(String[] param0, int param1) {
        String[] var4 = new String[((gj) this).field_h];
        String[] var3 = var4;
        if (param1 != -1) {
            return null;
        }
        qg.a((Object[]) (Object) param0, 0, (Object[]) (Object) var3, 0, param0.length);
        if (((gj) this).field_r) {
            var4[-1 + ((gj) this).field_h] = ck.field_r;
        }
        return var3;
    }

    private final int[] a(boolean param0, int[] param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int[] var8 = new int[((gj) this).field_h];
        int[] var4 = var8;
        for (var5 = 0; param1.length > var5; var5++) {
            var6 = bj.a(-56, param2, param1[var5]);
            var8[var5] = var6;
        }
        if (!param0) {
            this.e((byte) -108);
        }
        if (((gj) this).field_r) {
            var5 = bj.a(-49, param2, ((gj) this).field_b.field_q[0]);
            var4[-1 + ((gj) this).field_h] = var5;
        }
        return var4;
    }

    private final int f(int param0) {
        me var4 = null;
        int var5 = EscapeVector.field_A;
        int var2 = 0;
        hg var3 = ((gj) this).field_n.a(false);
        if (param0 >= -115) {
            ((gj) this).c(117);
        }
        while (var3 != null) {
            var4 = (me) (Object) var3;
            var2 = var2 + var4.e((byte) -127);
            var3 = ((gj) this).field_n.b((byte) 70);
        }
        return var2;
    }

    private final int a(int param0, int param1, boolean param2) {
        if (param2) {
            Object var7 = null;
            gj.a((byte) -44, (mf) null, (mf) null);
        }
        int var4 = this.a(-1, param0, param1);
        int var5 = param0 % 50;
        int var6 = -var5 + var4;
        if (!(-2 >= (var6 ^ -1))) {
            var6 = 1;
        }
        if (!(var6 <= param1)) {
            var6 = param1;
        }
        return var6;
    }

    private final int c(int param0, int param1) {
        if (param0 != -1) {
            return 0;
        }
        if (!(param1 != 0)) {
            return 5;
        }
        if (!(1 != param1)) {
            return 5;
        }
        if (-3 == (param1 ^ -1)) {
            return 6;
        }
        if (param1 == 3) {
            return 7;
        }
        return -1;
    }

    gj(ij param0, int[] param1, ik param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        int var14 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          ((gj) this).field_p = param3;
          ((gj) this).field_y = param0;
          ((gj) this).field_w = param4;
          ((gj) this).field_e = -1;
          ((gj) this).field_b = param2;
          ((gj) this).field_o = 1;
          if (null == ((gj) this).field_b) {
            break L0;
          } else {
            ((gj) this).field_e = this.a(124);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = this;
            stackIn_7_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param6) {
              break L2;
            } else {
              stackOut_3_0 = this;
              stackIn_7_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((gj) this).field_e >= 0) {
                break L2;
              } else {
                stackOut_4_0 = this;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (null == ((gj) this).field_b) {
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (this.c(-1, ((gj) this).field_b.field_j) != ((gj) this).field_w) {
                    break L2;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = this;
          stackOut_7_1 = 0;
          stackIn_8_0 = stackOut_7_0;
          stackIn_8_1 = stackOut_7_1;
          break L1;
        }
        L3: {
          ((gj) this).field_r = stackIn_8_1 != 0;
          stackOut_8_0 = this;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (!((gj) this).field_r) {
            stackOut_10_0 = this;
            stackOut_10_1 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = this;
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          ((gj) this).field_h = stackIn_11_1 + ((gj) this).field_y.field_m[((gj) this).field_p].length;
          if (!((gj) this).field_r) {
            break L4;
          } else {
            ((gj) this).field_e = ((gj) this).field_h - 1;
            break L4;
          }
        }
        L5: {
          ((gj) this).field_n = new cn();
          var8 = ((gj) this).field_y.field_m[((gj) this).field_p].length;
          ((gj) this).field_x = new me(var8);
          ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_x);
          var9 = this.a(((gj) this).field_y.field_m[((gj) this).field_p], -1);
          this.b(var9, -117);
          ((gj) this).field_k = new me(fi.field_b, var9, 1);
          ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_k);
          var10 = new String[((gj) this).field_h];
          if (5 != ((gj) this).field_w) {
            break L5;
          } else {
            var10 = this.a(param1, true);
            break L5;
          }
        }
        ((gj) this).field_l = new me(qf.field_o, var10, 2);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_l);
        var24 = this.c((byte) 39);
        ((gj) this).field_s = new me(bo.field_D, var24);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_s);
        var25 = this.b((byte) 127);
        ((gj) this).field_i = new me(jd.field_c, var25);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_i);
        var26 = this.a(true, ((gj) this).field_y.field_o[((gj) this).field_p], jb.a(90, ((gj) this).field_y.field_n));
        ((gj) this).field_d = new me(kn.field_f, var26);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_d);
        this.a((byte) -113);
        var14 = 640;
        ((gj) this).field_m = this.f(-128);
        ((gj) this).field_c = this.d(-98);
        ((gj) this).field_f = param5;
        ((gj) this).field_t = (var14 + -((gj) this).field_m) / 2;
        this.e((byte) 52);
    }

    gj(int param0, int param1, boolean param2) {
        String[] var5 = null;
        int var9 = 0;
        String[] var10 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((gj) this).field_w = param0;
          ((gj) this).field_o = 0;
          ((gj) this).field_h = 10;
          if (!param2) {
            break L0;
          } else {
            ((gj) this).field_h = ((gj) this).field_h + 1;
            break L0;
          }
        }
        ((gj) this).field_n = new cn();
        ((gj) this).field_x = new me(((gj) this).field_h);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_x);
        var10 = new String[((gj) this).field_h];
        ((gj) this).field_k = new me(fi.field_b, var10, 1);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_k);
        var5 = new String[((gj) this).field_h];
        ((gj) this).field_l = new me(qf.field_o, var5, 2);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_l);
        var20 = this.b(-27531, ((gj) this).field_h);
        ((gj) this).field_s = new me(bo.field_D, var20);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_s);
        var21 = this.b(-27531, ((gj) this).field_h);
        ((gj) this).field_i = new me(jd.field_c, var21);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_i);
        var22 = this.b(-27531, ((gj) this).field_h);
        ((gj) this).field_d = new me(kn.field_f, var22);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_d);
        this.a((byte) -41);
        var9 = 640;
        ((gj) this).field_m = this.f(-124);
        ((gj) this).field_c = this.d(-102);
        ((gj) this).field_f = param1;
        ((gj) this).field_t = (-((gj) this).field_m + var9) / 2;
        this.e((byte) 52);
    }

    private final int a(int param0, boolean param1) {
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(1 != param0)) {
            return 0;
        }
        if (!(param0 != 2)) {
            return 1;
        }
        if (!(param0 != 3)) {
            return 2;
        }
        if (param1) {
            int discarded$0 = this.c(-56, 63);
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Return to game";
        field_a = "This game has been updated! Please reload this page.";
    }
}
