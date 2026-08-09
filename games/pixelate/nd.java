/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_a;
    static wo field_b;
    static int[] field_c;

    final static void a(byte param0) {
        mp.field_a.setLength(0);
        ce.field_d = 0;
        int var1 = 117 / ((param0 - -84) / 38);
    }

    final static void b(byte param0) {
        hd var5 = null;
        hd var6 = null;
        int var8 = 0;
        int var4_int = 0;
        int var7 = 0;
        int var9 = Pixelate.field_H ? 1 : 0;
        ln.field_m[7][3] = "mod_zeph";
        dd var10 = new dd(3, 3, 0, 0, 0, 262144, 0, 0, new hh[]{});
        dd var2 = new dd(3, 3, 0, 0, 0, 65536, 0, 0, al.field_c[4][3]);
        var2.field_d = 1;
        hd var3 = new hd(var10);
        var3.field_s = new boolean[]{true, false, false, true};
        for (var4_int = 0; 3 > var4_int; var4_int++) {
            var3.field_r[5 - -var4_int] = (byte) 1;
        }
        for (var4_int = 0; -4 < (var4_int ^ -1); var4_int++) {
            var3.field_r[var4_int + 10] = (byte)2;
        }
        var3.field_h = 2;
        var3.field_r[16] = (byte)2;
        var3.field_e = 2;
        var3.field_r[22] = (byte)2;
        var3.field_r[17] = (byte) 1;
        var3.field_r[21] = (byte)2;
        cf.field_C = new kk(var3, 460, 285);
        te.field_Qb = new al(var10, var3, cf.field_C);
        ug.field_q = new pb(var2, 150, 280);
        cf.field_C.a(0, 0, 0, (byte) -124, 0);
        ug.field_q.a(param0 + -18614);
        cf.field_u = new kf();
        cf.field_u.a(262144, -76);
        jf.field_c = new mj();
        dd var4 = new dd(3, 4, 0, 0, 0, 262144, 0, 0, al.field_c[3][4]);
        if (param0 != 37) {
            return;
        }
        try {
            var4.field_d = 1;
            var5 = new hd(var4);
            var6 = new hd(var4);
            var5.field_s = new boolean[]{false, false, true, false};
            var5.field_e = 3;
            var5.field_h = 1;
            var6.field_s = new boolean[]{false, true, true, false};
            var6.field_h = 1;
            var6.field_e = 1;
            for (var7 = 0; (var7 ^ -1) > -5; var7++) {
                var5.field_r[5 - -var7] = (byte) 1;
                var5.field_r[var7 + 10] = (byte)2;
            }
            var5.field_r[13] = (byte) 1;
            var5.field_r[14] = (byte) 1;
            var5.field_r[19] = (byte) 1;
            var5.field_r[18] = (byte) 1;
            var6.field_r[12] = (byte)2;
            var6.field_r[13] = (byte)2;
            var6.field_r[18] = (byte)2;
            var6.field_r[17] = (byte)2;
            var7 = 140;
            var8 = 370;
            g.field_r = new kk(var5, var7, var8);
            an.field_b = new kk(var6, 640 + -var7, var8);
            lj.field_g = new al(var4, var5, g.field_r);
            f.field_a = new al(var4, var6, an.field_b);
            cg.field_H = new pb(var4, 320, var8);
            g.field_r.a(0, 0, 0, (byte) -69, 0);
            an.field_b.a(0, 0, 0, (byte) -98, 0);
            cg.field_H.a(-18577);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nd.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        sc.field_h = rk.field_e;
        h.field_T = 10 + sc.field_h.c(we.field_o[20]);
        if (param0 != 3) {
            field_c = (int[]) null;
        }
        int var1 = sc.field_h.c(we.field_o[21]);
        if (var1 > h.field_T) {
            h.field_T = var1;
        }
        vd.a(true);
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 5) {
            nd.b((byte) 108);
        }
    }

    static {
        field_c = new int[16384];
        field_a = "Report abuse";
    }
}
