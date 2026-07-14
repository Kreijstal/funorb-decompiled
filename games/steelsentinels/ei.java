/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends ia {
    private String field_w;
    static String field_u;
    static int field_t;
    static gh field_n;
    static String field_x;
    static int field_q;
    static gh field_o;
    static gh field_p;
    private boolean field_s;
    static String field_v;
    static String field_r;

    ei(jf param0) {
        super(param0);
        ((ei) this).field_s = false;
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != 1) {
            int discarded$0 = ei.a(83, 71, true);
            field_x = null;
            field_v = null;
            field_r = null;
            field_p = null;
            field_u = null;
            field_o = null;
            return;
        }
        field_x = null;
        field_v = null;
        field_r = null;
        field_p = null;
        field_u = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = SteelSentinels.field_G;
        pb.h(param0, param1, param2, param3, 12105914);
        pb.e(1 + param0, param1 - -1, -2 + param2, param3 + -2, 16251129, 10461345);
        int var6 = -126 / ((param4 - 69) / 50);
        int var5 = 64;
        for (var7 = 1; var7 <= 6; var7++) {
            pb.h(var7 + param0, var7 + param1, -(var7 * 2) + param2, -(var7 * 2) + param3, 16251129, var5);
            var5 = var5 >> 282071745;
        }
    }

    final String a(int param0, String param1) {
        e var4 = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = va.a(var5, -1);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param1.equals((Object) (Object) ((ei) this).field_w)) {
            var4 = b.a(false, param1);
            if (var4 == null) {
                return null;
            }
            if (var4.field_e != null) {
                return null;
            }
            ((ei) this).field_s = var4.field_d;
            ((ei) this).field_w = param1;
        }
        if (param0 != 100) {
            return null;
        }
        if (!(((ei) this).field_s)) {
            return fg.field_Qb;
        }
        return hf.field_d;
    }

    final vd a(String param0, int param1) {
        e var3 = null;
        CharSequence var4 = (CharSequence) (Object) param0;
        if (!(m.a(var4, (byte) 127))) {
            return fa.field_d;
        }
        if (param1 != -1) {
            return null;
        }
        if (!(param0.equals((Object) (Object) ((ei) this).field_w))) {
            var3 = b.a(false, param0);
            if (var3 == null) {
                return ma.field_Y;
            }
            if (null != var3.field_e) {
                return ma.field_Y;
            }
            ((ei) this).field_w = param0;
            ((ei) this).field_s = var3.field_d;
        }
        return ((ei) this).field_s ? vf.field_b : fa.field_d;
    }

    final static void a(int param0, java.applet.Applet param1) {
        ic.a(-128, "", param1);
        if (param0 != 0) {
            field_r = null;
            pf.a(param1, 63);
            return;
        }
        pf.a(param1, 63);
    }

    final void d(int param0) {
        if (param0 < 63) {
            return;
        }
        ((ei) this).field_w = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (-1 == (param0 ^ -1)) {
            var2 = sg.field_c;
        }
        if (!(param0 != param1)) {
            var2 = pm.field_Z;
        }
        if (!(param0 != 2)) {
            var2 = fi.field_y;
        }
        return var2;
    }

    final static wk[] a(int param0, wk[] param1) {
        int var2 = 0;
        wk var3 = null;
        int var4 = SteelSentinels.field_G;
        for (var2 = param0; param1.length > var2; var2++) {
            var3 = param1[var2];
            param1[var2].field_H = 0;
            var3.field_D = 0;
            param1[var2].field_z = param1[var2].field_A;
            param1[var2].field_B = param1[var2].field_F;
        }
        return param1;
    }

    final static void a(int param0, byte param1, int param2) {
        kj var3 = mm.field_g;
        var3.a(param2, (byte) -117);
        var3.a((byte) 127, 3);
        if (param1 != -23) {
            field_v = null;
            var3.a((byte) 121, 10);
            var3.d(param0, 98);
            return;
        }
        var3.a((byte) 121, 10);
        var3.d(param0, 98);
    }

    final static int a(int param0, int param1, boolean param2) {
        if (!(null != bc.field_ub)) {
            return -1;
        }
        if (!param2) {
            return 54;
        }
        if (aj.field_s > param1) {
            if (rn.field_u > param1) {
                return -1;
            }
            if (param1 >= rn.field_u + bc.field_ub.field_A) {
                return -1;
            }
            if (od.field_m <= param0) {
                if (bc.field_ub.field_F + od.field_m <= param0) {
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        if (aj.field_s + bc.field_ub.field_A <= param1) {
            if (rn.field_u <= param1) {
                if (param1 < rn.field_u + bc.field_ub.field_A) {
                    if (od.field_m <= param0) {
                        if (bc.field_ub.field_F + od.field_m <= param0) {
                            return -1;
                        }
                        return 1;
                    }
                }
            }
            return -1;
        }
        if (mc.field_a <= param0) {
            if (mc.field_a - -bc.field_ub.field_F > param0) {
                return 0;
            }
        }
        if (rn.field_u <= param1) {
            if (param1 < rn.field_u + bc.field_ub.field_A) {
                if (od.field_m <= param0) {
                    if (bc.field_ub.field_F + od.field_m <= param0) {
                        return -1;
                    }
                    return 1;
                }
            }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Quick Chat lobby";
        field_x = "Invite only";
        field_t = 2;
        field_v = "Please select options in the following rows:  ";
        field_r = "Remove <%0> from friend list";
    }
}
