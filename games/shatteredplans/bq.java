/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bq {
    int field_b;
    int field_g;
    static String field_f;
    int field_i;
    int field_a;
    int field_c;
    int field_d;
    static dg field_h;
    static long field_e;

    final static void a(int param0, bc param1) {
        qr var5 = null;
        qr var6 = null;
        qr var3 = null;
        try {
            ke.field_i = id.a(2, param1, "basic", "display_name_changed");
            d.field_a = new am(0L, ih.field_g, ld.field_k, qc.field_u);
            wg.field_a = new am(0L, ih.field_g, vf.field_f, qg.field_o);
            cg.field_A = new qr(0L, (qr) null);
            rj.field_p = new qr(0L, ii.field_u);
            rj.field_p.field_y = 1;
            vn.field_t = new qr(0L, td.field_N, gd.field_c);
            mg.field_F = new qr(0L, vm.field_Cb, l.field_i);
            kh.field_Ib = new qr(0L, gn.field_w);
            cg.field_A.a(4, rj.field_p);
            cg.field_A.a(4, vn.field_t);
            cg.field_A.a(4, mg.field_F);
            cg.field_A.a(param0 ^ 27774, d.field_a);
            cg.field_A.a(4, kh.field_Ib);
            if (param0 != 27770) {
                field_h = (dg) null;
            }
            d.field_a.field_Db.field_zb.a(ii.field_u, false);
            var5 = d.field_a.field_Db.field_zb;
            var6 = var5;
            d.field_a.field_Db.field_zb.field_G = 1;
            var6.field_y = 1;
            wg.field_a.field_Db.field_zb.a(ii.field_u, false);
            var3 = wg.field_a.field_Db.field_zb;
            wg.field_a.field_Db.field_zb.field_G = 1;
            var3.field_y = 1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "bq.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1 = ed.field_f * ed.field_f;
        int var3 = 30 / ((param0 - 69) / 54);
        int var2 = var1 + -(pg.field_J * pg.field_J);
        int var4 = fl.field_f - -(var2 * (-fl.field_f + pc.field_m) / var1);
        tg.field_c.a(640, 120, (byte) 121, var4, tm.field_h);
        qc.a(-24 + pc.field_m, 0, tg.field_a, 3, 640, 5, qo.field_b);
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 1) {
            bc var2 = (bc) null;
            bq.a(30, (bc) null);
            field_h = null;
            return;
        }
        field_h = null;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    static {
        field_f = "you lost 0 fleets in the attack";
    }
}
