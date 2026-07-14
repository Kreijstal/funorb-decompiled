/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends dh {
    static rh field_n;
    private int field_o;
    static rh field_p;
    static int field_r;
    private qe field_m;
    static String field_q;

    public static void m(int param0) {
        field_p = null;
        if (param0 >= -104) {
            field_n = null;
        }
        field_q = null;
        field_n = null;
    }

    final int a(boolean param0, int param1) {
        int var6 = Terraphoenix.field_V;
        int var3 = ((uc) this).field_o >> 2146516483;
        if (param0) {
            field_q = null;
        }
        int var4 = 8 - (((uc) this).field_o & 7);
        int var5 = 0;
        ((uc) this).field_o = ((uc) this).field_o + param1;
        while (param1 > var4) {
            var3++;
            var5 = var5 + ((ai.field_a[var4] & ((uc) this).field_i[var3]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((uc) this).field_i[var3] >> -param1 + var4 & ai.field_a[param1]);
        } else {
            var5 = var5 + (ai.field_a[var4] & ((uc) this).field_i[var3]);
        }
        return var5;
    }

    final static void l(int param0, int param1) {
        int discarded$4 = m.a(1);
        if (param0 != 3795) {
            field_q = null;
        }
    }

    final static bg[] o(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        bg[] var1 = new bg[kf.field_b];
        for (var2 = 0; var2 < kf.field_b; var2++) {
            var1[var2] = new bg(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], qc.field_b[var2], wb.field_a);
        }
        if (param0 != -28336) {
            Object var4 = null;
            uc.b(-83, (String) null);
        }
        mj.a((byte) 113);
        return var1;
    }

    final static int j(byte param0) {
        if (param0 > -124) {
            field_p = null;
        }
        return (int)(1000000000L / dm.field_f);
    }

    final void k(int param0) {
        if (param0 != -1694261224) {
            return;
        }
        ((uc) this).field_o = ((uc) this).field_k * 8;
    }

    final static ci[] l(int param0) {
        ci[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = Terraphoenix.field_V;
        var1 = new ci[kf.field_b];
        var2 = param0;
        L0: while (true) {
          if (var2 >= kf.field_b) {
            mj.a((byte) 95);
            return var1;
          } else {
            var3 = rf.field_p[var2] * sb.field_m[var2];
            var23 = qc.field_b[var2];
            if (!aa.field_k[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new ci(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = wb.field_a[dg.a(255, (int) var23[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = ug.field_c[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (ci) (Object) new sg(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = ei.b(wb.field_a[dg.a((int) var23[var7], 255)], dg.a((int) var24[var7], 255) << -1694261224);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void b(int param0, String param1) {
        og.field_e = param1;
        int var2 = 111 / ((49 - param0) / 53);
    }

    final void b(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Terraphoenix.field_V;
        for (var5 = param0; var5 < param2; var5++) {
            ((uc) this).field_k = ((uc) this).field_k + 1;
            param1[param3 + var5] = (byte)(((uc) this).field_i[((uc) this).field_k] + -((uc) this).field_m.a(112));
        }
    }

    final void a(int[] param0, int param1) {
        if (param1 != 16888) {
            return;
        }
        ((uc) this).field_m = new qe(param0);
    }

    final void k(int param0, int param1) {
        if (param0 != -17410) {
            return;
        }
        ((uc) this).field_k = ((uc) this).field_k + 1;
        ((uc) this).field_i[((uc) this).field_k] = (byte)(param1 + ((uc) this).field_m.a(65));
    }

    final void n(int param0) {
        ((uc) this).field_k = (((uc) this).field_o + 7) / param0;
    }

    uc(byte[] param0) {
        super(param0);
    }

    uc(int param0) {
        super(param0);
    }

    final int a(boolean param0) {
        if (param0) {
            return 72;
        }
        ((uc) this).field_k = ((uc) this).field_k + 1;
        return ((uc) this).field_i[((uc) this).field_k] - ((uc) this).field_m.a(116) & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new rh(8, 0, 4, 1);
        field_r = -1;
        field_p = new rh(7, 0, 1, 1);
        field_q = "Create a free account to save your game.<br>Saved games can be continued from the title menu.<br><br><col=ff0000>If you do not save your game, your progress will be lost when you leave.";
    }
}
