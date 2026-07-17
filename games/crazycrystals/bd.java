/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bd extends ij {
    static dl[] field_n;
    static String field_l;
    static volatile long field_m;

    final static void a(byte param0, boolean param1) {
        int var3 = 0;
        uo.field_o = uo.field_o + 1;
        int var2 = rc.field_a.size();
        if (jo.field_o == 1) {
            if (mo.field_l == 0) {
                var2 = 15;
                if (!(var2 <= uo.field_o)) {
                    fl.field_g = fp.field_a;
                    sb.field_F = b.field_a;
                    sm.field_e = we.field_h;
                    nh.field_F = je.field_j;
                    ll.a(-105, true, param1);
                    ue.field_c = true;
                    return;
                }
                uh.field_n = true;
                go.field_i = true;
                uo.field_o = uo.field_o - 1;
                return;
            }
            var3 = ke.field_b[jo.field_o] + 1;
            if (var2 <= var3) {
                if (!(var2 <= uo.field_o)) {
                    fl.field_g = fp.field_a;
                    sb.field_F = b.field_a;
                    sm.field_e = we.field_h;
                    nh.field_F = je.field_j;
                    ll.a(-105, true, param1);
                    ue.field_c = true;
                    return;
                }
                uh.field_n = true;
                go.field_i = true;
                uo.field_o = uo.field_o - 1;
                return;
            }
            var2 = var3;
        }
        if (!(var2 <= uo.field_o)) {
            fl.field_g = fp.field_a;
            sb.field_F = b.field_a;
            sm.field_e = we.field_h;
            nh.field_F = je.field_j;
            ll.a(-105, true, param1);
            ue.field_c = true;
            return;
        }
        uh.field_n = true;
        go.field_i = true;
        uo.field_o = uo.field_o - 1;
    }

    public static void e() {
        field_n = null;
        field_l = null;
    }

    final static void a(db param0, byte[] param1, wj[] param2) {
        try {
            ga.field_L = param0;
            io.field_I[16] = mh.field_j;
            io.field_I[17] = ti.field_j;
            int discarded$0 = 192;
            cc.a(8438015, (java.applet.Applet) (Object) fe.field_g, (byte) -121, 2121856, io.field_I);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "bd.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + 8 + 41);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (!(0 >= param0)) {
            var2 = 1;
            if (param0 > 65535) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (param0 > 255) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (param0 > 15) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (param0 > 3) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(param0 <= 1)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (param0 < -256) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (-16 > param0) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (!(-2 <= param0)) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This is a bomb.<br><br>Bombs blow up when<br><br>- you drop them;<br>- they get crushed;<br>- another bomb explodes<br>  nearby.<br><br>Use them to clear the<br>way. Stand back!";
        field_m = 0L;
    }
}
