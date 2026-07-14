/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends nm {
    static boolean field_l;
    static jp[] field_j;
    int field_m;
    byte[] field_i;
    static boolean field_k;

    final static int a(nc param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        int var4 = 0;
        if (!param2) {
            field_k = false;
        }
        for (var5 = param1; param3 > var5; var5++) {
            var4 = var4 | param0.field_c[var5].field_i;
        }
        return var4;
    }

    public static void a(byte param0) {
        field_j = null;
        int var1 = -16 % ((62 - param0) / 48);
    }

    final static void a(mf param0, wp param1, mf param2, mf param3, mf param4, int param5, mf param6) {
        int var7 = 0;
        int var8 = BrickABrac.field_J ? 1 : 0;
        BrickABrac.field_I = param4;
        i.field_m = param3;
        if (param5 != -10) {
            field_j = null;
        }
        mh.field_lb = param2;
        l.field_m = param1;
        og.field_gc = param0;
        ji.field_a = param6;
        for (var7 = 0; (var7 ^ -1) > -3; var7++) {
            ip.field_s.a((nm) (Object) new pb(960, 480), (byte) 3);
        }
        for (var7 = 0; var7 < 2; var7++) {
            cr.field_N.a((nm) (Object) new pb(1280, 480), (byte) 3);
        }
    }

    final static boolean a(int param0, int param1, mf param2, int param3) {
        if (param0 >= -87) {
            field_j = null;
        }
        byte[] var5 = param2.a(param1, param3, 4);
        byte[] var4 = var5;
        if (!(var5 != null)) {
            return false;
        }
        eh.a(var5, false);
        return true;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = null != nl.field_f ? 1 : 0;
        if (-10 == dc.field_b) {
            if (!(!kb.a(kb.field_Zb, -3, ig.field_K, hb.field_z, r.field_x))) {
                if (-3 != r.field_x) {
                    if (!(var3 == 0)) {
                        return false;
                    }
                }
                return th.a(hb.field_z, kb.field_Zb, r.field_x, false, ig.field_K);
            }
        }
        if (!(10 != dc.field_b)) {
            if (var3 != 0) {
                return false;
            }
            mq.a(4252);
            return true;
        }
        if (dc.field_b == param1) {
            if (!bo.field_l) {
                return false;
            }
            if (wd.field_z == -3) {
                if (!ud.a(gn.field_E, ba.field_z, param1 ^ -106)) {
                    return false;
                }
            }
            if (-3 != wd.field_z) {
                if (var3 != 0) {
                    return false;
                }
            }
            if (cd.a(param1 + -138)) {
                Object var4 = null;
                c.a(ep.field_k, ba.field_z, (byte) -117, wd.field_z, param2, (String) null);
            }
            return true;
        }
        return false;
    }

    final static void a(int param0) {
        rj.field_c.b((byte) 126, (oc) (Object) new he());
        int var1 = 48 % ((param0 - 32) / 62);
    }

    private ln() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
    }
}
