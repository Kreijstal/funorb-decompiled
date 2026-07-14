/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw extends qt {
    static boolean field_d;
    static String field_c;

    public static void c(byte param0) {
        if (param0 <= 110) {
            bw.c((byte) 4);
        }
        field_c = null;
    }

    final void a(boolean param0, ha param1) {
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
            return;
        }
        wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, param0);
        hc.field_e.a(hc.field_d, -1, -16777216, 150, 320, 0);
        int var3 = 45;
        int var4 = 0;
        while (-601 < (var3 ^ -1)) {
            var5 = param1;
            var6 = var3;
            var7 = up.field_c;
            wo.a(var7, 100, var6, 0, 1, var5, 250, 200, 1, true);
            if (((bw) this).field_a != var4) {
                hc.field_e.a(vd.field_a[var4], -1, -16777216, 260, 125 + var3, 0);
            } else {
                be.field_t.a(vd.field_a[var4], -1, -16777216, 258, var3 - -125 - 4, 0);
            }
            var4++;
            // wide iinc 3 300
        }
    }

    final static wb[] b(int param0) {
        wb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var1 = new wb[rl.field_n];
        var2 = 0;
        var3 = 126 / ((-69 - param0) / 52);
        L0: while (true) {
          if (var2 >= rl.field_n) {
            tl.a((byte) -46);
            return var1;
          } else {
            var4 = we.field_B[var2] * vg.field_k[var2];
            var22 = ag.field_d[var2];
            if (og.field_d[var2]) {
              var24 = fl.field_o[var2];
              var25 = new int[var4];
              var21 = var25;
              var17 = var21;
              var14 = var17;
              var7 = var14;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var4) {
                  var1[var2] = (wb) (Object) new mg(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var7[var8] = ic.a(iv.field_l[eb.a((int) var22[var8], 255)], eb.a((int) var24[var8], 255) << 596863480);
                  var8++;
                  continue L1;
                }
              }
            } else {
              var10 = new int[var4];
              var23 = var10;
              var7_int = 0;
              L2: while (true) {
                if (var7_int >= var4) {
                  var1[var2] = new wb(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var23);
                  var2++;
                  continue L0;
                } else {
                  var10[var7_int] = iv.field_l[eb.a((int) var22[var7_int], 255)];
                  var7_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        if (param0 != 5008) {
            field_c = null;
        }
        int var2 = (ko.field_p + -45) / 300;
        int var3 = (pi.field_e + -200) / 100;
        ((bw) this).field_a = var2 + 2 * var3;
        if (-251 > (ko.field_p - 45) % 300) {
            ((bw) this).field_a = -1;
        }
        if (!(-3 > ((bw) this).field_a)) {
            ((bw) this).field_a = -1;
        }
        if (hk.field_c == 1) {
            if (((bw) this).field_a != 0) {
                av.a(-7753, true, 7);
                ut.field_j = 0;
                ag.a(0, 0);
                ph.field_b.a(88);
                ((bw) this).b((byte) -128);
            } else {
                wt.a(1 + oh.field_e % 5, (byte) 56);
                ((bw) this).b((byte) -127);
            }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        rq.field_d = true;
        String var2 = "tuhstatbut";
        if (param0) {
            Object var6 = null;
            bw.a(true, (java.applet.Applet) null);
        }
        String var3 = "rvnadlm";
        long var4 = -1L;
        gj.a(var4, param1, true, var3, var2);
    }

    public bw() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "REASSIGN POWERUPS";
    }
}
