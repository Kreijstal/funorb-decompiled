/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ao {
    String field_c;
    int field_e;
    static boolean field_b;
    static int field_d;
    static t[] field_a;
    static int field_f;

    final static int b(int param0, int param1) {
        if (param0 != 2048) {
            int discarded$0 = ao.b(1, 62);
        }
        param1 = param1 & 8191;
        if ((param1 ^ -1) > -4097) {
            return -2049 >= (param1 ^ -1) ? -bm.field_j[param1 + -2048] : bm.field_j[-param1 + 2048];
        }
        return (param1 ^ -1) <= -6145 ? bm.field_j[param1 + -6144] : -bm.field_j[6144 - param1];
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
            return null;
        }
        return new java.net.Socket(((ao) this).field_c, ((ao) this).field_e);
    }

    final static li a(int param0, int param1, int param2, la param3, la param4) {
        if (param0 >= -75) {
            Object var6 = null;
            li discarded$0 = ao.a(77, 31, 80, (la) null, (la) null);
        }
        if (!nd.a(param1, param3, -1, param2)) {
            return null;
        }
        return ee.a(param4.a(param1, 100, param2), 7028);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        jg.a(param1, param0 ^ -8141, true, mc.field_l, 0, ga.field_c, vg.field_o);
        if (param0 != 8191) {
            return;
        }
        for (var2 = 0; var2 < vg.field_o; var2++) {
            lp.field_g[param1 + var2] = var2;
        }
        jg.a(param1 + param1, param0 ^ -8153, false, qd.field_g, param1, lj.field_d, param1 + vg.field_o);
        if (vg.field_o > param1) {
            vg.field_o = param1;
        }
    }

    public static void b(int param0) {
        if (param0 != 23116) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
