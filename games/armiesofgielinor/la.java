/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_b;
    private boolean field_h;
    static String field_e;
    private gd field_c;
    private vj field_a;
    int field_f;
    static int field_d;
    static java.applet.Applet field_g;

    private final int c(byte param0) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = aw.field_j[((la) this).field_f].length;
        for (var3 = 0; var2 > var3; var3++) {
            if (!((aw.field_j[((la) this).field_f][var3][0] ^ -1) > -1)) {
                return var3;
            }
        }
        if (param0 != 82) {
            return 111;
        }
        return 0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 >= -106) {
            la.d((byte) -100);
        }
    }

    final static void b(int param0) {
        if (param0 != -26887) {
            return;
        }
        rs.field_t = 0;
        hf.field_c = true;
    }

    final static void d(byte param0) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var6 = jp.field_g;
        int[] var1 = var6;
        int var2 = 0;
        int var3 = var6.length;
        while (var3 > var2) {
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
        }
        int var4 = 57 % ((-6 - param0) / 49);
    }

    final static void a(boolean param0, int param1, int param2) {
        tg var4 = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        hl var3 = sm.a(param2 + 76, param1, param0);
        if (var3 != null) {
            tn.field_Z.a(23899, false);
            var4 = tn.field_Z;
            var5_ref = wp.field_y;
            var4.field_i.a(5, var5_ref, (byte) -109);
            var4 = tn.field_Z;
            var5 = iu.field_t;
            var6 = ur.field_z;
            var4.field_i.a(0, var6, 0, (byte) -118, var5);
        }
        tr.a(-115, param0, param1);
        if (param2 != -1) {
            field_g = null;
        }
    }

    private final void a(int param0) {
        int var2 = ((la) this).field_a.field_i >> -683580368;
        if (param0 < 68) {
            this.a(91);
        }
        wp var3 = we.a(var2, true);
        io.a(var3, (byte) -34);
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        if (!(((la) this).field_b == param1)) {
            if (-1 != param1) {
                if ((param1 ^ -1) <= -1) {
                    if (param1 > -10) {
                        var3 = 1;
                        ((la) this).field_b = param1;
                    }
                }
            }
        }
        if (0 != ((la) this).field_b) {
            // iflt L67
            // if_icmple L67
        } else {
            var3 = 1;
            ((la) this).field_b = 0;
        }
        if (var3 != 0) {
            if (!((aw.field_j[((la) this).field_f][((la) this).field_b][0] ^ -1) <= -1)) {
                ((la) this).field_b = this.c((byte) 82);
            }
            this.c(param0 ^ -126);
        }
        if (param0 != -126) {
            ((la) this).field_f = -111;
        }
    }

    final static void b(byte param0, int param1) {
        if (param0 != 30) {
            la.b(104);
        }
        lk.field_h = 0;
        am.field_D = new int[3];
        an.field_F = new mo[param1 * 15];
        vj.field_g = param1;
    }

    final void a(byte param0) {
        int var3 = -30 / ((-31 - param0) / 54);
        int var2 = 0;
        this.a((byte) -126, var2);
        boolean discarded$0 = ((la) this).field_a.a(-122);
        this.a(73);
    }

    la(int param0) {
        ((la) this).field_a = new vj(1);
        ((la) this).field_f = param0;
        if (-44 == (param0 ^ -1)) {
            param0 = 77;
        }
        ((la) this).field_c = (gd) (Object) mn.field_k[param0][0];
        ((la) this).field_h = nh.field_D[param0];
        ((la) this).field_b = 0;
        this.c(0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var9 = 0;
        int var8 = 0;
        int var7 = 0;
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1 = param1 | param1 << 185101192;
        if (param5) {
            field_g = null;
        }
        int var6 = param1 ^ param1 >> 2049244769;
        for (var9 = 0; var9 < 4; var9++) {
            var8 = bm.field_y[var9][1] + (param0 - -(3 & param1) + -64);
            var7 = -44 + bm.field_y[var9][0] + (param3 + (7 & var6));
            if (var9 == 0) {
                nr.field_c[16 + param1 % 9].b(var7, var8 + -bm.field_y[var9][1], param4, param2);
            } else {
                nr.field_c[param1 % 9 - -25].b(var7, var8, param4, param2);
            }
            param1 = param1 >> 1;
            var6 = var6 >> 1;
        }
    }

    private final void c(int param0) {
        if (-1 >= (((la) this).field_b ^ -1)) {
            // if_icmpge L58
            ((la) this).field_a.a(-1, ck.field_e[sf.field_P[((la) this).field_f]][aw.field_j[((la) this).field_f][((la) this).field_b][0]]);
        } else {
            ((la) this).field_a.a(param0 ^ -1, ck.field_e[sf.field_P[((la) this).field_f]][0]);
        }
        if (param0 != 0) {
            this.a((byte) 11, -94);
        }
        this.a(81);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        gd var15 = (gd) (Object) ((la) this).field_a.a(false, true, false, (kk) (Object) ((la) this).field_c);
        if (!(75 != ((la) this).field_f)) {
            var15.b(250, 250, 250);
        }
        if (!((((la) this).field_f ^ -1) != -77)) {
            var15.b(512, 512, 512);
        }
        int var8 = 0;
        int var9 = 2044 & param3 << -1502587230;
        if (param4 <= 66) {
            ((la) this).field_f = 63;
        }
        int var10 = 0;
        tm.c(param2, param1);
        int var11 = 20;
        int var12 = 0;
        int var13 = 500;
        int var14 = 250 - (((la) this).field_h ? 100 * param0 / 128 : 0);
        var14 = var14 + wv.field_g[((la) this).field_f];
        var15.b(param0, param0, param0);
        if (param5) {
            fh.a(124, var15);
        }
        var15.a(var8, var9, var10, var11, var12, var14, var13);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter multiplayer lobby";
    }
}
