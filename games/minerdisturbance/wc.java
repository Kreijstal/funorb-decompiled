/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc implements uj {
    static boolean field_b;
    static ea[][] field_c;
    static int[] field_a;
    static String field_d;

    final static boolean b(byte param0) {
        int var1 = -108 / ((-67 - param0) / 51);
        return !wm.field_f.a(0) ? true : false;
    }

    public final void a(boolean param0) {
        if (param0) {
            field_b = true;
        }
        tb.field_a = 3;
        ha.field_e = 0;
    }

    final static ea[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        ea[] var1 = new ea[sc.field_d];
        for (var2 = 0; sc.field_d > var2; var2++) {
            var3 = ng.field_e[var2] * qk.field_b[var2];
            var4 = db.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = af.field_p[c.a((int) var4[var6], 255)];
            }
            var1[var2] = new ea(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], var5);
        }
        if (param0 > -27) {
            ea[] discarded$0 = wc.a(-122);
        }
        ec.a((byte) 96);
        return var1;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        if (af.field_u < 10) {
            var3 = 0;
            if (bh.field_cb) {
                bh.field_cb = false;
                var3 = 1;
            }
            MinerDisturbance.a(qm.field_j, (byte) 36, k.g(-22962), var3 != 0, te.a(-105));
        } else {
            if (!fe.j(-63)) {
                eh.d();
                pd.a(10853, 320, 240);
                cl.a(param1, 0, 0, 310);
            } else {
                if (fh.field_b == 0) {
                    g.a(false, -47, param2);
                    cl.a(param1, 0, 0, 310);
                } else {
                    mf.a(-752960408, param1);
                }
            }
        }
        if (param0 != 240) {
            field_d = null;
        }
    }

    public final String a(byte param0) {
        int var2 = 98 % ((param0 - -33) / 62);
        return "Clear All Fluid";
    }

    final static void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        int var1 = mg.field_e[0];
        for (var2 = 1; var2 < mg.field_e.length; var2++) {
            var3 = mg.field_e[var2];
            ai.a(ta.field_d, var2 << 594636836, ta.field_d, var1, var3);
            var1 = var1 + var3;
        }
        if (param0 != -29) {
            field_a = null;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 0) {
            boolean discarded$0 = wc.b(false);
        }
        field_a = null;
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_c = new ea[2][];
        field_b = false;
        field_d = "This pre-dug shaft is a must-have for the lazy miner. Simply take the shortest route to the bottom of the volcano and beat your friends to the loot.";
    }
}
