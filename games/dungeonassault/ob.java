/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ok {
    static int field_hc;
    static int field_Sb;
    static int field_Qb;
    static int field_nc;
    static int field_dc;
    static int field_Lb;
    static int field_Hb;
    static int field_Gb;
    static int field_Zb;
    static int field_Ob;
    static int field_gc;
    static int field_ac;
    static int[] field_cc;
    static int field_Ub;
    static int field_lc;
    static int field_Vb;
    static String[] field_oc;
    static int field_Mb;
    static int field_jc;
    ok field_ic;
    static int field_bc;
    static int field_kc;
    static int field_ec;
    static int field_pc;
    static int field_Ib;
    static int field_mc;
    static int field_Nb;
    static int field_Pb;
    static int field_Jb;
    ok field_Tb;
    static int field_Wb;
    static int field_fc;
    static char field_Yb;
    static String field_Kb;
    static String[] field_Rb;
    static ug field_Xb;

    final static void a(cn param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          if (param4) {
            break L0;
          } else {
            var12 = null;
            ob.a((byte) -102, (nh) null);
            break L0;
          }
        }
        L1: {
          param1 = param1 + param0.field_w;
          param3 = param3 + param0.field_A;
          var5 = gf.field_i * param3 + param1;
          var6 = 0;
          var7 = param0.field_v;
          var8 = param0.field_y;
          var9 = -var8 + gf.field_i;
          if (param3 >= gf.field_f) {
            break L1;
          } else {
            var11 = gf.field_f + -param3;
            param3 = gf.field_f;
            var5 = var5 + var11 * gf.field_i;
            var7 = var7 - var11;
            var6 = var6 + var8 * var11;
            break L1;
          }
        }
        L2: {
          var10 = 0;
          if (gf.field_e < param3 - -var7) {
            var7 = var7 - (-gf.field_e + var7 + param3);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 < gf.field_j) {
            var11 = gf.field_j + -param1;
            var8 = var8 - var11;
            var10 = var10 + var11;
            var6 = var6 + var11;
            param1 = gf.field_j;
            var5 = var5 + var11;
            var9 = var9 + var11;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 - -var8 <= gf.field_h) {
            break L4;
          } else {
            var11 = var8 + param1 - gf.field_h;
            var10 = var10 + var11;
            var9 = var9 + var11;
            var8 = var8 - var11;
            break L4;
          }
        }
        if (0 < var8) {
          if (0 < var7) {
            o.a(var8, 0, gf.field_b, var6, param0.field_B, var7, param2, var5, 0, var9, var10);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    ob(long param0, ok param1, ok param2, ok param3, cn param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((ob) this).field_Tb = new ok(0L, param2);
            ((ob) this).field_Tb.field_L = param4;
            ((ob) this).a(((ob) this).field_Tb, (byte) 124);
        }
        if (param5 != null) {
            ((ob) this).field_ic = new ok(0L, param3, param5);
            ((ob) this).a(((ob) this).field_ic, (byte) 124);
        }
        ((ob) this).e(30509);
    }

    final static void a(byte param0, nh param1) {
        int var3 = 0;
        int var4 = 0;
        cn var2 = new cn(param1.a("final_frame.jpg", "", (byte) -123), (java.awt.Component) (Object) c.field_h);
        if (param0 >= -40) {
            ob.g(119);
            var3 = var2.field_y;
            var4 = var2.field_v;
            ie.a(99);
            dm.field_g = new cn(var3, 3 * var4 / 4);
            dm.field_g.e();
            var2.c(0, 0);
            lb.field_C = new cn(var3, -dm.field_g.field_v + var4);
            lb.field_C.e();
            var2.c(0, -dm.field_g.field_v);
            lb.field_C.field_A = dm.field_g.field_v;
            ti.c(true);
            return;
        }
        var3 = var2.field_y;
        var4 = var2.field_v;
        ie.a(99);
        dm.field_g = new cn(var3, 3 * var4 / 4);
        dm.field_g.e();
        var2.c(0, 0);
        lb.field_C = new cn(var3, -dm.field_g.field_v + var4);
        lb.field_C.e();
        var2.c(0, -dm.field_g.field_v);
        lb.field_C.field_A = dm.field_g.field_v;
        ti.c(true);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param2.getGraphics();
            k.field_h.a(param0, true, var4, param3);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
        if (param1 > -76) {
            Object var5 = null;
            ob.a((cn) null, -84, 120, -93, false);
            return;
        }
    }

    public static void g(int param0) {
        if (param0 != 16) {
            return;
        }
        field_Rb = null;
        field_cc = null;
        field_Xb = null;
        field_Kb = null;
        field_oc = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param2 != -102) {
            field_hc = -92;
            for (var5 = 0; var5 < param3; var5++) {
                te.a(param0, var5 + param1, param4, ji.field_F);
            }
            return;
        }
        for (var5 = 0; var5 < param3; var5++) {
            te.a(param0, var5 + param1, param4, ji.field_F);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = 12;
        field_hc = 1;
        field_Lb = 13;
        field_Hb = 10;
        field_Zb = 18;
        field_gc = 25;
        field_Vb = 17;
        field_lc = 9;
        field_Gb = 22;
        field_Mb = 2;
        field_dc = 15;
        field_nc = 6;
        field_Ub = 16;
        field_oc = new String[]{"Fragility", "The strange chemicals the <%0> uses to fuel his mindless rage have their own cost; blows that would otherwise only stun a raider are always fatal to the <%0>."};
        field_ac = 28;
        field_jc = 8;
        field_kc = 7;
        field_Sb = 20;
        field_Ob = 11;
        field_Ib = 21;
        field_cc = new int[field_ac];
        field_bc = 26;
        field_Pb = 5;
        field_ec = 27;
        field_Jb = 19;
        field_pc = 24;
        field_Nb = 4;
        field_fc = 0;
        field_mc = 14;
        field_Wb = 3;
        s.a(72, field_fc, 8);
        s.a(72, field_Jb, 8);
        s.a(72, field_pc, 8);
        s.a(72, field_hc, 0);
        s.a(72, field_Mb, 40);
        s.a(72, field_Wb, 16);
        s.a(72, field_Nb, 8);
        s.a(72, field_Pb, 16);
        s.a(72, field_nc, 160);
        s.a(72, field_Ib, 160);
        s.a(72, field_kc, 0);
        s.a(72, field_jc, 0);
        s.a(72, field_lc, 16);
        s.a(72, field_Gb, 16);
        s.a(72, field_Hb, 0);
        s.a(72, field_Ob, 0);
        s.a(72, field_Qb, 0);
        s.a(72, field_Lb, 4);
        s.a(72, field_mc, 0);
        s.a(72, field_dc, 8);
        s.a(72, field_Ub, 16);
        s.a(72, field_Vb, 0);
        s.a(72, field_Sb, 0);
        s.a(72, field_bc, 0);
        s.a(72, field_gc, 0);
        s.a(72, field_ec, 0);
        s.a(72, field_Zb, 16);
        field_Kb = "OFF";
        field_Rb = new String[]{"Master of Chaos", "The <%0> is able to harness the raw power of chaos, using the energy released by the sacrifice of another raider to overcome any room. (Multiple use)"};
    }
}
