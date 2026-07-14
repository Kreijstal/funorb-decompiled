/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_b;
    static int[] field_d;
    static String field_a;
    static java.awt.Image field_e;
    static String[] field_c;

    final static ri a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = param1.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param0 != -58) {
            return null;
        }
        return n.field_b;
    }

    final static void a(boolean param0, int param1) {
        tn.field_Ob = !param0 ? new i(ec.field_b, bk.field_M) : new i(ab.field_r, vc.field_c);
        hl.field_m = new kc(0L, (kc) null);
        hl.field_m.a((kc) (Object) tn.field_Ob.field_c, 89);
        int var2 = 34 / ((param1 - 24) / 48);
        hl.field_m.a(mo.field_o, 55);
        nl.field_Fb = new kc(0L, mf.field_d);
        gk.field_g = new kc(0L, (kc) null);
        nl.field_Fb.a(hf.field_t, 61);
        nl.field_Fb.a(gk.field_g, 89);
        gk.field_g.a(mj.field_s, 25);
        gk.field_g.a(gj.field_d, 43);
        io.a(125, param0);
    }

    final static void a(int param0, int param1) {
        ab var2 = he.field_e;
        var2.b((byte) -66, param0);
        var2.f(1, (byte) -127);
        var2.f(param1, (byte) -44);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
        if ((mj.field_p ^ -1) > -7) {
            rk.field_O.c(param0 ^ -4207, -1);
        }
    }

    final static void a(byte param0) {
        if (param0 != -85) {
            return;
        }
        se.field_H = new kc(0L, (kc) null);
        if (fc.field_a) {
            se.field_H.a(kg.field_c, 14);
        }
        se.field_H.a(mj.field_s, 39);
        aj.field_h = new i(lj.field_p, se.field_H);
        k.field_d = new kc(0L, (kc) null);
        k.field_d.a((kc) (Object) aj.field_h.field_c, param0 ^ -74);
        k.field_d.a(ii.field_b, param0 ^ -54);
        ao.a((byte) -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Gives you and your minions extra damage resistance";
        field_d = new int[8192];
    }
}
