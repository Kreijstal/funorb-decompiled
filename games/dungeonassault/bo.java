/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends ok {
    static eh field_Lb;
    String field_Nb;
    static String field_Mb;
    String field_Hb;
    static cn field_Kb;
    static wm field_Jb;
    int field_Ib;
    static String[] field_Gb;

    final static void a(int param0, gn param1, int param2, int param3) {
        int var7 = 0;
        String var8 = null;
        int var9 = DungeonAssault.field_K;
        if (!(param1 != null)) {
            return;
        }
        int var4 = param2;
        if (!(null == param1.field_b)) {
            int discarded$0 = ne.field_c.a(param1.field_b, param3 + 3, var4, 194, 0, 0, -1, 1, 0, ne.field_c.field_H);
            var4 = var4 + param1.field_g;
            var4 += 7;
            gf.b(param3, var4, 200, 0);
            var4 += 5;
        }
        String[] var5 = jn.a(param1.field_f, new int[1], -65, (se) (Object) la.field_b);
        var4 = var4 + (param0 + la.field_b.field_H);
        String[] var6 = var5;
        for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            la.field_b.b(var8, param3 - -3, var4, 0, -1);
            var4 = var4 + la.field_b.field_H;
        }
    }

    bo() {
        super(0L, (ok) null);
    }

    final static void h(int param0) {
        int var1 = 0;
        if (ec.field_k == null) {
          id.field_i = mk.a(3, (byte) 34);
          mi.field_e = mk.a(4, (byte) 34);
          hj.field_Z = bg.a(true, 9, false, false, true);
          np.field_A = mk.a(10, (byte) 34);
          kf.field_p = bg.a(true, 11, false, false, true);
          sb.field_a = bg.a(true, 12, false, false, true);
          ia.field_W = mk.a(13, (byte) 34);
          ll.field_r = mk.a(14, (byte) 34);
          tl.field_k = mk.a(15, (byte) 34);
          bl.field_t = mk.a(16, (byte) 34);
          be.field_s = new wk(75);
          var1 = -17 / ((3 - param0) / 44);
          be.field_s.a(sa.field_w, "basic", qk.field_c, uc.field_I, -108);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, uc.field_I, -110);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, gh.field_c, -83);
          be.field_s.a(qk.field_c, 237, sa.field_w, hj.field_Z);
          be.field_s.a(qk.field_c, 237, sa.field_w, sb.field_a);
          be.field_s.a(uc.field_L, 237, nb.field_b, kf.field_p);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, uc.field_I, -109);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, gh.field_c, -101);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, uc.field_I, -93);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, gh.field_c, -128);
          be.field_s.a(rf.field_L, 237, mp.field_c, np.field_A);
          be.field_s.a(wo.field_h, 237, rl.field_k, ia.field_W);
          be.field_s.a(wo.field_h, 237, rl.field_k, ll.field_r);
          be.field_s.a(id.field_f, 237, dg.field_P, tl.field_k);
          be.field_s.a(id.field_f, 237, dg.field_P, bl.field_t);
          be.field_s.a(fg.field_m, 237, kj.field_m, id.field_i);
          be.field_s.a(fg.field_m, 237, kj.field_m, mi.field_e);
          return;
        } else {
          ec.a(ec.field_k, false);
          ec.field_k = null;
          nf.d(0);
          id.field_i = mk.a(3, (byte) 34);
          mi.field_e = mk.a(4, (byte) 34);
          hj.field_Z = bg.a(true, 9, false, false, true);
          np.field_A = mk.a(10, (byte) 34);
          kf.field_p = bg.a(true, 11, false, false, true);
          sb.field_a = bg.a(true, 12, false, false, true);
          ia.field_W = mk.a(13, (byte) 34);
          ll.field_r = mk.a(14, (byte) 34);
          tl.field_k = mk.a(15, (byte) 34);
          bl.field_t = mk.a(16, (byte) 34);
          be.field_s = new wk(75);
          var1 = -17 / ((3 - param0) / 44);
          be.field_s.a(sa.field_w, "basic", qk.field_c, uc.field_I, -108);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, uc.field_I, -110);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, gh.field_c, -83);
          be.field_s.a(qk.field_c, 237, sa.field_w, hj.field_Z);
          be.field_s.a(qk.field_c, 237, sa.field_w, sb.field_a);
          be.field_s.a(uc.field_L, 237, nb.field_b, kf.field_p);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, uc.field_I, -109);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, gh.field_c, -101);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, uc.field_I, -93);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, gh.field_c, -128);
          be.field_s.a(rf.field_L, 237, mp.field_c, np.field_A);
          be.field_s.a(wo.field_h, 237, rl.field_k, ia.field_W);
          be.field_s.a(wo.field_h, 237, rl.field_k, ll.field_r);
          be.field_s.a(id.field_f, 237, dg.field_P, tl.field_k);
          be.field_s.a(id.field_f, 237, dg.field_P, bl.field_t);
          be.field_s.a(fg.field_m, 237, kj.field_m, id.field_i);
          be.field_s.a(fg.field_m, 237, kj.field_m, mi.field_e);
          return;
        }
    }

    public static void c(byte param0) {
        field_Lb = null;
        field_Mb = null;
        field_Kb = null;
        if (param0 != -36) {
            field_Jb = null;
            field_Gb = null;
            field_Jb = null;
            return;
        }
        field_Gb = null;
        field_Jb = null;
    }

    final static void g(int param0) {
        mc.a((byte) 86, 8, gb.field_e);
        if (param0 != 1) {
            field_Gb = null;
            if (ve.a(false)) {
                return;
            }
            mc.a((byte) 37, 1, in.field_B);
            return;
        }
        if (!ve.a(false)) {
            mc.a((byte) 37, 1, in.field_B);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "Zealot";
        field_Gb = new String[]{"Harden Raider", "The <%0> imbues another raider with the resilience of oak, doubling their <%defence> in the next room. (Single use)"};
    }
}
